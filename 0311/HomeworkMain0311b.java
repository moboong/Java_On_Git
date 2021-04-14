package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeworkMain0311b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		int number = 4; // 돌리는 횟수
		
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
			if (c < d) {
				temp = c;
				c = d;
				d = temp;
			}
		}
		System.out.println("가장 큰 수" + a);

	}

}
