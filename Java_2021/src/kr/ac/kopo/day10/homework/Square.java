package kr.ac.kopo.day10.homework;

public class Square extends Figure {
	public Square() {

	}

	public int getSpace() {
		return super.getWidth() * super.getWidth();
	}

	public void print() {
		System.out.println("가로 " + super.getWidth() + "의 정사각형 면적은 " + getSpace() + "입니다.");
	}
}
