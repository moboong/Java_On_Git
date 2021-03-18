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

	public static String reverseString(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += String.valueOf(str.charAt(i));
		}
		return revStr;

	}

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
