package kr.ac.kopo.day03.exam;

import java.util.Scanner;

public class ExamMain02 {

	public static void main(String[] args) {
		//3~20 사이의 라인수를 입력하세요 : 11 (짝수일때 어떻게 처리? -> 짝수 입력시 다시 입력 요청.(1), 자동으로 홀수로 바꿔서 처리.(2))
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3 ~ 20 사이의 라인 수를 입력하세요. : ");
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(input);
		
	}

}
