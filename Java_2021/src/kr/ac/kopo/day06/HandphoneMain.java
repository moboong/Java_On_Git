package kr.ac.kopo.day06;

public class HandphoneMain {

	public static void main(String[] args) {
		//"홍길동", "010-3667-6373", "삼성"
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phone = "010-3667-6373";
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name = "윤길동";
		hp2.phone = "010-8888-6373";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "한길동";
		hp3.phone = "010-9999-6373";
		hp3.company = "엘지";
		
		
		//이거 일일이 출력 개오바.
		//===========================================
		
		Handphone[] hpArr = new Handphone[3];
		hpArr[0] = hp;
		hpArr[1] = hp2;
		hpArr[2] = hp3;
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println(hpArr[i].name + hpArr[i].phone + hpArr[i].company);
		}
		
		//1.5 for문
		for(Handphone temp : hpArr) {
			System.out.println(temp.name + temp.phone + temp.company);
		}
		

	}

}
