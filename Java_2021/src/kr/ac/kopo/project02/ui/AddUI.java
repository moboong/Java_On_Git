package kr.ac.kopo.project02.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import kr.ac.kopo.project02.vo.AccountVO;

public class AddUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		// 30일이내 제약조건
		String str = session.getLac_dt();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		Date time2 = new Date();

		try {
			time2 = format.parse(str);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		long calDate = time.getTime() - time2.getTime();
		long calDateDays = calDate / (24 * 60 * 60 * 1000);

		calDateDays = Math.abs(calDateDays);

		if (calDateDays <= 30) {
			System.out.println("최근 생성일이 30일 이내이므로 계좌를 개설할 수 없습니다.");
		} else {
			System.out.println("조건 충족");
			// 1000원이상 제약조건
			int initBalance = 0;
			while (initBalance < 1000) {
				initBalance = scanInt("✌ 생성시 입금할 금액을 입력하세요: ");
				if (initBalance < 1000)
					System.out.println("-> 1000원 이상이어야 합니다.");
			}
			String alias = scanStr("✌ 통장 별칭을 입력하세요: ");

			AccountVO newAccount = new AccountVO();
			newAccount.setBcode("101");
			newAccount.setAccount_id(session.getId());
			newAccount.setBalance(initBalance);
			newAccount.setAlias(alias);

			service.addService(newAccount);
			// 세션변경 필수
			String ctime = format.format(time);
			session.setLac_dt(ctime);

			System.out.println("-> 계좌 개설이 완료됐습니다.");
		}

	}

}
