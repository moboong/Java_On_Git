package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeworkMain0311d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		sc.close();
		
		if(input > 1 && input % 2 != 0 && input % 3 != 0 && input % 5 != 0 && input % 7 != 0 && input % 11 != 0) {
			System.out.println(input + " 소수입니다.");
		} else if(input == 2 || input == 3 || input == 5 || input == 7 || input == 11) {
			System.out.println(input + " 소수입니다.");
		} else {
			System.out.println(input + " 소수가 아닙니다.");
		}

	}

}
