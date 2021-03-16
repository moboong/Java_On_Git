package kr.ac.kopo.day07.homework;

import java.util.Scanner;
/**
 * 계산기 클래스
 * @author HP
 *
 */
public class Calculator {
	//num이 num2보다 크다는 전제하에
	int num;
	int num2;
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 입력된 정수값이 반환된다.
	 * @return 입력값
	 */
	int getNum() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	/**
	 * 첫번째 입력값을 num멤버변수에 저장
	 * 두번째 입력값을 num2멤버변수에 저장
	 */
	void setNum() {
		num = getNum();
		num2 = getNum();
	}
	
	
	void add() {
		System.out.println(num + " + " + num2 + " = " + (num + num2));
	}
	void minus() {
		System.out.println(num + " - " + num2 + " = " + (num - num2));
	}
	void multi() {
		System.out.println(num + " * " + num2 + " = " + (num * num2));
	}
	void divi() {
		System.out.println(num + " / " + num2 + " = " + (num / (double) num2));
	}
	boolean check(int n) {
		boolean bool = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				bool = false;
				break;
			}
		}
		return bool;
	}
	
}
