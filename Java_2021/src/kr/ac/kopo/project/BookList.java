package kr.ac.kopo.project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class BookList implements BookListIF {
	private List<Book> bookList = new LinkedList<Book>(); // 회원리스트

	Method m = new Method();

	@Override
	public void readAllBook() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("iodata/book.txt");
			dis = new DataInputStream(fis);

			@SuppressWarnings("deprecation")
			String data = dis.readLine(); // UFT로 읽으면 자꾸 이상한 문자가 생김.

			String[] strArr = data.split("/");

			for (int i = 0; i < strArr.length; i++) {
				String[] arr = strArr[i].split(":");
				Book book = new Book(arr[0], arr[1], arr[2]);
				bookList.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}

	@Override
	public void writeAllBook() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iodata/book.txt");
			dos = new DataOutputStream(fos);

			for (Book b : bookList) { // list 전체를 순회하며 입력
				dos.writeBytes((b.getTitle() + ":" + b.getAuthor() + ":" + b.getBorrowId() + "/").trim());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}

	}

	public int checkTitle(String title) {
		int idx = -1;
		for (Book b : bookList) {
			if (b.getTitle().compareTo(title) == 0) {
				idx = bookList.indexOf(b);
			}
		}
		return idx;
	}

	public int checkAuthor(String author) {
		int idx = -1;
		for (Book b : bookList) {
			if (b.getAuthor().compareTo(author) == 0) {
				idx = bookList.indexOf(b);
			}
		}
		return idx;
	}

	public int checkBorrowId(String borrowId) {
		int idx = -1;
		for (Book b : bookList) {
			if (b.getBorrowId().compareTo(borrowId) == 0) {
				idx = bookList.indexOf(b);
			}
		}
		return idx;
	}

	@Override
	public void addBook() {
		String title = m.inputString("책 제목을 입력하세요: ");
		String author = m.inputString("작가 이름을 입력하세요: ");
		bookList.add(new Book(title, author, "null"));
	}

	@Override
	public void deleteBook() {
		String title = m.inputString("책이름을 입력하세요: ");
		int idx = checkTitle(title);
		if (idx != -1) {
			bookList.remove(idx);
		} else {
			System.out.println("그런 책은 없습니다.");
		}
	}

	@Override
	public void searchBook() {
		String title = m.inputString("검색할 책이름을 입력하세요: ");
		int idx = checkTitle(title);
		if (idx != -1) {
			System.out.println(bookList.get(idx)); // toString 오버라이딩
		}
	}

	public void searchBookSub() {
		String title = m.inputString("검색할 책이름을 입력하세요: ");
		int idx = checkTitle(title);
		if (idx != -1) {
			System.out.println(
					"[title=" + bookList.get(idx).getTitle() + ", author=" + bookList.get(idx).getAuthor() + "]");
		}
	}

	@Override
	public void printBookList() {
		for (Book b : bookList) {
			System.out.println(b);
		}

	}

	public void printBookListSub() {
		for (Book b : bookList) {
			if (b.getBorrowId().compareTo("null") == 0) {
				System.out.println("[title=" + b.getTitle() + ", author=" + b.getAuthor() + "]");
			}
		}

	}

	@Override
	public void printBorrowList() {
		for (Book b : bookList) {
			if (b.getBorrowId().compareTo("null") != 0) {
				System.out.println(b);
			}
		}
	}

	public void printMyBorrowList(String id) {
		for (Book b : bookList) {
			if (b.getBorrowId().compareTo(id) == 0) {
				System.out.println(b);
			}
		}
	}

	@Override
	public void returnBook(String id) {
		String title = m.inputString("반납하실 책이름을 입력하세요: ");
		
		int idx = checkTitle(title);
		if (idx != -1) {
			if(bookList.get(idx).getBorrowId().compareTo(id) == 0) {
				bookList.get(idx).setBorrowId("null");				
			} else {
				System.out.println("빌린 책 이름이 다릅니다.");
			}
			
		} else {
			System.out.println("그런 책은 없습니다.");
		}
	}

	@Override
	public void borrowBook(String id) {
		String title = m.inputString("빌릴 책이름을 입력하세요: ");
		int idx = checkTitle(title);
		if (idx != -1) {
			if(bookList.get(idx).getBorrowId().compareTo("null") != 0) {
				System.out.println("이미 대여된 책입니다.");
			} else {
				System.out.println("대여완료했습니다.");
				bookList.get(idx).setBorrowId(id);
			}
		} else {
			System.out.println("그런 책은 없습니다.");
		}
	}

}
