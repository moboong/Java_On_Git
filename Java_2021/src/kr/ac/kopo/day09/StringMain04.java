package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		String str = "hello world";
		
		System.out.println("str : " + str);
		//substring()
		String subStr = str.substring(1,8);
		System.out.println(subStr);
		subStr = str.substring(6); //인자가 하나면 그 인자부터 끝까지
		System.out.println(subStr);
		
		
		//concat()
		String str2 = "hello ";
		String str3 = "guys!!!";
		//str = str2 + str3;
		str = str2.concat(str3);
		System.out.println(str);
		
		
		//replace()
		str = "hello world";
		System.out.println(str);
		str = str.replace('l', 'r');
		System.out.println(str);
		str2 = str2.replace("ll", "rrrrrrrrrrr");
		System.out.println(str2);
		
		
		//trim()
		str = "                  hello      world                ";
		System.out.println(str);
		str = str.trim(); //트림은 양쪽 공백만 제거해. 안쪽 공백은 관여안해.
		System.out.println(str);
		//크롤링에서 공백을 가져올경우도 있어. 그때 트림을 활용해서 없애버려.
		
		
		//toUpperCase(), toLowerCase()
		str = "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
		//split()
		str = "홍길동전:허균:조선시대";
		String[] strArr = str.split(":");
		System.out.println(Arrays.toString(strArr));
		
		String ip = "192.168.5.203";
		String[] ipArr = ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		System.out.println(ipArr[0]);
		
		//valueOf()
		int num = 123;
//		String strNum = num + ""; //이건 꼼수
		String strNum = String.valueOf(num); // 문자열 변환.
		
		System.out.println(strNum + 10);
		
	}

}
