package kr.ac.kopo.day10;

public class Manager extends Employee {

	private Employee[] empList; //관리 사원 목록
	
	public Manager(){
		
	}// 이것도 누군가가 상속해갈 수 있으니 기본 생성자 만들어놔야해.
	
	public Manager(int no, String name, int salary, String grade, Employee[] empList){
		super(no, name, salary, grade); //멤버변수 private해도 잘 작동해.
		this.empList = empList;
		
	}
	
	@Override
	void info() {
		super.info(); // 이게 생략이거나 this이면 안되는거야..! this면 재귀가 돼. 명확히 부모메소드를 호출한다고 명시해줘야해.
		System.out.println("=====관리사원 목록=====");
		for(Employee e : empList) {
			e.info();
		}
	}
	// 이런 경우는 메소드 오버라이딩이야!!!!
	// 부모 메소드와 자식 메소드 이름이 같을때
	// 메소드 오버라이딩은 상속관계에.서.만. (= 메소드 재정의 부모의 메소드는 사용하되 조금 튜닝하고 싶은거임 ㅇㅇ)
	
}
