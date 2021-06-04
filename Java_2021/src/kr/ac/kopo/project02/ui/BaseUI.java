package kr.ac.kopo.project02.ui;

import java.util.Scanner;

import kr.ac.kopo.project02.service.BankingService;

public abstract class BaseUI implements IBankingUI {
	private Scanner sc;
	protected BankingService service;

	public static Session session = new Session();// 세션 객체

	// 생성자
	public BaseUI() {
		sc = new Scanner(System.in);
		service = new BankingService();
	}

	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();	
		
		return str;
	}

	protected int scanInt(String msg) {
		int num = 0;
		try {
			num = Integer.parseInt(scanStr(msg));
		} catch (Exception e) {
			System.out.println("숫자 외에 다른 것이 입력됐습니다.");
			scanInt(msg);
		}
		
		return num;
	}

}
