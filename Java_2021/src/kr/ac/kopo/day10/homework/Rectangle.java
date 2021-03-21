package kr.ac.kopo.day10.homework;

public class Rectangle extends Figure {
	public Rectangle() {
		
	}
	
	public int getSpace(){
		return super.getWidth() * super.getHeight();
	}
	
	public void print(){
		System.out.println("가로 " + super.getWidth() + " 세로 " + super.getHeight() + "의 직사각형 면적은 " + getSpace() + "입니다.");
	}
}
