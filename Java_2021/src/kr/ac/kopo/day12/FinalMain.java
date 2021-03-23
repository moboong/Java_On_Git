package kr.ac.kopo.day12;

final class Super { //상속불가
	
	private final int MAX = 100; //변경불가
	
	public final void info() { //재정의불가
		System.out.println("Super클래스 메소드");
		//MAX = 50; 오류남.
		System.out.println(MAX);
	}
}

//class Sub extends Super {

//	@Override
//	public void info() {
//		System.out.println("재정의");
//	}
//}

public class FinalMain {

	public static void main(String[] args) {
		
	}

}
