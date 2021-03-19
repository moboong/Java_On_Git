package kr.ac.kopo.day09.homework;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String str = StringUtil.reverseString("hello");
		// 이녀석은 객체생성없이 그냥 사용함. static이라서 근데 이게 잘 생각해야되는게
		// 음 주어가 필요없는 경우에 사용해. 위의 경우는 주어 필요없이 목적어만 있어도 되거든?
		// 왜냐면 목적어인 hello만 뒤집으면 되지 이걸 주어 문자열에 붙이거나 주어 문자열을 뒤집거나 이런 개념이 아니잖아
		// 음 그래서.. String.valueOf(~~) 이것도 문자열로 만드는 목적어만 필요한 메소드니까
		// static 메소드로 설계된거야. 
		// 잘 이해해봐. 다른 static 메소드는 뭐가 있는지 살펴보고 그 공통된 특징을 느껴봐.
		System.out.println(str);
		
		String str2 = StringUtil.removeChar("hello", 'h');
		System.out.println(str2);
	}

}
