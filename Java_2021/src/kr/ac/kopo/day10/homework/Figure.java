package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class Figure {
	private int width;
	private int height;

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public Figure() {
		this.width = r.nextInt(8) + 2;
		this.height = r.nextInt(8) + 2;
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

	public void select() {
		System.out.print("도형을 선택하시오(1.직사각형, 2.정사각형, 3.삼각형, 4.원) => ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num == 1) {
			Rectangle r = new Rectangle();
			r.print();
		} else if (num == 2) {
			Square s = new Square();
			s.print();
		} else if (num == 3) {
			Triangle t = new Triangle();
			t.print();
		} else if (num == 4) {
			Circle c = new Circle();
			c.print();
		} else {
			select();
		}
	}

}
