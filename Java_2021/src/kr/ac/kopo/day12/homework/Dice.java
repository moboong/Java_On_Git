package kr.ac.kopo.day12.homework;

import java.util.Random;

public class Dice implements Game {

	Random r = new Random();

	@Override
	public int startGame(int you) {
		int result = 0;
		int me = r.nextInt(6) + 1;
		if (me == you) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}

}
