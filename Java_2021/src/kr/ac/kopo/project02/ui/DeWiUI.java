package kr.ac.kopo.project02.ui;

import kr.ac.kopo.project02.vo.AccountVO;

public class DeWiUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		AccountVO newAccount = new AccountVO();
		//보내고자 하는 정보: 내 계좌, 내 아이디, 금액
		
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("\t\t\t1. 입금(ATM or 창구)");
		System.out.println("\t\t\t2. 출금(ATM or 창구)");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		int type = scanInt("☝ 번호를 입력하세요 : ");
		
		
		if(type == 1) {
			newAccount.setAlias("입금");//임시로 타입으로 사용
		} else if(type == 2) {
			newAccount.setAlias("출금");//임시로 타입으로 사용
		} else {
			System.out.println("잘못된 입력입니다. 재입력하세요.");
			execute();
		}
		newAccount.setAccount_id(session.getId());
		String accno = scanStr("입/출금할 계좌의 계좌번호를 입력하세요 : ");
		newAccount.setAccount_no(accno);
		
		long amount = scanInt("금액을 입력하세요 : ");
		newAccount.setBalance(amount);//임시로 금액으로 사용
		
		int check = service.dewiService(newAccount);
		
		if(check != 0) {
			System.out.println("입/출금 완료");
		} else {
			System.out.println("입/출금 실패");
		}
	}

}
