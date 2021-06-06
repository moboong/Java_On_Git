package kr.ac.kopo.day17;

import java.util.Date;

class TimeThread extends Thread {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("현재시간 : " + new Date().toLocaleString());
		}
	}
	
}

public class SleepMain {

	public static void main(String[] args) {
		
		
		TimeThread tt = new TimeThread();
		
		tt.start();
		
		while(true) {
			System.out.println("go!!!"); //이대로 두면 시간 절대 못찍어 너무 빨라서
			try {
				Thread.sleep(100);// 이렇게 얘도 잠시 블럭처리해줘야 시간 찍을 수 있어.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		/*
		System.out.println("Thread 2초 동안 잠이 들겠습니다."); // 메인스레드를 2초동안 블록으로 보내야해
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //단위 밀리 세컨
		
		System.out.println("Thread가 깨어났습니다.");
		*/
	}

}
