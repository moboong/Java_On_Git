package kr.ac.kopo.project02.ui;

import kr.ac.kopo.project02.vo.AccountVO;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		while (true) {
			String temp = scanStr("☝ 비밀번호를 확인하겠습니다 : ");
			if (temp.equals(session.getPw())) {
				
				String accno = scanStr("✌ 삭제할 통장의 계좌번호를 입력하세요(하나 계좌만 & 잔고 0일 때만 삭제 가능) : ");

				AccountVO newAccount = new AccountVO();
				newAccount.setAccount_no(accno);
				newAccount.setAccount_id(session.getId());

				int check = service.deleteService(newAccount);
				
				if(check != 0) {
					System.out.println("-> 계좌가 삭제됐습니다.");
				} else {
					System.out.println("-> 오류로 인한 삭제 실패.(하나 계좌만 & 잔고 0일 때만 삭제 가능)");
				}
				break;
			} else {
				
				System.out.println("-> 비밀번호가 틀렸습니다.");
				
			}
		}
	}

}
