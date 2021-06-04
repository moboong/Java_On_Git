package kr.ac.kopo.project02.ui;

import java.util.List;

import kr.ac.kopo.project02.vo.AccountVO;

public class SearchUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		AccountVO newAccount = new AccountVO();
		
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("\t\t\t1. 전체 은행 조회");
		System.out.println("\t\t\t2. 개별 은행 조회");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		int type = scanInt("☝ 번호를 입력하세요 : ");
		
		
		if(type == 2) {
			String bname = scanStr("☝ 은행명을 입력하세요(하나,우리,국민,신한,기업,농협) : ");
			newAccount.setBname(bname); // dao에서 bname이 null인 경우와 아닌 경우로 분기
			
		}
		newAccount.setAccount_id(session.getId());
		
		List<AccountVO> list = service.searchService(newAccount);
		
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("-> [" + session.getId() + "]님의 계좌 조회 서비스");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		if(list.size() == 0) {
			System.out.println("-> 해당 은행의 계좌가 없어요.ㅜㅜ");
		} else {
			for(AccountVO account : list) {
				System.out.println(account);
			}
		}
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

	}

}
