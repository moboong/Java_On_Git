package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b;
		
		b = a; //Shallow Copy
		
		//Deep Copy
		b = new int[a.length];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		//이러면 밑에 출력 결과 완전 달라져.
	
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));

		++b[0];
		System.out.println("a : " + Arrays.toString(a));
		System.out.println("b : " + Arrays.toString(b));
		// b만 바꿨는데 둘다 바뀜. Shallow Copy라서..
		
		System.out.println(a);
		System.out.println(b);
		// 부검 결과 같은 주소값이었네~
		
		// deep copy는 무조건 new 써야해
		
	}

}
