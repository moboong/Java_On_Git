package kr.ac.kopo.day12.inter02;

public interface TV {

	/* public static final */ int MAX_VOLUME_SIZE = 50; // 네이밍 룰에 의거. static없어도 글씨 기울어진거 보이지? static 적용됨.
	int MIN_VOLUME_SIZE = 0;

	/* public abstract */ void powerOn();

	void powerOff();

	void channelUp();

	void channelDown();

	void soundUp();

	void soundDown();

	void mute();
	
	default void copyright() { //이게 있다고 해서 이걸 사용하라는 게 아니야. 불가피한 상황에 사용하라고 만들어놓은거야.
		System.out.println("모든 기술을 TV협회에 귀속됩니다.");
	}
}
