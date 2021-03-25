package kr.ac.kopo.day14.homework;

import java.util.Scanner;

public class LottoView {
	Scanner sc;
	
	public void printLotto(int algo) {
		int input = inputInt("게임수를 입력하세요 : ");
		
		LottoArrList al;
		LottoSet sl;
		switch (algo) {
		case 1:
			al = new LottoArrList();
			al.pickAlgoCaseOne(input);
			break;
		case 2:
			al = new LottoArrList();
			al.pickAlgoCaseTwo(input);
			break;
		case 3:
			sl = new LottoSet();
			sl.pickAlgoCaseThree(input);
			break;
		case 4:
			//pickAlgoCaseFour(input);
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
}
