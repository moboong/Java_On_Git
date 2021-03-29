package kr.ac.kopo.day15;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) throws Exception {

		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다");

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);

		try {
			while (true) {
				int c = isr.read();
				if (c == -1)
					break;
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		InputStream is = System.in; //이 녀석은 바이트스트림이기 때문에 움직이는 단위가 1바이트야!
//		while (true) {
//			int c = is.read();
//			if (c == -1)
//				break;
//			System.out.print((char) c);
//		}

	}

}
