package kr.ac.kopo.day12.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	Random r = new Random();
	
	@Override
	public int startGame(int you) {
		int me = r.nextInt(2) + 1;
		
		return 0;
	}
	
	
	
	
}
