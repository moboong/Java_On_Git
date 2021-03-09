package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1-3 사이 정부
 */

public class SwitchMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		switch (input) {
		case 1:
			System.out.println("one");
			
		case 2:
			System.out.println("two");
			
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("error");
		}

//		if(input == 1) {
//			System.out.println("one");
//		} else if(input == 2) {
//			System.out.println("two");
//		} else if(input == 3) {
//			System.out.println("three");
//		} else {
//			System.out.println("error");
//		}
	}

}
