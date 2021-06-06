package kr.ac.kopo.project02.vo;

public class AccountVO {
	private String bcode;
	private String account_no;
	private String account_id;
	private long balance;
	private String alias;

	public AccountVO(String bname, String account_no, String account_id, long balance, String alias) {
		this.bcode = bname;
		this.account_no = account_no;
		this.account_id = account_id;
		this.balance = balance;
		this.alias = alias;
	}

	public AccountVO() {

	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Override
	public String toString() {
		return "[은행명:" + bcode + ", 계좌번호:" + account_no + ", 잔액:"
				+ balance + ", 계좌명:" + alias + "]";
	}

}
