package kr.ac.kopo.day07;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가진 기능클래스
 * 
 * @author HP
 *
 */

public class Gugudan {
	Scanner sc = new Scanner(System.in); // 메서드 내에 선언하면 메서드 호출할때마다 생성하니까 메모리 낭비 심해. 그래서 이렇게 멤버변수로 ㄱㄱ
	//이것도 진짜 중요하네. sc.close()안해도 느낌표 안떠. 왜냐면 sc가 메서드 내에서 생성되고 바로 삭제되어서 알아서 닫히는 느낌?
	
	/**
	 * 특정 단을 출력하는 메소드
	 * @param dan
	 */
	void print(int dan) {
		System.out.println("***" + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	/**
	 * 2-9단 전체출력하는 메소드
	 */
	void print() {
//		for (int dan = 2; dan <= 9; dan++) {
//			print(dan); // 오... 이거 기발하다. 원래는 this.print(i) 인데 생랴가능.
//		}
		//이걸 그럼... 이걸로 바꾸면..? 대박...
		print(2, 9);
	}
	
	/**
	 * 시작단부터 종료단까지 출력하는 메소드
	 * @param sDan 시작단
	 * @param eDan 종료단
	 */
	void print(int sDan, int eDan) {
		for (int dan = sDan; dan <= eDan; dan++) {
			print(dan); // 오... 이거 기발하다. 원래는 this.print(i) 인데 생랴가능.
		}
	}
	
	int getDan() {
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String s) {
		System.out.println(s);
		int dan = getDan(); // 이것도 위에거를 이용해서 추후 줄어든 코드.
		return dan;
	}

}
//이러면 무언가를 바꿀데 하나만 바꿔도 다 바뀜. 유지보수에 유용하다. 중복된 코드를 줄이는 습관을 들이자.
//과연 객체지향스럽게 짜는 코딩이랑? 이것에 대해 고찰해보자.