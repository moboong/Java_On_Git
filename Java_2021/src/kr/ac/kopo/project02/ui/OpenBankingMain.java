package kr.ac.kopo.project02.ui;

public class OpenBankingMain {

	public static void main(String[] args) {
		BankingUI ui = new BankingUI();
		try {
			ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
