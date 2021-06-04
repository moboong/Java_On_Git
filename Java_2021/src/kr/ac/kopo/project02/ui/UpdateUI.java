package kr.ac.kopo.project02.ui;

import kr.ac.kopo.project02.vo.AccountVO;

public class UpdateUI extends BaseUI {
	
	@Override
	public void execute() throws Exception {
		String accno = scanStr("✌ 수정할 통장의 계좌번호를 입력하세요 : ");
		String alias = scanStr("✌ 수정할 통장 별칭을 입력하세요 : ");
		
		AccountVO newAccount = new AccountVO();
		newAccount.setAccount_no(accno);
		newAccount.setAlias(alias);
		newAccount.setAccount_id(session.getId());
		
		int check = service.updateService(newAccount);
		
		if(check != 0) {
			System.out.println("-> 계좌 별칭이 수정됐습니다.");			
		} else {
			System.out.println("-> 정보 오류. 수정에 실패했습니다.");
		}
	}
}
