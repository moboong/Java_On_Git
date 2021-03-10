package kr.ac.kopo.day03.exam;

public class ExamMain01 {

	public static void main(String[] args) {
		/*
		 * 12345 23456 34567 45678 56789
		 * 
		 * 56789 45678 34567 23456 12345
		 * 
		 * ***** **** *** ** *
		 * 
		 * 
		 * * ** *** **** ***** **** *** ** *
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------");

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("--------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------");

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
		
		for (int i = 0; i < 9; i++) {
			if(i < 5) {
//				for()
			} else {
//				for()
			}
		}
	}

}
