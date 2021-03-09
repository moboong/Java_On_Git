package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값 입력: ");
		int price = sc.nextInt();
		System.out.print("지불액수 입력: ");
		int payment = sc.nextInt();
		sc.close();

		int change = payment - price;
		System.out.println(change);

	}

}
