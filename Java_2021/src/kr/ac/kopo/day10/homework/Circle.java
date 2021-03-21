package kr.ac.kopo.day10.homework;

public class Circle extends Figure {
	public static double PI = Math.PI; 
	
	public Circle(){
		
	}
	
	public double getSpace(){
		return super.getWidth() * super.getWidth() * PI;
	}
	
	public void print() {
		System.out.println("반지름 " + super.getWidth() +  "의 원 면적은 " + getSpace() + "입니다.");
	}
}
