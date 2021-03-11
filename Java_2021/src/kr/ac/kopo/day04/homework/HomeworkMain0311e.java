package kr.ac.kopo.day04.homework;

public class HomeworkMain0311e {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			if (i > 1 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) { // 11 * 11 미만의 소수 다 거르기
				System.out.print(i + " ");
			} else if (i == 2 || i == 3 || i == 5 || i == 7 || i == 11) { // 11까지 소수에 포함
				System.out.print(i + " ");
			}
		}
		
		// 2 포함하고 2의 배수 다 지우고 
		// 3 포함하고 3의 배수 다 지우고
		// ...
		// n * n > 100 만족하는 n 최소값 -> 11
		// 11까지 다 지우면 121 미만의 소수는 다 지워지는 원리 이용.
		// 코드가 더럽습니다.. 조건이 너무 더러운데.. 구글링하기기는 자존심이 상합니다.
	}

}
