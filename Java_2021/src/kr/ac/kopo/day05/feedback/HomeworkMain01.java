package kr.ac.kopo.day05.feedback;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int min = a, max = b;
		if(a > b) {
			min = b;
			max = a;
		}
		
		if(c > max) {
			System.out.println(c + " > " + max + " > " + min);
		} else if(c > min) {
			System.out.println(max + " > " + c + " > " + min);
		} else {
			System.out.println(max + " > " + min + " > " + c);
		}

	}

}
