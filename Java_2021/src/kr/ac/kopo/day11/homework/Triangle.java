package kr.ac.kopo.day11.homework;

public class Triangle extends Figure { // Lv2
	private int width;
	private int height;

	public Triangle() {

		this.width = r.nextInt(8) + 2;
		this.height = r.nextInt(8) + 2;
	}

	@Override
	public void printArea() {
		System.out.println("삼각형");
		System.out.println("넓이 " + getWidth() + " 높이 " + getHeight() + "인 삼각형 넓이 : " + getArea());
	}

	public int getArea() {
		return (width * height) / 2;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
