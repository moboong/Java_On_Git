package kr.ac.kopo.project;

public class Main {

	public static void main(String[] args) {
		// 시작과 함께 정보 읽어오기.
		UserList ul = new UserList();
		ul.readAllUser();
		ul.welcome();

	}

}
