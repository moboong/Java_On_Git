package kr.ac.kopo.day03.exam;

public class ExamMain01 {

	public static void main(String[] args) {
		//1번
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------");
		//2번
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------");
		//3번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		//4번
		int n = 0;
		for (int i = 0; i < 9; i++) {
			if (i >= 5) {
				n += 2;
			}
			for (int j = 0; j <= i - n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		// for 3개 if 1개
		//5번
		int num = 0;
		for (int i = 0; i < 9; i++) {
			if (i >= 5) {
				num += 2;
			}
			for (int j = 0; j < i - num; j++) {
				System.out.print(" ");
			}
			for (int j = i - num; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		// for 2개 if 2개
		// 교수님이 알려준 방식 -> 표를 그려라!
		//5번 - 다른 방식
		for (int i = 0; i < 9; i++) {
			if(i < 5) {
//				for()
			} else {
//				for()
			}
		}
		
		System.out.println("--------------------");
		//6번
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < 9-i; j++) {
				System.out.print("*");
			}
			for(int j = 9-i; j < 9; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		//7번
		int var = 0;
		for(int i = 0; i < 9; i++) {
			if(i > 4) {
				var += 2;
			}
			for(int j = 0; j < i-var; j++) {
				System.out.print(" ");
			}
			for(int j = i-var; j < 9-(i-var); j++) {
				System.out.print("*");
			}
			for(int j = 9-(i-var); j < 9; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		//8번
		int va = 0;
		for(int i = 0; i < 9; i++) {
			if(i > 4) {
				va += 2;
			}
			for(int j = 0; j < i-va; j++) {
				System.out.print("*");
			}
			for(int j = i-va; j < 9-(i-va); j++) {
				System.out.print(" ");
			}
			for(int j = 9-(i-va); j < 9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
