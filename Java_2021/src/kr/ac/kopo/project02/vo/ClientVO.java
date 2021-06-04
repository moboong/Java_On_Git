package kr.ac.kopo.project02.vo;

public class ClientVO {
	private String id;
	private String pw;
	private String name;
	private String birth_dt;
	private String regist_dt;
	private String lac_dt;
	
	public ClientVO(String id, String pw, String name, String birth_dt, String regist_dt, String lac_dt) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth_dt = birth_dt;
		this.regist_dt = regist_dt;
		this.setLac_dt(lac_dt);
	}
	
	public ClientVO() {
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth_dt() {
		return birth_dt;
	}

	public void setBirth_dt(String birth_dt) {
		this.birth_dt = birth_dt;
	}

	public String getRegist_dt() {
		return regist_dt;
	}

	public void setRegist_dt(String regist_dt) {
		this.regist_dt = regist_dt;
	}

	@Override
	public String toString() {
		return "ClientVO [id=" + id + ", name=" + name + ", birth_dt=" + birth_dt + ", regist_dt=" + regist_dt + "]";
	}

	public String getLac_dt() {
		return lac_dt;
	}

	public void setLac_dt(String lac_dt) {
		this.lac_dt = lac_dt;
	}

}
