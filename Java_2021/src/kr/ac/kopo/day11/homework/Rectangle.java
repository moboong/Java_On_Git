package kr.ac.kopo.day11.homework;

import java.util.Random;

public class Rectangle extends Figure { //Lv2
	private int width;
	private int height;
	Random r = new Random();
	
	public Rectangle() {
		
		this.width = r.nextInt(8) + 2;
		this.height =  r.nextInt(8) + 2;
	}
	
	@Override
	public void printArea() {
		System.out.println("직사각형");
		System.out.println(getWidth());
		System.out.println(getHeight());
		System.out.println(getArea());
	}
	
	public int getArea() {
		return width * height;
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
