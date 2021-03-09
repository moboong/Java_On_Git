package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int second = sc.nextInt();
		sc.close();
		
		if(second != 0 && first % second == 0){
			System.out.println(first + "가 " + second + "의 배수인지 판단 결과 : " + true);
		} else {
			System.out.println(first + "가 " + second + "의 배수인지 판단 결과 : " + false);
		}
	}

}
