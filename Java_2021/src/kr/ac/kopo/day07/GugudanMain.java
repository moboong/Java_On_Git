package kr.ac.kopo.day07;

public class GugudanMain {

	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in); 이제 필요없어. getDan() 생성 이후 필요없어.
		
		Gugudan gu = new Gugudan();
		
		//System.out.print("2-9 사이의 단 입력 : "); // 이것도 메서드화 ㄱㄱ
		
		int dan = gu.getDan("2-9 사이의 단 입력 : ");
		/*
		int dan = sc.nextInt();
		sc.nextLine();
		*/
		
		gu.print(dan);
		
		gu.print(); // 메소드 오버로딩 -> 매개변수가 없으면 전체 출력
		
		
//		System.out.println("시작단: ");
		int startDan = gu.getDan("시작단: ");
//		System.out.println("끝단: ");
		int endDan = gu.getDan("끝단: ");
		gu.print(startDan, endDan);
		// 코드 길이 겁나 줄어듦.
	}

}
