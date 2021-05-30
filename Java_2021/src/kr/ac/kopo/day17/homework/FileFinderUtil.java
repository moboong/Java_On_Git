package kr.ac.kopo.day17.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import kr.ac.kopo.project.Method;

public class FileFinderUtil {

	Method m = new Method();

	File dirObj;
	String path;

	// 시작 및 생성자
	public FileFinderUtil() {
		path = "C:\\Users\\HP\\git\\repository\\Java_2021\\iodata";
		dirObj = new File(path);
	}

	// 메뉴
	public void start() {
		fileInfo();
		String input;

		loop: while (true) {
			input = m.inputString("다음 행위를 선택하세요: ");

			switch (input) {
			case "M":
				newFolder(m.inputString("생성할 폴더 이름을 입력하세요: "));
				break;
			case "R":
				rename(m.inputString("변경할 파일 이름을 입력하세요: "), m.inputString("변경하세요: "));
				break;
			case "D":
				delFile(m.inputString("삭제할 파일 이름을 입력하세요: "));
				break;
			case ".":
				if (dirObj.getParent() != null) {
					changePath(dirObj.getParent());
					System.out.println("상위폴더로 이동합니다.");
				} else {
					System.out.println("최상위폴더입니다.");
				}

				break;
			case "move":
				String path = dirObj.getAbsolutePath() + "\\" + m.inputString("이동할 하위 폴더를 입력하세요: ");
				changePath(path);
				break;
			case "exit":
				System.out.println("종료합니다.");
				break loop; // 끝내기
			default:
				System.out.println("잘못된 입력입니다.");

			}
			fileInfo();

		}
	}

	// 파일 객체 변경
	public void changePath(String path) {
		File temp = new File(path);
		if (temp.isDirectory() == true) {
			dirObj = temp;
		} else {
			System.out.println("이동할 수 없습니다.");
		}
	}

	// 폴더정보 출력 메소드
	public void fileInfo() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("\t\t\t" + dirObj.getName() + " 폴더정보");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("이름\t\t\t종류\t\t크기\t\t마지막수정날짜");
		System.out.println("---------------------------------------------------------------------------");

		String[] list = dirObj.list();

		File f;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		if (list.length != 0) {
			for (String file : list) {
				f = new File(dirObj.getName() + "\\" + file);
				System.out.printf("%-20s\t%-15s\t%d\t\t%s\n", f.getName(), (f.isFile() ? "파일" : "폴더"), f.length(),
						sdf.format(new Date(f.lastModified())));
			}
		} else {
			System.out.println("파일이 없습니다.");
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("[M]새폴더   [R]이름변경   [D]삭제   [.]상위폴더이동   [move]하위폴더이동   [exit]시스템종료 ");
		System.out.println("---------------------------------------------------------------------------");
	}

	// 파일 삭제
	public void delFile(String file) {
		File temp = new File(dirObj.getAbsolutePath() + "\\" + file);
		if (temp.isDirectory() || temp.isFile()) {
			if (temp.delete()) {
				System.out.println("삭제 완료");
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("삭제 실패");
		}
	}

	// 파일 생성
	public void newFolder(String name) {
		File temp = new File(dirObj.getAbsoluteFile() + "\\" + name);
		if (!temp.exists()) {
			boolean bool = temp.mkdir();
			System.out.println(bool ? "생성 성공" : "생성 실패");
		} else {
			System.out.println("생성 실패");
		}
	}

	// 파일 수정
	public void rename(String oldName, String newName) {
		File tempOld = new File(dirObj.getAbsoluteFile() + "\\" + oldName);
		File tempNew = new File(dirObj.getAbsoluteFile() + "\\" + newName);
		if (tempOld.exists()) {
			boolean bool = tempOld.renameTo(tempNew);
			System.out.println(bool ? "수정 성공" : "수정 실패");
		} else {
			System.out.println("그런 파일 없습니다.");
		}
	}

}
