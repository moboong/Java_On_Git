package kr.ac.kopo.day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {

		File fileObj = new File("iodata/a.txt");
		String name = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String abPath = fileObj.getAbsolutePath();

		System.out.println("파일명 : " + name);
		System.out.println("부모이름 : " + parent);
		System.out.println("경로 : " + path);
		System.out.println("절대경로 : " + abPath);

		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일 입니다." : "파일 아닙니다.");

		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리 입니다." : "디렉토리 아닙니다.");

		bool = fileObj.exists();
		System.out.println(bool ? "존재함" : "존재 ㄴ");

		long size = fileObj.length();
		System.out.println("파일크기:" + size + "byte(s)");

		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 55초");

		System.out.println(sdf.format(new Date(time)));

		bool = fileObj.canWrite();
		System.out.println(bool ? "쓰기 가능" : "불능");

		bool = fileObj.canRead();
		System.out.println(bool ? "읽기 가능" : "불능");

		System.out.println("-------------------------------------------");

		File dirObj = new File("iodata");
		System.out.println(dirObj.exists());

		System.out.println(dirObj.isDirectory());

		String[] list = dirObj.list();

		for (String nam2 : list) {
			System.out.println(nam2);
		}
		
		//폴더 생성
		//mkdir
		
		// 새새폴더 밑에 오리 폴더.
		//mkdirs 상위폴더가 없으면 그거도 만들어준다.
	}

}
