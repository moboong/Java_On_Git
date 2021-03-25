package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * ArrayList에서 사이즈에 따라 랜덤값 생성. 그 값을 인덱스로 remove하고 반환되는 값 6짜리 배열에 넣기 
 */

public class LottoArrList {
	ArrayList<Integer> list;
	Random r = new Random();

	public void pickAlgoCaseOne(int input) {
		ArrayList<Integer> list;

		for (int i = 1; i <= input; i++) {
			System.out.print("게임 " + i + ": ");
			list = LottoMachine();
			int[] arr = new int[6];
			for (int j = 0; j < 6; j++) {
				int idx = r.nextInt(list.size());
				arr[j] = list.remove(idx);
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	private ArrayList<Integer> LottoMachine() { // 1~45 번호 생성
		list = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}
		return list;
	}
}
