package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력: ");
		int r = sc.nextInt();
		sc.close();
		
		double circumference = 2 * PI * r;
		double circleArea = PI * r * r;
		
		System.out.println("반지름이 " + r + "일때, 원둘레는 " + circumference + "이고, 원넓이는 " + circleArea + "이다.");

	}

}
