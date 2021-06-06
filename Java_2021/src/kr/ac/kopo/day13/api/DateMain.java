package kr.ac.kopo.day13.api;

import java.util.Date;



public class DateMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog("멍이", 2);
		System.out.println(dog); //오버라이드 안하면 당연하게도 주소값이 출력 되겠지?


		// 오늘은 3월 24일입니다.
		Date d = new Date();
		System.out.println("d :" + d); //?엥 주소값 찍혀야하는데? 
		// 이거 왜 그러냐 -> toString오버라이딩해서
		
		@SuppressWarnings("deprecation")
		int year = d.getYear() + 1900;
		@SuppressWarnings("deprecation")
		int month = d.getMonth() + 1;
		@SuppressWarnings("deprecation")
		int date = d.getDate();
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일");

	}

}

class Dog{
	String name;
	int age;
	
	public Dog() {
		
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
