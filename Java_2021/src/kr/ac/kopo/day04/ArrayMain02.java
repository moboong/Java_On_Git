package kr.ac.kopo.day04;

public class ArrayMain02 {

	public static void main(String[] args) {
		int[][] arr = new int[4][];
		System.out.println(arr);
		System.out.println(arr[0]); //1차원에서는 주소가 아닌 실제값이지만 2차원배열에서는 주소값
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}
		
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				System.out.print(arr[i][j] + " ");
				num++;
			}
			System.out.println();
		}
		
	}

}
