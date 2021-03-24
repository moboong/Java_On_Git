package kr.ac.kopo.day13;

import java.io.FileNotFoundException; //이건 lang에서 제공하는 에러와 달라서 따로 임포트해줘야해
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {

		// FileReader fr = new FileReader("a.txt");
		// 얜 애초에 이 파일이 없을까봐 전전긍긍하는 아이야.
		// 그래서 초장부터 오류내고봐. 야야~ 예외처리해놔. 안그럼 실행 안시켜줄거임.
		// 이건 컴파일 시점의 에러. = checked exception

		// 읽어보면 try-catch안하면 실행안할거라고 엄포를 내놓음.

		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException fnfe) {
			// 오류 걸리면 기록을 남기고 싶어. 로그를 남기고 싶어 파일롸이터 클래스 사용.
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 이거도 엄포를 내놓음. 야 용량이 가득차있으면 나 못적는데? 그거에 대한 예방 해놨어?
		}
	}

}
