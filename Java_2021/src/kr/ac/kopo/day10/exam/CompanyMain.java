package kr.ac.kopo.day10.exam;

public class CompanyMain {

	public static void main(String[] args) {
		Employee e = new Employee(1,"홍길동",3800,"사원");
		e.info();
		
		Employee[] el = {e};
		
		Manager m = new Manager(101, "이재용", 9000, "부사장", el);
		m.info();

	}

}
