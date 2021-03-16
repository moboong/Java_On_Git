package kr.ac.kopo.day07.homework;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setNum();
		
		c.add();
		c.minus();
		c.multi();
		c.divi();
		System.out.println(c.check(c.num));
		System.out.println(c.check(c.num2));
	

	}

}
