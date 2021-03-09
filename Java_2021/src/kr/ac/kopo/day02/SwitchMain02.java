package kr.ac.kopo.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		// 이거 if문 쓸때

		switch (input) {
		case "spring":
		case "SPRING":
		case "Spring":
		case "봄":
		case "입춘":
			System.out.println("봄은 3~5");
			break;
		case "summer":
			System.out.println("여름은 6~9");
			break;
		case "fall":
			System.out.println("가을은 10~11");
			break;
		case "winter":
			System.out.println("겨울은 12~2");
			break;
		default:
			System.out.println("error");
		}

	}

}
