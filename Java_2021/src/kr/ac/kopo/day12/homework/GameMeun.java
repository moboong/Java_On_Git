package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameMeun {
	public static int totalWin;
	public static int totalLose;
	public static int totalDraw;

	Scanner sc = new Scanner(System.in);
	
	//게임 선택 및 전체 게임 진행
	public void selectGame() {
		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위바위보\nB. 주사위 값 맞추기\nC. 종료");
		String str = sc.nextLine();

		if (str.equals("A") || str.equals("B") || str.equals("C")) {

			Game g;
			int you;
			int result;
			switch (str) {
			case "A":
				g = new ScissorsRockPaper();
				you = g.getYourNum();
				result = g.startGame(you);
				checkResult(result);
				break;
			case "B":
				g = new Dice();
				you = g.getYourNum();
				result = g.startGame(you);
				checkResult(result);
				break;

			case "C":
				System.out.println("게임을 종료합니다.\n당신의 게임 전적은 " 
						+ GameMeun.getTotalWin() + "승 " + GameMeun.getTotalLose()
						+ "패 " + GameMeun.getTotalDraw() + "무입니다.");
				break;
			}
		} else {
			System.out.println("다시 입력하세요");
			selectGame();
		}

	}
	
	//사용자에게 숫자 받기
	public int inputInt(String msg) {
		System.out.println(msg);
		int you = sc.nextInt();
		sc.nextLine();
		return you;
	}
	
	//승패 결과 체크
	private void checkResult(int result) {
		if (result == 1) {
			System.out.println("You win");
			GameMeun.totalWin++;
		} else if (result == -1) {
			System.out.println("You lose");
			GameMeun.totalLose++;
		} else if (result == 0) {
			System.out.println("Draw");
			GameMeun.totalDraw++;
		}
		selectGame();
	}

	// getter&setter
	public static int getTotalWin() {
		return totalWin;
	}

	public static int getTotalLose() {
		return totalLose;
	}

	public static int getTotalDraw() {
		return totalDraw;
	}

}
