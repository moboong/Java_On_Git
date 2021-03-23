package kr.ac.kopo.day11.homework;

public class Circle extends Figure { // Lv2
	private int radius;
	public static final double PI = Math.PI;

	public Circle() {
		this.radius = r.nextInt(8) + 2;
	}
	
	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		System.out.println("원");
		System.out.println("반지름 " + getRadius() + "인 원 넓이 : " + getArea());
	}

}
