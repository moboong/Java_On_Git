package kr.ac.kopo.day11.homework;

import java.util.Scanner;

public class FigureMenu {

	Scanner sc = new Scanner(System.in);

	public int select() {
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원) => ");
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void choice() {
		int type = select();
		print(type);
	}

	public void print(int type) {
		Figure f = null;

		switch (type) {
		case 1:
			f = new Rectangle();
			break;
		case 2:
			f = new Square();
			break;
		case 3:
			f = new Triangle();
			break;
		case 4:
			f = new Circle();
			break;
		}
		if (f != null) {
			f.printArea();
		} else {
			System.out.println("잘못선택.");
		}
	}
}
