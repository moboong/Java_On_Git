package kr.ac.kopo.day02;

public class IfMain {

	public static void main(String[] args) {

		int a = 10, b = 5;

		System.out.println("MAX : " + (a > b ? a : b));

		if (a > b) {
			System.out.println("MAX : " + a);
		} else {
			System.out.println("MAX : " + b);
		}

		/*
		 * a가 b보다 크면 a a가 b보다 작다면 b a와 b가 같다면 0
		 */

		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println(0);
		}
	}

}
