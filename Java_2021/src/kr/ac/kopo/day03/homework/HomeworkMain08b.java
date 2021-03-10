package kr.ac.kopo.day03.homework;

public class HomeworkMain08b {

	public static void main(String[] args) {
		int num = 9;
		for (int i = 0; i < num; i++) {
			if (i < num / 2) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < num - 2*(i+1); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else if (i == num / 2) {
				for(int j = 0; j < num; j++){
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9-i; j++) { //i = (5,4) (6,3) (7,2) (8,1)
					System.out.print("*");
				}
				for (int j = 0; j < 2 * (i-4) - 1; j++) { // 1,3,5,7 / 1,2,3,4
					System.out.print(" ");	
				}
				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
