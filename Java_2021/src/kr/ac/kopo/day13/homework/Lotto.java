package kr.ac.kopo.day13.homework;

import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);
	
	public void inputLotto() throws LottoNumberException {
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 45 || input < 1) {
			throw new LottoNumberException("LottoNumberException : 1-45사이만 가능합니다. " + input + "은 올바르지 않습니다");
		}
		
		System.out.println(input + "를 포함해서 로또번호들을 추출하겠습니다");
	}
}
