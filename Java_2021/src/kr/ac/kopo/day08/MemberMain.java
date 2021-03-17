package kr.ac.kopo.day08;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		Member m2 = new Member("준호", 28, "O");
		Member m3 = new Member("태진", 28);
		Member m4 = new Member("혜린");
				
		m.info();
		m2.info();
		m3.info();
		m4.info();

	}

}
