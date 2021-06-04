package kr.ac.kopo.project02.ui;

public class LogOutUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		session.setId(null);
		session.setPw(null);
		session.setLac_dt(null);
	}

}
