package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구매할거임? : ");
		int num = sc.nextInt();
		
		Icecream[] ic = new Icecream[num];
		
		for(int i = 0; i < ic.length; i++) {
			ic[i] = new Icecream();
		}
		
		for(int i = 0; i < ic.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림 : ");
			ic[i].name = sc.next();
			System.out.print("가격 : ");
			 ic[i].price = sc.nextInt();
		}
		sc.close();
		
		System.out.println("< 총 4개의 아이스크림 구매정보 출력 >");
		System.out.println("번호    아이스크림    아이스크림가격");
		
		int total = 0;
		for(int i = 0; i < ic.length; i++) {
			total += ic[i].price;
			System.out.println(i + 1 + "      " + ic[i].name + "        " + ic[i].price);
		}
		System.out.println("총 계 : " + total);
		
	}

}
