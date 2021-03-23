package kr.ac.kopo.day12;

import java.util.Random;

public class MyClassMain {

	public static void main(String[] args) {
		Random r = new MyRandom();
		System.out.println(r.nextInt(2)); // 1 ~ 2 사이의 난수.
		
	}

}
