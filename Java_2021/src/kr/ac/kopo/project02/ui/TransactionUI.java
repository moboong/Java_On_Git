package kr.ac.kopo.project02.ui;

import java.util.List;

import kr.ac.kopo.project02.vo.AccountVO;
import kr.ac.kopo.project02.vo.TransactionVO;

public class TransactionUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		AccountVO newAccount = new AccountVO();
		newAccount.setAccount_id(session.getId());
		
		List<TransactionVO> list = service.transService(newAccount);
		
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("-> [" + session.getId() + "]님의 입출금 내역");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		if(list.size() == 0) {
			System.out.println("-> 거래내역이 없어요ㅜㅜ");
		} else {
			for(TransactionVO trans : list) {
				System.out.println(trans);
			}
		}
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
	}

}
