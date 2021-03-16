package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입해? : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Icecream[] ic = new Icecream[num];
		for(int i = 0; i < ic.length; i++) {
			ic[i] = new Icecream();
		}
		
		ic[0].setMember(ic); // 멤버변수 설정
		ic[0].print(ic); // 전체 출력
		ic[0].getSum(ic); // 합계 출력
		
	}

}
