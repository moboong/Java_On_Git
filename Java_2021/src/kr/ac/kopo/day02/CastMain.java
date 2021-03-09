package kr.ac.kopo.day02;

public class CastMain {

	public static void main(String[] args) {
		
		System.out.println(10 + 20); // int + int = int 30
		
		System.out.println('A' + 20); // 문자 + int = ?
		//컴퓨터가 알아서 A를 int로 본다. 이게 바로 묵시적 형변환.
		
		System.out.println(12.3 + 45); //double + int = ?
		//큰거는 더블임. 그래서 45앞메 (double써야함.) 근데 안써도됨. 묵시적
		
		//정수 + 정수로 출력하기를 원한다면?
		System.out.println( (int) 12.3 + 45);
		//*****이때 이 (int)는 생략 가능?? ㄴㄴㄴ 무조건 있어야함. 이게바로 명시적 형변환
		
		
		// 대입에서도 마찬가지
		double num = 12;
		// int num2 = 12.34; 에러뜸. 못 넣어.
		int num2 = (int) 12.34;
		
		System.out.println(num);
		System.out.println(num2);
	
	}

}
