package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class LottoView {
	Scanner sc;
	
	

	public void printLotto(int algo) {
		int input = inputInt("게임수를 입력하세요 : ");
		
		
		switch (algo) {
		case 1:
			LottoArrList al = new LottoArrList();
			al.pickAlgoCaseOne(input);
			break;
		case 2:
			LottoSet sl = new LottoSet();
			sl.pickAlgoCaseTwo(input);
			break;
		case 3:
			pickAlgoCaseThree(input);
			break;
		case 4:
			pickAlgoCaseFour(input);
			break;
		}
	}

	private int inputInt(String msg) {
		sc = new Scanner(System.in);
		System.out.print(msg);
		int input = sc.nextInt();
		sc.nextLine();
		return input;
	}
	
	

	public void pickAlgoCaseTwo(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print("게임 " + i + ": ");

		}
	}

	public void pickAlgoCaseThree(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print("게임 " + i + ": ");
			
		}
	}

	public void pickAlgoCaseFour(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print("게임 " + i + ": ");

		}
	}
}
