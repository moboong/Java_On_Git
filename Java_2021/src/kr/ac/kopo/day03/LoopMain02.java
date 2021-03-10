package kr.ac.kopo.day03;

public class LoopMain02 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int k = 4-i; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
