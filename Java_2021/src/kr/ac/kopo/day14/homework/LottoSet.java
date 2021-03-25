package kr.ac.kopo.day14.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {
	Set<Integer> set;
	Random r = new Random();

	public void pickAlgoCaseThree(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.print("게임 " + i + ": ");
			set = new HashSet<>();

			while (set.size() < 6) { // Set이라 알아서 중복체크함.
				int num = r.nextInt(45) + 1;
				set.add(num);
			}
			Object[] arr = set.toArray();
			System.out.println(Arrays.toString(arr));
		}
	}

}
