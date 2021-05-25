package kr.ac.kopo.day17;

//join
public class ThreadMain03 {

	public static void main(String[] args) {

		ExtendsThread et = new ExtendsThread();

		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);

		System.out.println("감독을 시작합니다.");

		et.start();
		t.start();

		try {
			et.join();// 이거 때문에 얘를 포함하는 메인 스레드가 이놈이 종료하기 전까지 블럭이 돼.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t.join();// 이거 때문에 얘를 포함하는 메인 스레드가 이놈이 종료하기 전까지 블럭이 돼.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("감독을 종료합니다."); //순서상 감~종이 제일 마지막인거 같지만
		//join이 없잖아? 제일 먼저 끝나는 놈이 바로 이놈이야. 그래서 얘를 가장 뒤로 보내려면 join을 써서
		//위의 스레드 두개가 끝나기 전까지는 현재 메인 스레드가 실행되지 않게 한거야.

	}

}
