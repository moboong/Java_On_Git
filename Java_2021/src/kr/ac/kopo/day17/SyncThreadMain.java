package kr.ac.kopo.day17;

class Sync {
	public synchronized void a() { // synchronized 키워드를 사용해서 공유 자원 사용시 락을 걸어두기
		for (int i = 0; i < 10; i++) {
			System.out.print('a');
		}
	}

	public synchronized void b() {
		for (int i = 0; i < 10; i++) {
			System.out.print('b');
		}
	}

	public synchronized void c() {
		for (int i = 0; i < 10; i++) {
			System.out.print('c');
		}
	}
	
	public void d() {
		System.out.print(1);
		System.out.print(2);
		synchronized (this) {
			System.out.print(3);
			System.out.print(4);
			System.out.print(5);
		} //이러한 동기화 블럭도 사용할 수 있어. 우리가 맨날 사용하는 println도 동기화 블록을 사용한다네
		System.out.print(6);
	}
}

class SyncThread extends Thread {
	
	private Sync sync;
	private int type;
		
	public SyncThread(Sync sync, int type) {
		this.sync = sync;
		this.type = type;
	}

	@Override
	public void run() {
		switch(type) {
		case 1:
			sync.a();
			break;
		case 2:
			sync.b();
			break;
		case 3:
			sync.c();
			break;
		case 4:
			sync.d();
			break;
		
		}
	}

}

public class SyncThreadMain {

	public static void main(String[] args) {

		Sync sync = new Sync();

		SyncThread st1 = new SyncThread(sync,1);
		SyncThread st2 = new SyncThread(sync,2);
		SyncThread st3 = new SyncThread(sync,3);
		SyncThread st4 = new SyncThread(sync,4);
		
		st2.start();
		st1.start();
		st3.start();
		st4.start();
	}

}


//동기화 개념 등장:
//마치 트랜잭션 작동 방식과 매우 비슷
