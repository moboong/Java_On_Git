package kr.ac.kopo.day08.feedback;

import java.util.Scanner;

public class IcecreamMarket {
	Icecream[] iceArr;
	Scanner sc = new Scanner(System.in);
	
	
	//정수 받는 메소드
	int inputInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	//문자열 받는 메소드
	String inputString(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
	
	void doSomething() {
		//아이스크림 구매
		buy();
		
		//아이스크림 출력
		info();
	}
	
	void buy() {
		int count = inputInt("아이스크림 몇개 구입? : ");
		iceArr = new Icecream[count];
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			iceArr[i] = new Icecream(); // 얘를 빼먹으면 안돼 중요해!
			String name = inputString("아이스크림 이름 : ");
			int price = inputInt("아이스크림 가격 : ");
			iceArr[i].set(name, price);
		}
	}
	
	void info() {
		System.out.println("<총 " + iceArr.length + "개 구매정보 출력>");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println( (i+1) + iceArr[i].getfuck() + "     " + iceArr[i].getPrice()); //이렇게 다른 클래스의 멤버변수를 직접 사용하는 건 좋지않아.
		}
	}// 만약에 Icecream 클래스를 수정하면 자세히 말해 멤버변수명을 수정하면 와.... 소름돋네
	// 그래서 멤버변수로 소통하는 것은 바람직하지 못하고 메소드를 통해 소통해야해..!!
	// 그러면 수정해도 영향을 덜 받아..!! 이때 사용하는 것이 바로 get메소드...!! 소름....
}
