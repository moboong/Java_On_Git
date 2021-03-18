package kr.ac.kopo.day09;

public class StringMain {

	public static void main(String[] args) {
		String str = new String("hello");
		String str2 = new String("hello");

		// 주소비교
		if (str == str2) {
			System.out.println(" 같다. ");
		} else {
			System.out.println(" 다르다. ");
		}

		// 실제 문자열 값 비교
		str2 = "Hello";
		boolean bool = str.equals(str2);
		if (bool) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		boolean bool2 = str.equalsIgnoreCase(str2);
		if (bool2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}

		/////////////////
		// 특정문자로 시작하는 지 여부 판단하는 메소드.
		str = "hello!!";
		str2 = "hello World";

		String sub = "hello";
		bool = str.startsWith(sub);
		if (bool) {
			System.out.println("시작한다");
		} else {
			System.out.println("시작안한다");
		}

		// endsWith도 있어. 이런건 확장자 검색할때. 유용해.!!
		str = "hello.txt";
		bool = str.endsWith(".txt");
		if (bool) {
			System.out.println("텍스트 파일입니다.");
		} else {
			System.out.println("다른 파일입니다.");
		}

		// 사전 순으로 sort할때 누가더 먼저 나올 것인가.
		str = "zoo";
		str2 = "board";

		int compare = str.compareTo(str2);
		if (compare == 0) {
			System.out.println("같은데?");
		} else if (compare < 0) {
			System.out.println(str + "<" + str2);
		} else {
			System.out.println(str2 + "<" + str);
		}

	}

}
