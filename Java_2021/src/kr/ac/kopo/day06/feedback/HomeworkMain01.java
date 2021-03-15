package kr.ac.kopo.day06.feedback;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수? : " );
		int even = sc.nextInt();
		System.out.println("홀수? : " );
		int odd = sc.nextInt();
		
		
		int[] num = new int[even + odd];

		int ei = 0, oi = num.length - 1;
		int i = 0;
		while(i < num.length) {
			System.out.print((i + 1) + "`s 정수 : ");
			int input = sc.nextInt();
			if (input > 0 && ei <= oi) {
				if (input % 2 == 0) {
					num[ei++] = input;
					i++;
				} else {
					num[oi--] = input;
					i++;
				}
			}
		}
		sc.close();

		System.out.println("< PRINT >");
		System.out.println(Arrays.toString(num));
		// 해설보지 말고 먼저 풀기
	}

}
