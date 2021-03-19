package kr.ac.kopo.day09.homework;

public class StringUtil {
	public boolean isUpperChar(char c) {
		if (c >= 'A' && c < 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLowerChar(char c) {
		if (c >= 'a' && c < 'z') {
			return true;
		} else {
			return false;
		}
	}

	public int max(int i, int j) {
		return (i > j) ? i : j;
	}

	public int min(int i, int j) {
		return (i > j) ? j : i;
	}

	//이거 교수님이 한거 봐라. 교수님이 한거는 배열을 써서 속도도 더 빠르고
	//리턴값에 생성자를 쓴다. 그리고 for문안에 변수 두개 사용 ㅎㄷㄷ
	//여러모로 유용한 팁들이 많이 담겨있음.
	public static String reverseString(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += String.valueOf(str.charAt(i));
		}
		return revStr; // 이건 느려.. 난 비효율을 선택했어 이건 낙제. 이렇게 할거면 버퍼or빌더 써서 append 써. 그리고 리턴으로 toString ㄱㄱ

	}
	// 게다가 여러 방법을 소개해주고, 반만 돌릴 수 있는 시간복잡성의 최적도 보여준다.. 꼭 복습 ㄱ
	
	
	
	// 야 이거도 교수님이 한거 봐라. 그리고 객체치향스럽게 짜기 위해 isUpper 이용해보동.
	public String toUpperString(String str) {
		String upStr = "";
		for (int i = 0; i < str.length(); i++) {
			int chr = (int) str.charAt(i);
			if ((65 <= chr) && (chr <= 90)) {
				upStr += String.valueOf((char) (chr + 32));
			}
		}
		return upStr;
	}

	public String toLowerString(String str) {
		String lowStr = "";
		for (int i = 0; i < str.length(); i++) {
			int chr = (int) str.charAt(i);
			if ((97 <= chr) && (chr <= 122)) {
				lowStr += String.valueOf((char) (chr - 32));
			}
		}
		return lowStr;

	}

	public static int checkChar(String strData, char ch) {
		int count = 0;
		for (int i = 0; i < strData.length(); i++) {
			if (ch == strData.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static String removeChar(String oriData, char delChar) {
		String deleted = "";
		for (int i = 0; i < oriData.length(); i++) {
			if (oriData.charAt(i) != delChar) {
				deleted += oriData.charAt(i);
			}
		}
		return deleted;
	}

}
