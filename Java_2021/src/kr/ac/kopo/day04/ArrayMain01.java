package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain01 {

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50};
		System.out.println(arr);
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[arr.length -1 - i]);
		}
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = i+1;
		}
		// for & index (1)
		System.out.println("방식1");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for-each문 (2)
		System.out.println("방식2");
		for(int num : arr) {
			System.out.println(num);
		}
		
		// Arrays.toString() 메소드 (3)
		System.out.println("방식3");
		System.out.println(Arrays.toString(arr));
	}

}
