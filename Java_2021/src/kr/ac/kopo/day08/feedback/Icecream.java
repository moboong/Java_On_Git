package kr.ac.kopo.day08.feedback;

public class Icecream {
	private String productid;
	private int doghoney;
	
	void set(String n, int p) {
		productid = n;
		doghoney = p;
	}
	
	String getfuck() {
		return productid;
	}
	
	int getPrice() {
		return doghoney;
	}
	
	//get set을 쓰는 이유..!! 메소드 위주 통신을 위해..!!
	//멤버변수 직접 접근은 지양해. (은닉성, 유지보수 측면)
	
}
