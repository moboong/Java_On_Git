package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain03b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값 입력: ");
		int price = sc.nextInt();
		System.out.print("지불액수 입력: ");
		int payment = sc.nextInt();
		sc.close();

		int change = payment - price;
		// change = (a * 1000) + (b * 500) + (c * 100) + (d * 50) + (e * 10)
		int a = change / 1000;
		int b = (change - (a * 1000)) / 500;
		int c = (change - (a * 1000) - (b * 500)) / 100;
		int d = (change - (a * 1000) - (b * 500) - (c * 100)) / 50;
		int e = (change - (a * 1000) - (b * 500) - (c * 100) - (d * 50)) / 10;

		if (price > payment) {
			System.out.println((price - payment) + "원이 부족합니다.");
		} else if (price == payment) {
			System.out.println("거스름돈이 없습니다.");
		} else {
			System.out.println("거스름돈: " + change);
			System.out.println("1000원: " + a);
			System.out.println("500원: " + b);
			System.out.println("100원: " + c);
			System.out.println("50원: " + d);
			System.out.println("10원: " + e);
		}

	}

}
