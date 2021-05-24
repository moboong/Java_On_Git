package kr.ac.kopo.day16;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;


//Run configuration에서 arguments를 사용해서 test가능하다. 그거 꼭해봐라. 
public class FileIOMain08 {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("==============================================");
			System.out.println("\t사용법 : FileIOMain05 원본파일명 복사할파일명");
			System.out.println("==============================================");
			System.exit(0);
		}
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("iodata/" + args[0]);
			fw = new FileWriter("iodata/" + args[1]);
			
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
			FileClose.close(fr,fw);
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
	}

}
