package kr.ac.kopo.day07;

public class MethodMain01 {
	
	/**
	 * 임의 문자를 반복하여 출력하는 기능
	 * @param c 출력할 문자
	 * @param cnt 출력회수
	 */
	
	public static int printStar(char c,int cnt) { // printStar()는 피호출자 메소드
		System.out.println("---"); // println()은 피호출자이고 여기서 printStar는 호출자 메소드가 된다. 
		
		// 이제는 별찍는 횟수를 달리하고 싶어
		for(int i = 0; i < cnt; i++) { // 매개변수 만들어주고
			System.out.print(c);
		}
		System.out.println();
		return 20;
		
	}

	public static void main(String[] args) { // main()은 호출자 메소드
		
		
		System.out.println("*****************");
		System.out.println("Hello");
		System.out.println("*****************");
		System.out.println("Hi");
		System.out.println("*****************");
		System.out.println("what?");
		System.out.println("*****************");
		System.out.println("Come On");
		System.out.println("*****************");
		
		// 노가다 오바야. 이거 수정은 어떻게 해 ㅜㅜ
		// 그래서 메서드를 사용해!
		
		printStar('*',10); //에러 남 그래서 static 붙여줌.
		System.out.println("Hello");
		printStar('^',20); //호출자가 피호출자에게 그냥 프린트가 아니가 20개 라고 대화를 검.
		System.out.println("Hi");
		printStar('~',12);
		System.out.println("what?");
		printStar('-',3);
		System.out.println("Come On");
		int data = printStar('=',7); // return값을 받을 그릇이 필요해. 대입연산자를 통해 그 값을 받음.
		System.out.println(data); // 20
		// 이건 하나만 수정해도 다 적용돼. 겁나 편해.
	}

}
