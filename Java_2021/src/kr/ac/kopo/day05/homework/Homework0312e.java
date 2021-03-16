package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class Homework0312e {

	public static void main(String[] args) {
		// 3~20 사이의 라인수를 입력하세요 : 11 (짝수일때 어떻게 처리? -> 짝수 입력시 다시 입력 요청.(1), 자동으로
		// 홀수로 바꿔서 처리.(2))
		int input = 0;

		// 3보다 작은 수 또는 21보다 큰수 또는 짝수면 무한 재입력 요청
		Scanner sc = new Scanner(System.in);
		while (input < 3 || input > 21 || input % 2 == 0) {
			System.out.print("3 ~ 21 사이의 라인 홀수를 입력하세요. : ");
			input = sc.nextInt();
		}
		sc.close();

		// 혹시나 짝수가 통과한다면 여기서 홀수화.
		if (input % 2 == 0) {
			input--;
		}

		for (int i = 0; i < input; i++) {
			if (2 * i < input) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < input - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}