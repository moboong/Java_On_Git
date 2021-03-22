package kr.ac.kopo.day11.homework;

public class Square extends Rectangle { // Lv3
	public Square() {
		super.setHeight(getWidth()); // 양변이 같아짐.
	}

	@Override
	public void printArea() {
		System.out.println("정사각형");
		System.out.println("넓이 " + getWidth() + " 높이 " + getHeight() + "인 정사각형 넓이 : " + getArea());

	}

}
