package kr.ac.kopo.day12;

import java.util.Random;

public class MyRandom extends Random {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
	// 나만의 랜덤 클래스 만들기 쌉가능
}
