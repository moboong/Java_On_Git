package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain02 {

	public static void main(String[] args) {

//		int a = 0 ; 
//		int b = 0;
//		int c = 0;
//		
//
//		int d = ++c; // c++
//		System.out.println(d);
//		List <String> list = new ArrayList<>();
//		list.add("test");
//		System.out.println(list.add("test"));

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {

			long start = System.currentTimeMillis();

			// 1. stream open
			fis = new FileInputStream("iodata/dog.jpg");
			fos = new FileOutputStream("iodata/dog2.jpg");

			// 2. read/write
			while (true) {
				int c = fis.read();
				if (c == -1)
					break;
				fos.write(c);
			}

			long end = System.currentTimeMillis();
			System.out.println("복사완료...");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 3. stream close
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
