package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b;
		
		b = new int[a.length];
		
		//함수 사용!!
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		
		
		// 두 배열 합쳐서 c배열 만들기
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length); //시작점 조절하는 거 주의해!
		
		System.out.println("c : " + Arrays.toString(c));
		// 유용하긴하네~
	}

}
