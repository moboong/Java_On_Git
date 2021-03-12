package kr.ac.kopo.day05.feedback;

import java.util.Random;

public class HomeworkMain02 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int a = r.nextInt(100) + 1; //범위지정 가능!! 저거 없으면 음수값도 추출함(signed라서)
		int b = r.nextInt(100) + 1;
		int c = r.nextInt(100) + 1;
		int d = r.nextInt(100) + 1;
		System.out.println(a + ", " + b + ", " + c + ", " + d);
		
		int semi01; // a,b 중 승자가 들어가는 자리
		int semi02; // c,d 중 승자가 들어가는 자리
		
		if(a > b) {
			semi01 = a;
		} else {
			semi01 = b;
		}
		
		if(c > d) {
			semi02 = c;
		} else {
			semi02 = d;
		}
		
		if(semi01 > semi02) {
			System.out.println(semi01);
		} else {
			System.out.println(semi02);
		}
		
		

	}

}
