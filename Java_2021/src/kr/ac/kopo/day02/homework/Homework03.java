package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값 입력: ");
		int price = sc.nextInt();
		System.out.print("지불액수 입력: ");
		int payment = sc.nextInt();
		sc.close();
		
		int change = payment - price;
		
		if (price > payment) {
			System.out.println((price - payment) + "원이 부족합니다.");
		} else if (price == payment) {
			System.out.println("거스름돈이 없습니다.");
		} else {
			System.out.println(change);
			System.out.println("1000원: "+ change % 1000);
			System.out.println("500원: "+ (change % 1000) * 1000);
//			System.out.println("100원: "+ change % );
//			System.out.println("50원: "+ change % );
//			System.out.println("10원: "+ change % 2);
			
		}

	}

}
