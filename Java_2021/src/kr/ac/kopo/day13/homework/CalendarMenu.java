package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class CalendarMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private CalendarUtil util = new CalendarUtil();

	// select()메소드 외에 아무것도 접근 못해
	public void select() {
		int choice = inputInt("선택하세요(1. 특정년도 2. 특정월 3. 종료) => ");
		int year;
		int month;

		switch (choice) {
		case 1:
			year = inputInt("년도를 입력하세요 : ");
			util.printCal(year);
			select();
			break;
		case 2:
			year = inputInt("년도를 입력하세요 : ");
			month = inputInt("월을 입력하세요 : ");
			util.printCal(year, month);
			select();
			break;
		case 3:
			System.out.println("종료요");
			break;
		}
	}

	// 클래스 내부에서만 사용하므로 private
	private int inputInt(String msg) {
		System.out.print(msg);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}
