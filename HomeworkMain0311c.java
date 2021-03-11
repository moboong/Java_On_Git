package kr.ac.kopo.day04.homework;

public class HomeworkMain0311c {

	public static void main(String[] args) {
		int hour = 0;
		int distance = 0;
		
		while(distance < 100) {
			if(distance < 50) {
				distance += 4;
			} else {
				distance += 3;
			}
			hour++;
			System.out.println("[" + hour + "시간후" + "]" + "달팽이가 올라간 높이 : " + distance + "m");
		}

	}

}
