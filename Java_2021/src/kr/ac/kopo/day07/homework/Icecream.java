package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Icecream {
	String name;
	int price;
	Scanner sc = new Scanner(System.in);

	void setPrice(String msg) {
		System.out.print(msg);
		int input = sc.nextInt();
		sc.nextLine();
		this.price = input;

	}

	void setName(String msg) {
		System.out.print(msg);
		String input = sc.nextLine();
		this.name = input;
	}
	
	/**
	 * 배열 전체를 돌며 초기화 작업.
	 * @param ic 아이스크림 객체의 배열
	 */
	void setMember(Icecream[] ic) {
		for(int i = 0; i < ic.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			ic[i].setName("아이스크림 이름 : ");
			ic[i].setPrice("아이스크림 가격 : ");
		}
	}
	
	/**
	 * 객체의 멤버변수 name, price 출력
	 */
	void print() {
		System.out.println(this.name + "       " + this.price);

	}
	
	/**
	 * 배열 전체를 돌며 출력
	 * @param ic 아이스크림 객체의 배열
	 */
	void print(Icecream[] ic) {
		System.out.println("< 총 " + ic.length + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호   아이스크림이름   아이스크림가격");
		for (int i = 0; i < ic.length; i++) {
			System.out.print((i + 1) + "      ");
			ic[i].print();
		}
	}
	
	/**
	 * 배열 전체를 돌며 가격 변수만 합산
	 * @param ic 아이스크림 객체의 배열
	 */
	void getSum(Icecream[] ic) {
		int sum = 0;
		for (int i = 0; i < ic.length; i++) {
			sum += ic[i].price;
		}
		System.out.println("총계 : " + sum);
	}

}
