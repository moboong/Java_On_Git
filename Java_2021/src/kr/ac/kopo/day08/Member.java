package kr.ac.kopo.day08;

public class Member {
	
	String name;
	int age;
	String bloodType;
	
	Member(){
		this("이름모름");
	}
	
	Member(String name){
		this(name, -1);
	}
	
	Member(String name, int age){
		this(name, age, "혈액형모름");
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	//와.... 이건 소름이다. 밑에 보다 훨씬 좋다... ㅁㅊ다.
	//물론 이렇게 할 경우는 많지 않아.
	//그리고 호출 부하가 커. 속도가 많이 느리긴해.
	
	
//	Member(){
//		this("알수없음", -1, "알수없음");
//	}
//	
//	Member(String name){
//		this(name, -1, "알수없음");
//	}
//	
//	Member(String name, int age){
//		this(name, age, "알수없음");
//	}
//	
//	Member(String name, int age, String bloodType){
//		this.name = name;
//		this.age = age;
//		this.bloodType = bloodType;
//	} 
	// 요놈덕분에 위에가 다 줄어듦. 근데 이렇게 만드는 건 의미가 없어. 좋은 방식 x
	
	void info() {
		System.out.println("이름:" + name + "   나이:" + age + "   혈액형:" + bloodType);
	}
}
