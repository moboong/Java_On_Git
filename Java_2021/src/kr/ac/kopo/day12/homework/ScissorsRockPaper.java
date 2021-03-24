package kr.ac.kopo.day12.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	Random r = new Random();
	
	@Override
	public int startGame(int you) {
		int result = 0;
		int me = r.nextInt(3) + 1;
		if(me == SCISSOR){
			if(you == 1) result = 0;
			if(you == 2) result = 1;
			if(you == 3) result = -1;
		} else if(me == ROCK){
			if(you == 1) result = -1;
			if(you == 2) result = 0;
			if(you == 3) result = 1;
		} else if(me == PAPER){
			if(you == 1) result = 1;
			if(you == 2) result = -1;
			if(you == 3) result = 0;
		}
		return result;
	}
	
	@Override
	public int getYourNum() {
		GameMeun g = new GameMeun();
		int you = g.inputInt("가위바위보 게임입니다.\n가위바위보중 하나를 선택하세요.\n(1:가위,2.바위,3.보)");
		if (you == 1 || you == 2 || you == 3) {
			return you;
		} else {
			System.out.println("다시 입력하세요");
			getYourNum();
			return you;
		}
	}
	
	
	
	
}
