package kr.ac.kopo.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class UserList implements UserListIF {
	private List<User> list = new LinkedList<User>(); // 회원리스트
	private User session = new User(null, null); // 현재 세션

	Method m = new Method();

	BookList bl = new BookList();

	// 메모리에 정보 읽어오기(시작)
	@Override
	public void readAllUser() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("iodata/user.txt");
			dis = new DataInputStream(fis);

			@SuppressWarnings("deprecation")
			String data = dis.readLine(); // UFT로 읽으면 자꾸 이상한 문자가 생김.

			String[] strArr = data.split("/");

			for (int i = 0; i < strArr.length; i++) {
				String[] arr = strArr[i].split(":");
				User user = new User(arr[0], arr[1]);
				list.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}

		bl.readAllBook();
	}

	// 메모리에서 정보 새기기(끝)
	@Override
	public void writeAllUser() {

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iodata/user.txt");
			dos = new DataOutputStream(fos);

			for (User u : list) { // list 전체를 순회하며 입력
				dos.writeBytes((u.getId() + ":" + u.getPw() + "/").trim());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		bl.writeAllBook();
	}

	// read 후 사용할 수 있는 메소드 ----------------------------------------
	@Override
	public void printAll() {
		for (User u : list) {
			System.out.println(u);
		}
	}

	public void welcome() {
		int n = m.inputInt("1.로그인/ 2.회원가입/ 3.종료(저장)");

		switch (n) {
		case 1:
			login();
			break;
		case 2:
			register();
			break;
		case 3:
			String yn = m.inputString("정말 종료하시겠습니까? [Y/N]: ");
			if (yn.compareTo("Y") == 0) {
				System.out.println("Bye~ 저장 완료.");
				writeAllUser();
			} else {
				welcome();
			}
			break;
		}
	}

	// 유용하게 사용할 조회 후 인덱스 내놓는 함수
	public int checkID(String id) {
		int idx = -1;
		for (User u : list) {
			if (u.getId().compareTo(id) == 0) {
				idx = list.indexOf(u);
			}
		}
		return idx;
	}

	@Override
	public void register() {
		String id = m.inputString("가입할 ID를 입력하세요: ");
		if (checkID(id) == -1) { // -1이면 중복되는게 없었다.
			String pw = m.inputString("비밀번호를 입력하세요: ");
			String pw2 = m.inputString("비밀번호를 다시 입력하세요: ");
			if (pw.compareTo(pw2) == 0) {
				System.out.println("회원가입이 완료됐습니다.");
				list.add(new User(id, pw));
			} else {
				System.out.println("비밀번호가 틀렸습니다. 처음부터 다시 시작하세요.");
			}
		} else {
			System.out.println("중복되는 ID 입니다.");
		}
		welcome();
	}

	@Override
	public void login() { // 현재 user 라는 static value 생성
		String id = m.inputString("ID를 입력하세요: ");
		String pw = m.inputString("비밀번호를 입력하세요: ");
		int idx = checkID(id);
		if (idx != -1) { // 아이디 조회
			if (list.get(idx).getPw().compareTo(pw) == 0) {
				System.out.println("로그인 성공");
				session.setId(id);
				session.setPw(pw);// 현재 로그인 정보 저장

				if (list.get(idx).getId().compareTo("admin") == 0) {
					System.out.println("관리자로 로그인");
					startAdmin();
				} else {
					startLib();
				}
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
				welcome();
			}
		} else {
			System.out.println("존재하지 않는 ID 입니다.");
			welcome();
		}
	}

	// 사용자 로그인 후 사용할 수 있는 메소드 ----------------------------------
	public void startLib() {
		int n = m.inputInt("1.로그아웃/ 2.아이디 수정/ 3.비밀번호 수정/ 4.내정보/ 5.책 목록(대여가능)/ 6.책 검색/ 7.대여하기/ 8.내가 빌린 책 모아보기/ 9.반납하기");

		switch (n) {
		case 1:
			logout();
			break;
		case 2:
			updateID();
			break;
		case 3:
			updatePW();
			break;
		case 4:
			myInfo();
			break;
		case 5:
			bl.printBookListSub();
			startLib();
			break;
		case 6:
			bl.searchBookSub();
			startLib();
			break;
		case 7:
			bl.borrowBook(session.getId());
			startLib();
			break;
		case 8:
			bl.printMyBorrowList(session.getId());
			startLib();
			break;
		case 9:
			bl.returnBook(session.getId());
			startLib();
			break;
		}
	}

	// admin 메소드
	public void startAdmin() {
		int n = m.inputInt("1.로그아웃/ 2.책 추가/ 3.책 삭제/ 4.책 검색/ 5.회원리스트 출력/ 6.회원삭제/ 7.전체 책 목록(모든 정보)/ 8.대여된 책 출력");

		switch (n) {
		case 1:
			logout();
			break;
		case 2:
			bl.addBook();
			startAdmin();
			break;
		case 3:
			bl.deleteBook();
			startAdmin();
			break;
		case 4:
			bl.searchBook();
			startAdmin();
			break;
		case 5:
			printAll();
			startAdmin();
			break;
		case 6:
			delUser();
			startAdmin();
			break;
		case 7:
			bl.printBookList();
			startAdmin();
			break;
		case 8:
			bl.printBorrowList();
			startAdmin();
			break;
		}
	}

	@Override
	public void logout() {
		String yn = m.inputString("정말 로그아웃 하시겠습니까? [Y/N]: ");
		if (yn.compareTo("Y") == 0) {
			sessionOut();
		} else {
			startLib();
		}
	}

	public void sessionOut() {
		session.setId(null);
		session.setPw(null);
		welcome();
	}

	@Override
	public void myInfo() {
		System.out.println(session);
		startLib();
	}

	@Override
	public void updateID() {
		String pw = m.inputString("비밀번호를 확인하겠습니다: ");
		if (session.getPw().compareTo(pw) == 0) {
			String nid = m.inputString("새로운 아이디를 입력하세요: ");
			int idx = checkID(session.getId());
			list.remove(idx); // 그녀석 삭제
			list.add(new User(nid, pw)); // idx 뒤에 새id를 갖는 user를 만들어 넣는다.
			session.setId(nid); // 세션 수정
			System.out.println("ID가 수정됐습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		startLib();
	}

	@Override
	public void updatePW() {
		String pw = m.inputString("비밀번호를 확인하겠습니다: ");
		if (session.getPw().compareTo(pw) == 0) {
			String npw = m.inputString("새로운 비밀번호를 입력하세요: ");
			String npw2 = m.inputString("새로운 다시 비밀번호를 입력하세요: ");
			if (npw.compareTo(npw2) == 0) {
				int idx = checkID(session.getId());
				list.remove(idx);
				list.add(new User(session.getId(), npw));
				session.setPw(npw);
				System.out.println("비밀번호가 수정됐습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		startLib();
	}

	@Override
	public void delUser() {
		String id = m.inputString("삭제할 ID를 입력하세요: ");
		int idx = checkID(id);
		String yn = m.inputString("정말 삭제하시겠습디까? [Y/N]: ");
		if (yn.compareTo("Y") == 0 && idx != -1) {
			list.remove(idx);
		} else {
			System.out.println("삭제가 취소됐습니다.");
		}
	}
}
