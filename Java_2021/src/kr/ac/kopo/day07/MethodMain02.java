package kr.ac.kopo.day07;

public class MethodMain02 {

	public static void main(String[] args) {
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(12.34);
		m.call("Hello");
		m.call('A'); // char 매개변수 메소드가 없으면 <묵시적 형변환>이 일어나고 이는 가장 가까운 범위로 간다. 그래서 int. int가 없으면 double 
		
		m.call("hello", true);
		m.call(true, "hello");
	}

}
