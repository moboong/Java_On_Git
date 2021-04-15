package kr.ac.kopo.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import kr.ac.kopo.util.FileClose;

public class Util {

	Scanner sc = new Scanner(System.in);

	public int checkDup(String id) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		int check = 0;

		try {
			fis = new FileInputStream("iodata/user.txt");
			dis = new DataInputStream(fis);

			@SuppressWarnings("deprecation")
			String data = dis.readLine(); // UFT로 읽으면 자꾸 이상한 문자가 생김.
			
			String[] strArr = data.split("/");

			loop: for (int i = 0; i < strArr.length; i++) {
				String[] arr = strArr[i].split(":");
				if (arr[0].compareTo(id) == 0) {
					System.out.println("중복된 ID가 있습니다.");
					check = 1;
					break loop;
				} else {
					check = 0;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
		return check;
	}

	public void write(String id, String pw) {

		User u = new User(id, pw);

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iodata/user.txt", true);
			dos = new DataOutputStream(fos);

			dos.writeBytes((u.getId() + ":" + u.getPw() + "/").trim());
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}

	public void register() {
		System.out.print("가입하실 ID를 입력하세요: ");
		String id = sc.nextLine();
		if (checkDup(id) == 1) {
			register();
		} else {
			String pw = checkPw();
			write(id, pw);
		}
		
		welcome();
	}

	public String checkPw() {
		System.out.print("비밀번호를 입력하세요: ");
		String pw = sc.nextLine();
		System.out.print("비밀번호 확인을 위해 재입력 바랍니다: ");
		String pw2 = sc.nextLine();

		if (!pw.equals(pw2)) {
			System.out.println("일치하지 않습니다.");
			checkPw();
		} else {
			System.out.println("회원가입이 완료됐습니다.");
		}
		return pw;
	}
	
	public void welcome() {
		System.out.println("1.로그인 2.회원가입 3.종료");
		int n = sc.nextInt();
		sc.nextLine();
		
		switch (n) {
		case 1:
			System.out.println("로그인 하세요.");
			//login();
			break;
		case 2:
			register();
			break;
		case 3:
			System.out.println("Bye~");
			break;
		}
	}
}
