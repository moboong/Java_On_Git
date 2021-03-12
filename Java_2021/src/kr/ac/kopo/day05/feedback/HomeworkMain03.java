package kr.ac.kopo.day05.feedback;

import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0; // 음수도 비교가능하게 하려면??
		for(int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if(i == 0 || num > max) {
				max = num;
			}
		}
		sc.close();
		System.out.println(max);

	}

}
