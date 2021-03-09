package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 정수를 입력하세요: 12
 * 짝수 유무
 */

public class OperationMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		sc.close();
		
		boolean result = (input > 0 && input % 2 == 0); // 이거 앞에 input > 0 넣는 거 기발하네..
		// input > 0 이 거짓이면, 즉 0이면. 아얘 뒤에가 수행되지 않고 걍 false
		// if문 없이 논리연산자로만 이 코드 구성...!
		
		if(input % 2 == 0) {
			System.out.println(input + "의 짝수 유무 : " + result);
		} else {
			System.out.println(input + "의 짝수 유무 : " + result);
		}
	}

}
