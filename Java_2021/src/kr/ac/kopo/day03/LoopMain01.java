package kr.ac.kopo.day03;

public class LoopMain01 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("World");
			++cnt;
		}

	}

}
