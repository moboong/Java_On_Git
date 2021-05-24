package kr.ac.kopo.project;

import java.util.Scanner;

public class Method {
	Scanner sc = new Scanner(System.in);

	// 문자열 입력 받을 때
	public String inputString(String msg) {
		System.out.print(msg);
		String input = sc.nextLine();
		return input;
	}

	// 숫자 입력 받을 때
	public int inputInt(String msg) {
		System.out.print(msg);
		while (!sc.hasNextInt()) {
			sc.next();
			System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
		}
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
}