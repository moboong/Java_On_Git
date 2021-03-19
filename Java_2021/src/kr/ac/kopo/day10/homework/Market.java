package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Market {
	private Icecream[] basket;
	public static int totalCust;
	public static int totalPrice;

	Scanner sc = new Scanner(System.in);

	public int inputInt(String msg) {
		System.out.print(msg);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	public String inputString(String msg) {
		System.out.print(msg);
		String input = sc.nextLine();
		return input;
	}
	
	public static int getTotalCust() {
		return Market.totalCust;
	}

	public void buy() {
		int cnt = inputInt("아이스크림 몇개 구매하실? : ");
		basket = new Icecream[cnt];
		totalCust++;
		for (int i = 0; i < cnt; i++) {
			basket[i] = new Icecream();
			System.out.println((i+1) + "번");
			basket[i].setName(inputString("아이스크림명 : "));
			basket[i].setPrice(inputInt("아이스크림가격 : "));
			Market.totalPrice += basket[i].getPrice();
		}

	}
	
	public void start() {
		buy();
		String input = inputString("계속구매할거야?(Y/N) => ");
		if(input.equals("Y") || input.equals("y")) {
			start(); // 재귀사용
		} else {     // 아니면 결과 출력 그동안 누적된 static변수들 전부 출력
			System.out.println("총 " + Market.getTotalCust() + "명의 고객이 아이스크림을 구매했습니다.");
			System.out.println("판매된 아이스크림 총 개수 : " + Icecream.getTotalIce());
			System.out.println("총 판매액 : " + Market.totalPrice);
		}
	}

}
