package kr.ac.kopo.day03.homework;

public class HomeworkMain06 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) { // 구간별로 나눈다. 0 ~ i 공백찍기
				System.out.print(" ");
			}
			for(int j = i; j < 9-i; j++) { // i ~ (9-i) 별찍기
				System.out.print("*");
			}
			for(int j = 9-i; j < 9; j++) { // (9-i) ~ 9 공백찍기
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
