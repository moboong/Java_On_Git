package kr.ac.kopo.day02;

public class OperationMain02 {

	public static void main(String[] args) {
		int a = 1, b = -1, c = 0;

		boolean bool = ++a > 0 || ++b > 0 && ++c > 0;

		System.out.println(bool);
		System.out.println(a + " " + b + " " + c);
		
		// && &&
		// c가 실행이 안된다..!! 진짜 앞에서 T F 가 나와서 F니까 그냥 c까지 안보고
		// false 출력
		
		
		// || && 
		// a가 true라서 뒤에 다 안봐.
		
		// || || 마찬가지
	}

}
