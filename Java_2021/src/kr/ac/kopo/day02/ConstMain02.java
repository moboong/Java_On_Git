package kr.ac.kopo.day02;

public class ConstMain02 {
	public static void main(String[] args) {
		char ch = 'A';
		ch = 65;
		
		ch = '\u0041'; // 4자리가 필요. 2바이트 2개. 'A'
		
		ch = '\uAC00'; // '가'
		System.out.println("문자" + ch);
	}
}
