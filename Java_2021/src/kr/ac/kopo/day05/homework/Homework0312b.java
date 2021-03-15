package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework0312b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] even = new int[9];
		int[] odd = new int[9];
		int[] arr = new int[9];

		int i = 0;
		while (i < 9) {
			System.out.print((i + 1) + "`s 정수 : ");
			int input = sc.nextInt();
			if (input > 0) {
				if (input % 2 == 0) {
					even[i] = input;
					i++;
				} else {
					odd[i] = input;
					i++;
				}
			}
		}
		sc.close();

		System.out.println("< PRINT >");
		for (int j = 0; j < even.length; j++) {
			if (even[j] != 0) {
				System.out.print(even[j] + " ");
			}
		}
		for (int j = 0; j < odd.length; j++) {
			if (odd[j] != 0) {
				System.out.print(odd[j] + " ");
			}
		}
		
		System.out.println();
		
		System.arraycopy(even, 0, arr, 0, even.length);
		System.out.println(Arrays.toString(arr));
	}
	
	//교수님 해설 대로 풀수 있도록 훈련

}
