package kr.ac.kopo.day09;

public class Employee {

	private String name;
	private int salary;
	private String grade;
	private static int totalEmployee;

	Employee() {
		++Employee.totalEmployee;
	}

	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		++Employee.totalEmployee;
	}

	void info() {
		System.out.println(this.name + this.salary + this.grade);
		Employee.printTotalEmployee();
	}

	static void printTotalEmployee() { // 일반적으로 스태틱을 사용한 메소드는 static메소드로 만든다.
		System.out.println(Employee.totalEmployee);
	}

	// getter메소드
	public String getName() {
		return this.name;
	}

	public int getSalery() {
		return this.salary;
	}

	public String getGrade() {
		return this.grade;
	}

	// setter메소드
//	public void setName(String name) {
//		this.name = name;
//	} 이름은 변경못하게 하기 위해 이걸 안만들면돼.

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
