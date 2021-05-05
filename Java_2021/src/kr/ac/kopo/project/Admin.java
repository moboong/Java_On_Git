package kr.ac.kopo.project;

public class Admin extends User {
	private boolean admin = true;
	
	public Admin(String id, String pw) {
		super(id, pw);
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
