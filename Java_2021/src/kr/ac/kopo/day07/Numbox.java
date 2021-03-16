package kr.ac.kopo.day07;

public class Numbox {
	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multi(int a, int b) {
		return a * b;
	}
	
	public double div(double a, double b) {
		return a * b;
	}

	// 출력 오버라이딩
	public void printNum(int a) {
		System.out.println("출력 숫자 : " + a);
	}

	public void printNum(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.println("출력할 숫자들 : " + a[i]);
	}
}
