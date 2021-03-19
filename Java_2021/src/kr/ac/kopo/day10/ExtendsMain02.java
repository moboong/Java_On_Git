package kr.ac.kopo.day10;

public class ExtendsMain02 {

	public static void main(String[] args) {
		//사원번호1,이름 홍길동, 연봉 4000, 사원 ->  객체 생성
		Employee e = new Employee(1, "홍길동", 4_000, "사원");
		Employee e2 = new Employee(2, "윤길동", 4_200, "사원");
		Employee e3 = new Employee(3, "강길동", 4_800, "대리");
		Employee e4 = new Employee(4, "한길동", 5_500, "과장");
		Employee e5 = new Employee(5, "고길동", 6_500, "과장");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] el = {e3,e4,e5};
		Manager m = new Manager(100, "나부장", 9_000, "부장", el);
		m.info();
	}

}
