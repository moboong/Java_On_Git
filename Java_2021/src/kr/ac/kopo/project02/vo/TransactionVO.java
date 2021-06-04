package kr.ac.kopo.project02.vo;

public class TransactionVO {
	private String t_id;
	private String account_no;
	private String t_type;
	private long t_amount;
	private String t_dt;
	private long balance;

	public TransactionVO() {

	}

	public TransactionVO(String t_id, String account_no, String t_type, long t_amount, String t_dt, long balance) {
		this.t_id = t_id;
		this.account_no = account_no;
		this.t_type = t_type;
		this.t_amount = t_amount;
		this.t_dt = t_dt;
		this.balance = balance;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getT_type() {
		return t_type;
	}

	public void setT_type(String t_type) {
		this.t_type = t_type;
	}

	public long getT_amount() {
		return t_amount;
	}

	public void setT_amount(long t_amount) {
		this.t_amount = t_amount;
	}

	public String getT_dt() {
		return t_dt;
	}

	public void setT_dt(String t_dt) {
		this.t_dt = t_dt;
	}


	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return  "[계좌번호:" + account_no + ", " + t_type + ", 액수:"
				+ t_amount + ", 일시:" + t_dt +" 거래번호:" + t_id + ", 잔고:" + balance + "]";
	}

}
