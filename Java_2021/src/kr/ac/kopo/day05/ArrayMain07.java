package kr.ac.kopo.day05;

public class ArrayMain07 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		
		// a배열의 모든 요소에 100을 더하자
		
//		for(int i = 0; i < a.length; i ++) {
//			a[i] = a[i] + 100;
//		}
		
		for(int num : a) {
			System.out.println(num);
		}
		// 1.5버전은 (for-each는 벡터계산에는 적합하지 않아. 읽기전용이야 쓰기못해.)
	}

}



