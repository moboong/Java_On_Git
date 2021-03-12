package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b = {5, 7, 8, 9, 20, 23};
		
		// c = {10, 20, 30, 5, 7, 8, 9, 20, 23}로 만들고 싶어
		int[] c = new int[a.length + b.length];
		int loc = 0;
		for(int i = 0; i < a.length; i++) {
			c[loc++] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[loc++] = b[i];
		}
		
		// 그대로 복사 하든지, 배열 두개를 합치든 간에 for문 쓰고 난리부르스다.
		// 그래서 이걸 편하게 하기 위한 함수가 탄생했어..!! Sys.arraycopy
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));

		++b[0];
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		System.out.println("c : " + Arrays.toString(c));
		// b만 바꿨는데 둘다 바뀜. Shallow Copy라서..
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
