package kr.ac.kopo.day17.homework;

import java.util.Random;

class CallCenter extends Thread {
	private int donation;
	private String no;

	public CallCenter(String type) {
		super(type);
		this.no = type;
	}

	public void getCall() {

		for (int i = 0; i < 10; i++) {
			int temp = call();
			System.out.println(no + "번 콜센터 : " + temp + "원 받았습니다.");
			donation += temp;
		}

		System.out.println(no + "번 콜센터 총 성금액 : " + donation + "원");

	}

	public int call() {
		Random r = new Random();
		int num = r.nextInt(10000) + 1000;
		return num;
	}

	public int total() {
		return this.donation;
	}
}

public class CallCenterMain {

	public static void main(String[] args) {

		CallCenter ct1 = new CallCenter("1");
		CallCenter ct2 = new CallCenter("2");
		CallCenter ct3 = new CallCenter("3");
		CallCenter ct4 = new CallCenter("4");

		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();

		try {
			ct1.join();
			ct2.join();
			ct3.join();
			ct4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("총 성금액 : " + (ct1.total() + ct2.total() + ct3.total() + ct4.total()));
	}

}