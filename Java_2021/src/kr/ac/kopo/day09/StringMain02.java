package kr.ac.kopo.day09;

public class StringMain02 {
	public static void main(String[] args) {
		// 검색 기능.

		// startsWith()
		// endsWith()
		// contains()
		// 이러한 메소드를 활용해서 검색 기능 구현.

		// 이것들은 문자열 비교였어. 다음은 문자열들의 탐색을 알아보자.
		String str = "hello world";
		int searchIdx = str.indexOf("o");
		System.out.println("문자열 : " + str);
		System.out.println("시작부터 o 위치 : " + searchIdx);

		searchIdx = str.lastIndexOf("o");
		System.out.println("문자열 : " + str);
		System.out.println("끝부터 o 위치 : " + searchIdx);
		System.out.println("----------------");

		
		//내방법
		System.out.println("문자열 : " + str);
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == 'l') {
				System.out.println("l 위치 : " + i);
			}
		}
		
		//교수님 방법
		System.out.println("문자열 : " + str);
		searchIdx = -1;
		while((searchIdx = str.indexOf('l', searchIdx + 1)) != -1) {
			
		}
	}

}
