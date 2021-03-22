package kr.ac.kopo.day11.abs02;

public class LGPrinter extends Printer { //lv2
	
	@Override
	public void print() {
		System.out.println("엘지프린터에서 출력중...");
	}
	
	public void color() {
		System.out.println("형변환을 통해 엘지만의 독특한 기능");
	}
}