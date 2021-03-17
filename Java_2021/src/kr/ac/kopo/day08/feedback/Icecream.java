package kr.ac.kopo.day08.feedback;

public class Icecream {
	String name;
	int price;
	
	void set(String n, int p) {
		name = n;
		price = p;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	//get set을 쓰는 이유..!! 메소드 위주 통신을 위해..!!
	//멤버변수 직접 접근은 지양해. (은닉성, 유지보수 측면)
	
}
