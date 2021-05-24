package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// 
public class FileIOMain09 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("iodata/FileIOMain05.java");
			fw = new FileWriter("iodata/FileIOMain05_2.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine(); // 이녀석의 존재 이유를 확인해 줄 바꿈 유무.
			}
			bw.flush();
			System.out.println("복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
		}
		
	}
}
