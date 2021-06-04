package kr.ac.kopo.project02.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import kr.ac.kopo.project02.vo.AccountVO;

public class AddUI extends BaseUI {
	
	@Override
	public void execute() throws Exception {
		
		//30일이내 제약조건
		SimpleDateFormat format1 = new SimpleDateFormat ("D");
		Date time = new Date();
		
		String nowStr = format1.format(time);
		
		String str = session.getLac_dt();
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date past = new Date();
		try {
			past = format2.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String pastStr = format1.format(past);
		
		int nowInt = Integer.parseInt(nowStr);
		int pastInt = Integer.parseInt(pastStr);
		
		if(nowInt - pastInt <= 30 ) {
			System.out.println("최근 생성일이 30일 이내이므로 계좌를 개설할 수 없습니다.");
		} else {
			System.out.println("조건 충족");
			//1000원이상 제약조건
			int initBalance = 0;
			while(initBalance < 1000) {
				initBalance = scanInt("✌ 생성시 입금할 금액을 입력하세요: ");
				if(initBalance < 1000) System.out.println("-> 1000원 이상이어야 합니다.");
			}
			String alias = scanStr("✌ 통장 별칭을 입력하세요: ");
			
			AccountVO newAccount = new AccountVO();
			newAccount.setBname("하나");
			newAccount.setAccount_id(session.getId());
			newAccount.setBalance(initBalance);
			newAccount.setAlias(alias);
			
			service.addService(newAccount);
			//세션변경 필수
			String ctime = format2.format(time);
			session.setLac_dt(ctime);
			
			System.out.println("-> 계좌 개설이 완료됐습니다.");
		}
		
	}

}
