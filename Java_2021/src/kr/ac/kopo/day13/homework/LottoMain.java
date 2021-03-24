package kr.ac.kopo.day13.homework;

public class LottoMain {

	public static void main(String[] args) {
		Lotto l = new Lotto();
		try {
			l.inputLotto();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
