package kr.ac.kopo.day10;

//사원클래스
public class Employee {
	
	private int no;
	private String name;
	private int salary;
	private String grade;
	
	public Employee(){
		
	}// 와.... 소름돋아.... 이거 왜 항상 습관적으로 만들라고 했는지 이제 알았다.
	// 밑에서 super()이게 생략되어있고 이건 Employee() 이놈이니까..
	
	
	public Employee(int no, String name, int salary, String grade){
		this.no =no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원번호 : " + no + ", 이름 : " + name + ", 연봉: " + salary + ", 직급 : " + grade);
	}
}
