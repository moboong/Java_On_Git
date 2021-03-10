package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int first = sc.nextInt();
		System.out.print("두번째 정수: ");
		int second = sc.nextInt();
		sc.close();

		System.out.println(first + " + " + second + " = " + (int) (first + second));
		System.out.println(first + " - " + second + " = " + (int) (first - second));
		System.out.println(first + " * " + second + " = " + (int) (first * second));
		System.out.printf("%d / %d = %.2f%n", first, second, (first / (double) second));
		System.out.println(first + " % " + second + " = " + (int) (first % second));

	}

}
