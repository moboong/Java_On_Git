package kr.ac.kopo.day01;

/*
 * 클래스, 변수, 메소드 개수?
 * 
 * 클래스 : 3개(Naming, System, String)
 * 변수 : 3개(num, args, **out)
 * 메소드 : 2개( main(), println() )
 */

public class NamingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		System.out.println(num); //System클래스 안에 out 이라는 변수가 있다. 그 out은 PrintStream의 객체임.
		//doc 레퍼런스 살펴보면 System클래스의 변수 볼 수 있어.(err, in, out)
		//그래서 print나 println, printf를 사용하려면 out에 담겨있어서 out에서 사용하야함.
	}	
}
