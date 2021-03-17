package kr.ac.kopo.day07.homework;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c = new Calculator(); //없으면 입력을 받고
		c.calAll();
		
		Calculator c2 = new Calculator(20, 5); //있으면 입력 x
		c2.calAll();
	}

}
