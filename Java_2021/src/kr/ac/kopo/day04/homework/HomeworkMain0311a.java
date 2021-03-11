package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeworkMain0311a {

	public static void main(String[] args) {
		
		//배열 없이 작성해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int number = 3; // 돌리는 횟수

		for (int i = 0; i < number; i++) {
			int temp;
			if (a < b) {
				temp = a;
				a = b;
				b = temp;
			}
			if (b < c) {
				temp = b;
				b = c;
				c = temp;
			}
		}
		System.out.println(a + " " + b + " " + c + " ");
	}

}
