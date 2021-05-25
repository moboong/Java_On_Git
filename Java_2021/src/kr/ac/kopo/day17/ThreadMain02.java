package kr.ac.kopo.day17;
/*
   Thread 구성 2가지
   1. Thread 클래스를 상속 구현
   2. Runable 인터페이스를 상속 구현 
*/

class ExtendsThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + "번째 눈 붙이기");
		}
	}

}

class ImplementThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + "번째 코 붙이기");
		}
	}

}

public class ThreadMain02 {

	public static void main(String[] args) {

		ExtendsThread et = new ExtendsThread();

		et.start();

		ImplementThread it = new ImplementThread();
		// it는 start()가 없네?..

		Thread t = new Thread(it); //묵시적 형변환을 활용하여 start() 사용할 수 있게 가공
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + "번째 감독중...");
		}
		//메인 스레드도 사실 존재해. 그래서 그 놈도 돌아가니까 총 3개의 스레드가 서로 경쟁하며 돌고 있어
		//그래서 직관적으로는 위의 두 스레드가 끝나고 감독이 실행될 줄 알았는데 아니고
		//셋다 섞여서 작동함.
		
		

	}

}
