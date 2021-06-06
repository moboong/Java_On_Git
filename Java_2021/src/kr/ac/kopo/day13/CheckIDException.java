package kr.ac.kopo.day13;

public class CheckIDException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckIDException() {
		super();
	}

	public CheckIDException(String message) {
		super(message);
	}
	//이거 안만들고 그냥 두면 에러남. 
	
}
