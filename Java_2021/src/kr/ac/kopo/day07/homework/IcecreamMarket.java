package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {
	Icecream[] iceArr;
	Scanner sc = new Scanner(System.in);

	void info() {
		// 배열에 값넣기 아이스크림 담기
		buy();
		// 배열 출력
		print();
	}

	void buy() {
		System.out.print("몇개 살건데? : ");
		int num = sc.nextInt();
		sc.nextLine();
		iceArr = new Icecream[num];

		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new Icecream();
			iceArr[i].setName(inputString("아이스크림 이름: "));
			iceArr[i].setPrice(inputInt("아이스크림 가격: "));
		}

	}

	void print() {
		System.out.println("***<총 " + iceArr.length + "개의 아이스크림>***");
		int sum = 0;
		for (int i = 0; i < iceArr.length; i++) {
			System.out.println((i + 1) + "\t" + iceArr[i].getName() + "\t" + iceArr[i].getPrice());
			sum += iceArr[i].getPrice();
		}
		System.out.println("총계 : " + sum);
	}

	int inputInt(String msg) {
		System.out.print(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	String inputString(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
}
