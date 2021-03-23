package kr.ac.kopo.day12.inter01;

public class UserMain {

	public static void main(String[] args) {
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.volumeUp();
		sam.volumeDown();
		sam.channelDown();
		sam.channelUp();
		sam.powerOff();
		
		LGTV lg = new LGTV();
		//lg.powerOn();
		//lg.volumeUp();
		//lg.volumeDown();
		lg.channelDown();
		lg.channelUp();
		//lg.powerOff();
	}

}
