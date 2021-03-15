package kr.ac.kopo.day05.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework0312f {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = new Random().nextInt(99) + 1;
		int chance = 5;
		int min = 1, max = 100;
		int user = 0;

		while (true) {
			System.out.println(min + " ~ " + max + " : ");
			user = sc.nextInt();

			if (user == random) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			}

			if (user < random) {
				System.out.println(user + "보다 큰수입니다.");
				if (min < user + 1) {
					min = user + 1;
				}
			} else {
				System.out.println(user + "보다 작은수입니다.");
				if (max > user - 1) {
					max = user - 1;
				}
			}

			if (--chance == 0) {
				System.out.println("아쉽습니다.. 기회를 다 소진하셨습니다.");
				System.out.println("정답은 " + random + "입니다.");
				break;
			}
			System.out.println("기회는 " + chance + "번 남았습니다.");
			System.out.println();
		}
		sc.close();
	}

}
