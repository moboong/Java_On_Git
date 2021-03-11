package kr.ac.kopo.day04;

public class LoopMain05 {

	public static void main(String[] args) {
		loop01: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				
				if(j == 3) {
					break loop01; // 012 012 012
					//continue; -> // 0124 0124 0124
				}
				
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
