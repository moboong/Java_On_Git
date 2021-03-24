package kr.ac.kopo.day13;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 3; i++) {
			System.out.println(i + "번째 반복문 수행중...");
			try {
				System.out.println(10 / i);
			} catch (ArithmeticException ae) {
				System.out.println(i + "번째 예외발생...");
				break; // 근데 이게 있으면 17번째 줄 수행 못해. 이때 finally 하면 쓸 수 있어.
			} finally {
				System.out.println("반복문 수행중~~~"); // 예외가 발상하나 마나 수행됨. 그럼 finally 필요없지 않음?
			}
		}

		System.out.println("main end...");
	}

}
