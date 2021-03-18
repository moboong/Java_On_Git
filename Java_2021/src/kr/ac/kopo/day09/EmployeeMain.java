package kr.ac.kopo.day09;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee.printTotalEmployee(); //e.print~~이렇게 하면 여기서 실행안돼.
		// 하지만 0명이란것도 찍을 수 있어야하니까! 그래서 접근법은 클래스명.static메소드
		
		Employee e = new Employee("홍길동", 3200, "사원");
		e.info();
		Employee e2 = new Employee("강길동", 4000, "주임");
		e2.info();
		Employee e3 = new Employee("윤길동", 3600, "사원");
		e3.info();
		
		System.out.println(e.getName());
		
		//이제 메인메소드에서는 객체 생성과 메소드 사용 이렇게만 남게 된다.
		//그럼에도 아직은 e.name 이런식으로 접근은 아직 가능해.
		//e.name을 못쓰게 하고 싶다? 그럼 접근제한자를 활용하면돼.
		//public:누구나 다 접근할 수 있어, private:내클래스 내에서만 쓰게할거야.
	}

}
