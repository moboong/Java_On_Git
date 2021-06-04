package kr.ac.kopo.project02.ui;

public class Session {
	private String id;
	private String pw;
	private String lac_dt;

	public Session(String id, String pw, String lac_dt) {
		this.id = id;
		this.pw = pw;
		this.lac_dt = lac_dt;

	}

	public Session() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", pw=" + pw + "]";
	}

	public String getLac_dt() {
		return lac_dt;
	}

	public void setLac_dt(String lac_dt) {
		this.lac_dt = lac_dt;
	}

}
