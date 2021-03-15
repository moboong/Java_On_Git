package kr.ac.kopo.day06;

// 실행 클래스 -> 추상화는 없지만 여기서 인스턴스가 생성되고 실행된다.
public class CarMain {
	
	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car();
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(c.name);
		System.out.println(c2.name);
		
		c.name = "G70";
		c.price = 7000;
		c.company = "Hyundai";
		
		c2.name = "K7";
		c2.price = 3000;
		c2.company = "Kia";
		
		System.out.println("모델명: " + c.name + " 가격: " + c.price + " 제조사명: " + c.company);
		System.out.println("모델명: " + c2.name + " 가격: " + c2.price + " 제조사명: " + c2.company);
		
		
//		c = c2;  // 이거 기억나? Shallow Copy야. 이거하면 c가 가리키던 주소값 까먹어.
		// 그래서 유령공간이 생겨. 이러한 참조변수의 무분별한 대입은 유령공간이 많아지고 그럼 메모리 부족이 일어나.
		// 그래서 실제 메모리에서 삭제하는 작업도 중요해.(근데 자바는 그걸 알아서 해줘. 가비지 콜렉터.)
	}

}
