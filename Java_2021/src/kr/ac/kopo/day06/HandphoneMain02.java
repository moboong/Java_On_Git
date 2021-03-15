package kr.ac.kopo.day06;

public class HandphoneMain02 {

	public static void main(String[] args) {
		Handphone[] hpArr = new Handphone[3];
		
		System.out.println(hpArr[0]);
		//System.out.println(hpArr[0].name); // 이건 안된다. 이거 중요. 왜냐면 배열은 만들었지만 실제 인스턴스 객체는 안만들어짐..!
		
		
		
		for(int i  = 0; i < hpArr.length; i++) {
			hpArr[i] = new Handphone(); // 이 과정을 꼭 거쳐야해.
		}
		
		hpArr[0].name = "홍길동";
		hpArr[0].phone = "010-2222-3333";
		hpArr[0].company = "삼성";
		
		hpArr[1].name = "윤길동";
		hpArr[1].phone = "010-4444-3333";
		hpArr[1].company = "애플";
		
		hpArr[2].name = "한길동";
		hpArr[2].phone = "010-6666-3333";
		hpArr[2].company = "엘지";

		for(int i = 0; i < hpArr.length; i++) {
			System.out.println(hpArr[i].name + hpArr[i].phone + hpArr[i].company);
		}

	}

}
