package kr.ac.kopo.day10.homework;

public class Triangle extends Figure {
	public Triangle() {

	}

	public int getSpace() {
		return (super.getWidth() * super.getHeight()) / 2;
	}

	public void print() {
		System.out.println("가로 " + super.getWidth() + " 세로 " + super.getHeight() + "의 삼각형 면적은 " + getSpace() + "입니다.");
	}
}
