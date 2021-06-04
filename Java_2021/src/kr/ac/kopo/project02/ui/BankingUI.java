package kr.ac.kopo.project02.ui;

public class BankingUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		while (true) {

			try {
				if (session.getId() == null) {
					System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
					System.out.println("⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑ 안녕하세요. 하나은행 오픈뱅킹서비스입니다. ⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑⚑");
					System.out.println("⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐ 로그인이 필요한 서비스입니다. ⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐⚐");
					System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");

					login();
				}

				int type = menu();
				IBankingUI ui = null;
				switch (type) {
				case 1:
					ui = new AddUI();
					break;
				case 2:
					ui = new UpdateUI();
					break;
				case 3:
					ui = new DeleteUI();
					break;
				case 4:
					ui = new SearchUI();
					break;
				case 5:
					ui = new TransactionUI();
					break;
				case 6:
					ui = new TransferUI();
					break;
				case 7:
					ui = new DeWiUI();
					break;
				case 8:
					ui = new LogOutUI();
					break;
				case 9:
					ui = new ExitUI();
					break;
				}
				if (ui != null)
					ui.execute();
				else {
					System.out.println();
					System.out.println("✂✂✂✂✂✂✂✂✂✂✂✂ 잘못선택했습니다. ✂✂✂✂✂✂✂✂✂✂✂✂");
					System.out.println();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private int menu() {

		System.out.println("----------------------------------------------------------------------");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░ 하나은행 오픈뱅킹 서비스 ░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\t\t[1] 하나은행 계좌 생성");
		System.out.println("\t\t\t[2] My 계좌 별칭 수정");
		System.out.println("\t\t\t[3] My 하나은행 계좌 삭제");
		System.out.println("\t\t\t[4] My All 계좌 조회");
		System.out.println("\t\t\t[5] My All 입출금 내역");
		System.out.println("\t\t\t[6] 계좌 이체");
		System.out.println("\t\t\t[7] 입/출금 (ATM or 창구)");
		System.out.println("\t\t\t[8] 로그아웃");
		System.out.println("\t\t\t[9] 서비스 종료");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("----------------------------------------------------------------------");
		int type = scanInt("☝ 메뉴 중에 원하는 항목 선택하세요 : ");
		return type;
	}

	private void login() {

		IBankingUI ui = new LoginUI();

		try {
			ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
