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
		int temp = scanInt("☝ 번호를 입력하세요 : ");
		int type = 0;
		while(!(type == 1 || type == 2)) {
			if(temp == 1 || temp == 2) {
				type = temp;
			} else {
				temp = scanInt("☝ 번호를 입력하세요 : ");
			}
		}
		
		
		if(type == 2) {
			
			int temp2 = scanInt("☝ 은행코드을 입력하세요(하나:1, 우리:2, 국민:3, 신한:4, 기업:5, 농협:6) : ");
			int input = 0;
			while(!(input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6)) {
				if(temp2 == 1 || temp2 == 2 || temp2 == 3 || temp2 == 4 || temp2 == 5 || temp2 == 6) {
					input = temp2;
				} else {
					temp2 = scanInt("☝ 은행코드을 입력하세요(하나:1, 우리:2, 국민:3, 신한:4, 기업:5, 농협:6) : ");
				}
			}
			
			String bcode = null;
			switch (input) {
			case 1:
				bcode = "101";
				break;
			case 2:
				bcode = "102";
				break;
			case 3:
				bcode = "103";
				break;
			case 4:
				bcode = "104";
				break;
			case 5:
				bcode = "105";
				break;
			case 6:
				bcode = "106";
				break;
			}
			if(bcode != null) {
				newAccount.setBcode(bcode); // dao에서 bname이 null인 경우와 아닌 경우로 분기	
				newAccount.setAccount_id(session.getId());
			}
		} else if(type == 1) {
			newAccount.setAccount_id(session.getId());			
		}
		
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
