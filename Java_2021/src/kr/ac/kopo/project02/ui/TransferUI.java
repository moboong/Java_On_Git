package kr.ac.kopo.project02.ui;

import kr.ac.kopo.project02.vo.AccountVO;

public class TransferUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String fromAccno = scanStr("☝ 출금할 계좌번호를 입력하세요 : ");
		String toAccno = scanStr("☝ 보내실 계좌번호를 입력하세요 : ");
		long amount = 0;
		while (amount <= 0) {
			amount = scanInt("☝ 보내실 금액을 입력하세요 : ");
		}

		AccountVO newAccount = new AccountVO();
		newAccount.setAccount_id(session.getId());
		newAccount.setAccount_no(fromAccno);
		newAccount.setBalance(amount);// 잔고이지만 임시로 금액으로 사용함
		newAccount.setAlias(toAccno);// 별칭이지만 임시로 대상계좌번호로 사용함

		int check = service.transferService(newAccount);

		if (check != 0) {
			System.out.println("계좌 이체가 완료됐습니다.");
		} else {
			System.out.println("계좌 이체에 실패했습니다.");
		}
	}

}
