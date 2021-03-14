package kr.ac.kopo.day05.homework;

import java.util.Arrays;

public class Homework0312d {

	public static void main(String[] args) {
		int[] arr = new int[99];
		for(int i = 0; i < 99; i++){
			arr[i] = i+2;
		}
		
		for(int i = 0; i < 99; i++){
			for(int j = 2; j < arr[i]; j++){
				if(arr[i] % j == 0){
					arr[i] = 0;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
