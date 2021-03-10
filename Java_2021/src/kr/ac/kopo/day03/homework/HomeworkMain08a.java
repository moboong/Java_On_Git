package kr.ac.kopo.day03.homework;

public class HomeworkMain08a {

	public static void main(String[] args) {
		int var = 0;
		for (int i = 0; i < 9; i++) {
			if (i > 4) {
				var += 2;
			}
			if (i == 4) {
				for (int j = 0; j < 9; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= i - var; j++) {
					System.out.print("*");
				}
				for (int j = i + 1 - var; j < 9 - (i + 1 - var); j++) {
					System.out.print(" ");
				}
				for (int j = 9 - (i + 1 - var); j < 9; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
			// 0 ~ 3까지는 var이 0이어서 구간들에 영향을 끼치지 않음.
			// 4는 홀수개 이므로 예외처리
			// 5부터 var값이 0이 아닌 값이 되어 구간에 영향을 준다. -> 구간은 2씩 줄어듦으로 var += 2를 해준다.
		}

	}

}
