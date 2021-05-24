package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

// 
public class FileIOMain07 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("iodata/FileIOMain05.java");
			fw = new FileWriter("iodata/FileIOMain05.java.txt");
			
			br = new BufferedReader(br);
			bw = new BufferedWriter(bw);
			
			while(true) {
				int c = fr.read();
				if(c == -1) break;
				fw.write(c);
			}
			fw.flush();
			System.out.println("복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
		}
		
	}
}
