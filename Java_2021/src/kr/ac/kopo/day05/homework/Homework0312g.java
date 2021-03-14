package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework0312g {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = new Random().nextInt(100) + 1;
		int start = 0;
		int end = 100;

		while (true) {
			System.out.println("사용자가 생각하는 숫자가" + "[" + random + "]" + "입니까?(맞으면 0,작은 수면 1, 큰수면 2)");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("사용자가 생각하는 숫자를 맞추었습니다.");
				break;
			} else if (input == 1 && random > 0) {
				end = random - 1;
				random = (int) ((Math.random() * (end - start)) + start);
			} else if (input == 2) {
				start = random + 1;
				random = (int) ((Math.random() * (end - start)) + start);
			}
		}
		sc.close();

	}

}
