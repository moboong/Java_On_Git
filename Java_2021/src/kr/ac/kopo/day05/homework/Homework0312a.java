package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class Homework0312a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		String[] arrRev = new String[5];

		int i = 0;
		while (i < arr.length) {
			System.out.print((i + 1) + "`s 정수 : ");
			int input = sc.nextInt();
			if (input >= 0 && input <= 99) {
				arr[i] = input;
				i++;
			} else {
				System.out.println("0-99사이의 정수만 입력하세요");
			}
		}
		sc.close();

		System.out.println("< PRINT >");
		String ten = " ";
		String one = " ";
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
			int temp = arr[j] / 10;
			ten = Integer.toString(temp);
			temp = arr[j] - (temp * 10);
			one = Integer.toString(temp);
			arrRev[arr.length - (j + 1)] = one + ten;
		}
		System.out.println();
		System.out.println("< REVERSE >");
		for (int j = 0; j < arrRev.length; j++) {
			System.out.print(Integer.parseInt(arrRev[j]) + " ");
		}

	}

}
