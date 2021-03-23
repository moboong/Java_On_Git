package kr.ac.kopo.day12.homework;

import java.util.Scanner;

public class GameMeun {
	public static int totalWin;
	public static int totalLose;
	public static int totalDraw;

	Scanner sc = new Scanner(System.in);

	public void selectGame() {
		System.out.println("게임을 선택하세요");
		System.out.println("A. 가위바위보\nB. 주사위 값 맞추기\nC. 종료");
		String str = sc.nextLine();
		Game g;
		switch (str) {
		case "A":
			g = new ScissorsRockPaper();
			int you = getYourNum();
			int result = g.startGame(you);
			if (result == 1) {
				System.out.println("You win");
				GameMeun.totalWin++;
			} else if (result == -1) {
				System.out.println("You lose");
				GameMeun.totalLose++;
			} else {
				System.out.println("Draw");
				GameMeun.totalDraw++;
			}
			break;
		case "B":
			System.out.println("주사위맟추기 게임입니다.\n주사위를 선택하세요(1~6값 중 하나)");
			g = new Dice();
			break;

		case "C":
			System.out.println("게임을 종료합니다.\n당신의 게임 전석은 ");
			break;
		}

	}

	public int getYourNum() {
		System.out.println("가위바위보 게임입니다.\n가위바위보중 하나를 선택하세요.\n(1:가위,2.바위,3.보)");
		int you = sc.nextInt();
		sc.nextLine();
		
		if(you == 1 || you == 2 || you == 3) {
			return you;
		} else {
			System.out.println("다시 입력하세요");
			getYourNum();
			return you;
		}
	}

	// getter&setter
	public static int getTotalWin() {
		return totalWin;
	}

	public static void setTotalWin(int totalWin) {
		GameMeun.totalWin = totalWin;
	}

	public static int getTotalLose() {
		return totalLose;
	}

	public static void setTotalLose(int totalLose) {
		GameMeun.totalLose = totalLose;
	}

	public static int getTotalDraw() {
		return totalDraw;
	}

	public static void setTotalDraw(int totalDraw) {
		GameMeun.totalDraw = totalDraw;
	}

}
