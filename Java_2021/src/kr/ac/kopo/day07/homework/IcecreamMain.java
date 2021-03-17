package kr.ac.kopo.day07.homework;

public class IcecreamMain {

	public static void main(String[] args) {
		Icecream ic = new Icecream(); // 이놈은 그럼?
		int num = ic.getNum();
		Icecream[] arrIc = new Icecream[num];
		
		ic.setMember(arrIc);
		ic.print(arrIc);
		ic.getSum(arrIc);
		
	}

}
