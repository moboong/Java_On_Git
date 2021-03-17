package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {
	// 이건 num01 > num02 전제하에
	int num;
	int num2;
	Scanner sc = new Scanner(System.in);

	Calculator() {
		this(0, 0);
		setNum();
	}

	Calculator(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}

	int inputNum() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}

	void setNum() {
		num = inputNum();
		num2 = inputNum();
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

	void check() {
		boolean bool = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				bool = false;
				break;
			}
		}

		boolean bool2 = true;
		for (int i = 2; i < num2; i++) {
			if (num2 % i == 0) {
				bool2 = false;
				break;
			}
		}
		System.out.println(num + "는 소수인가?: " + bool);
		System.out.println(num2 + "는 소수인가?: " + bool2);
	}
	
	void calAll() {
		add();
		minus();
		multi();
		divi();
		check();
	}

}
