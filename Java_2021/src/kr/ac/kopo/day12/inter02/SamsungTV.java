package kr.ac.kopo.day12.inter02;

public class SamsungTV implements TV {

	private String modelName;
	private boolean power;
	private int channelNo;
	private int volumeSize;
	private boolean muteToggle;
	private int currentVol;

	public SamsungTV() {
		System.out.println("삼성TV 구매완료");
		modelName = "삼성티비";
		power = false;
		channelNo = 3;
		volumeSize = 10;
		muteToggle = false;

	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("삼성TV 파워온");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("삼성TV 파워 오프");

	}

	@Override
	public void channelUp() {
		System.out.println("삼성TV 채널 업");
		channelNo++;
		if (channelNo == 100)
			channelNo = 0;
		info();

	}

	@Override
	public void channelDown() {
		System.out.println("삼성TV 채널 다운");
		channelNo--;
		if (channelNo == 0)
			channelNo = 100;
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("삼성TV 사운드 업");

		if (muteToggle) {
			volumeSize = currentVol;
			muteToggle = false;
		}

		if (volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("삼성TV 사운드 다운");
		if (volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		info();
	}

	@Override
	public void mute() {

		if (muteToggle) {
			System.out.println("음소거 해제");
			volumeSize = currentVol;
			muteToggle = false;
			info();
		} else {
			System.out.println("음소거");
			currentVol = volumeSize;
			volumeSize = TV.MIN_VOLUME_SIZE;
			muteToggle = true;
			info();
		}
	}

	public String getName() {
		return modelName;
	}

	public boolean getPower() {
		return power;
	}

	// 얘를 powerOn()에서 불러서 씀. 이 클래스 내부에서만 쓸거면 private으로 숨겨줘도 돼. 밖에서 못쓰게
	private void info() {
		System.out.println(channelNo + " / " + volumeSize);
	}

	// 특별한 기능
	public void samsungPay() {
		System.out.println("*****삼성페이로 결제*****");
	}

}
