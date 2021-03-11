package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain03 {
	public static void main(String[] args) {
		String[] strArr = new String[]{"음바페", "홀란드", "그린우드"};
		
		System.out.println(strArr);
		System.out.println(strArr.length);
		
		System.out.println("첫번째");
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("두번째");
		for(String str : strArr) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println("세번째");
		System.out.println(Arrays.toString(strArr));
		
		// 참조 자료형 배열은 모양이 2차원 배열과 모양이 똑같아 직접 그림을 그려봐라..!!!
		// 이 개념을 아는 게 정말 중요해 ㅇㅋ?
		
	}
}
