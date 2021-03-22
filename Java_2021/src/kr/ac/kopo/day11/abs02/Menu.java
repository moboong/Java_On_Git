package kr.ac.kopo.day11.abs02;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public int selectMenu() {
		System.out.print("LV2 프린터를 선택하세요(1.LG, 2.삼성 3.HP) => ");
		int no = sc.nextInt();
		sc.nextLine();
		
		return no;
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	
	public void print(int no) {
		Printer p = null; // 오... 이거로 코드 엄청 줄어드네
		// 선언할때 마다 반복되는 객체형의 등장을 최소화하기 위해 부모객체에서 부를 수 있어.
		// 이러면 새로운 객체를 추가하고 관련 코드를 추가해도 작업이 최소화돼.
		// 이러한 것은 객체의 형변환이다....!!!!! 객체 형변환... !! 겁나 혁신
		
		
		switch(no) {
		case 1:
			p = new LGPrinter();
			LGPrinter c = (LGPrinter) p;
			c.color();
			break;
		case 2:
			p = new SamsungPrinter();
			break;
		case 3:
			//p = new HPInkjetPrinter();
			p = new HPLaserPrinter();
			break;
		}
		if(p != null) {
			p.print(); //와... 이건 혁신이다... 3번 반복하던 print를 한번만....
		} else {
			System.out.println("잘못선택했습니다."); //예외처리해주자.
		}
		// => 이로써 변화에 매우 둔감해졌다.
	}
}
