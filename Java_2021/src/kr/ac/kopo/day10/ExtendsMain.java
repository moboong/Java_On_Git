package kr.ac.kopo.day10;

class One {
	One() {
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One {
	Two() {
		System.out.println("Two 생성자 호출..."); // 여기에 super(); 이게 숨어있거듵.
	}
}

class Three extends Two {
	Three() {
		System.out.println("Three 생성자 호출...");
	}
}

class Four extends Three{
	Four(){
		System.out.println("Four 생성자 호출...");
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		new Four();

	}

}
