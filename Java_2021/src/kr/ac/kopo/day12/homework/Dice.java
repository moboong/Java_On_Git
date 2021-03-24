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
	
	@Override
	public int getYourNum() {
		GameMeun g = new GameMeun();
		int you = g.inputInt("주사위 값 맞추기 게임입니다.\n주사위 숫자를 선택하세요(1~6값 중 하나)");
		if (you >= 1 && you <= 6) {
			return you;
		} else {
			System.out.println("다시 입력하세요");
			getYourNum();
			return you;
		}
	}

}
