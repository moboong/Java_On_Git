package kr.ac.kopo.project02.ui;

import kr.ac.kopo.project02.vo.ClientVO;

public class LoginUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		ClientVO newClient = new ClientVO();
		
		String id = scanStr("☝ ID를 입력하세요[exit=종료] : ");
		if(id.equals("exit")) {
			System.out.println("======================================================================");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░오픈뱅킹 서비스 종료합니다.░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ ░ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ ᵔᴥᵔ ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▀▀▀░▄▄█▄▄░▄▀▀▄░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▀▀▀░▄▀░▀▄░█░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀▀▀░▀░░░▀░▀▄▄▀░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░ ⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞⎛⎝(•‿•)⎠⎞ ░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
			System.out.println("======================================================================");
			System.exit(0); // exit 입력시 종료
		}
		String pw = scanStr("✌ PW를 입력하세요 : ");
		
		newClient.setId(id);
		newClient.setPw(pw);
		
		ClientVO client = service.loginService(newClient);
		
		if(client.getId() != null) {
			session.setId(client.getId());
			session.setPw(client.getPw());
			session.setLac_dt(client.getLac_dt());
		} else {
			System.out.println("회원정보가 일치하지 않습니다.");
			execute();
		}
		System.out.println("-> [" + session.getId() + "]님 환영합니다.");

	}

}
