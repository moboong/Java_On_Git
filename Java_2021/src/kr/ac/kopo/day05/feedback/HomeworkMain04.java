package kr.ac.kopo.day05.feedback;

import java.util.Scanner;

public class HomeworkMain04 {

	public static void main(String[] args) {
		// (1) 정수 약수 개수 구하기 단어 그대로. 나눠지는 게 2개.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//for로 구현
//		boolean bool = true; 
//		for(int i = 2; i < num / 2; i++) {
//			if(num % i == 0) {
//				bool = false;
//				break;
//			}
//		}
//		if(bool) {
//			System.out.println("소수입니다.");
//		} else {
//			System.out.println("X");
//		}
		
		//while로 구현
		int i = 2;
		while(num % i != 0) {
			i++;
		}
		
		if(num == i) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("X");
		}
		
		
		// (2) 1과 자기자신을 제외한 약수개수가 존재하면 소수x
		
		
		// (3) 효율을 위해 반만 물어봐도 돼. (n/2)
		
		// (4) 소수만 구하는 것이기에 약수가 있자마자 그만두는게 가장 큰 효율 break; (기발하다;;)
		
		// (5) 그리고 이러한 상황에 count 값이 굳이 필요없어. 실제 개수를 구하는 것이 아닌
		// 여부만 알고 싶으니까 count 대신 불린값 bool 변수 사용해봐. 컨셉이 약수 존재 x(false) / 내가 소수이다(true)
		
		// 이 순서대로 ㄱㄱ
		
		// 이러한 break가 while문에서는 조건으로써 구현이된다...! 소름돋네
		// i 가 num까지 도달하면 소수
		
		// 복기해보면 전부 돌리고 전수 조사보다 특정 조건 발현시에 그만두는 while이 더 효율적이다..!!
		// 이건 진짜 소름이네..;;
		
	}

}
