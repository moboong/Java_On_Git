package kr.ac.kopo.day07;

import java.util.Scanner;

public class KeyboardTestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println(num);
		// 이렇게 버퍼를 비우고 올바르게 입력함. 이거 말고 밑에 방법도 있음
		
		int num02 = Integer.parseInt(sc.nextLine());
		//이런 방법도 있다. 이러면 정수는 정수대로 받고 버퍼가 싹 비워져.
		System.out.println(num02);
		
		String str = sc.nextLine();
		System.out.println(str);
		
		sc.close();
	}

}
