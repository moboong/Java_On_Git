package kr.ac.kopo.day12.inter02;

public class UserMain {

	public static void main(String[] args) {
		//묵시적 형변환
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
		tv.soundDown();
		tv.soundUp();
		tv.mute();
		tv.mute();
		tv.powerOff();
		
		//명시적 형변환
		SamsungTV stv = (SamsungTV) tv;
		stv.samsungPay();

		tv = new LGTV();
		tv.powerOn();
		tv.channelDown();
		tv.channelUp();
		tv.soundDown();
		tv.soundUp();
		tv.mute();
		tv.powerOff();

		//이게 다형성!!! 삼성도 엘지도 다 받을 수 있는 거
	}

}
