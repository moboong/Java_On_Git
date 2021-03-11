package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeworkMain0311f {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "`s 정수 : ");
			 arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("<짝수>");
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 총합 : " + sum);
		
		System.out.println("<홀수>");
		sum = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 총합 : " + sum);
		
	}

}
