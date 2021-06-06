package kr.ac.kopo.day13;

import java.io.FileReader;

public class ExceptionMain05 {

	public static void main(String[] args) { //야 이거 여기도 쓰기 싫으면 main도 throw 써서 다른데 보내도 돼.
		// a();
		try {
			b();
		} catch (Exception e) {
			System.out.println("main() 예외처리...");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	public static void b() throws Exception { //ArithmeticException, NullPointerException { // 메인이 불렀으니까 메인 너가 처리해.
		System.out.println("b()메소드 호출...");
		String str = null;
		System.out.println(str.charAt(0)); // 야 근데 여기서 문제 이건 null point 예외야. 그래서 콤마치고 쓰면 됨. 근데 그냥 Exception으로 전부 다 받아도돼.
		System.out.println(1 / 0);
	}

	public static void a() {
		System.out.println("a() 메소드 호출...");

		try {
			@SuppressWarnings({ "resource", "unused" })
			FileReader fr = new FileReader("a.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
