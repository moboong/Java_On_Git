package kr.ac.kopo.day12.inter02;

public class LGTV implements TV {
	
	
	public LGTV() {
		System.out.println("LGTV 구매완료");
	}

	@Override
	public void powerOn() {
		System.out.println("LGTV 파워온");

	}

	@Override
	public void powerOff() {
		System.out.println("LGTV 파워 오프");

	}

	@Override
	public void channelUp() {
		System.out.println("LGTV 채널 업");

	}

	@Override
	public void channelDown() {
		System.out.println("LGTV 채널 다운");

	}

	@Override
	public void soundUp() {
		System.out.println("LGTV 사운드 업");

	}

	@Override
	public void soundDown() {
		System.out.println("LGTV 사운드 다운");
	}

	@Override
	public void mute() {
		System.out.println("LGTV 음소거");

	}

}
