package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileIOMain12 {

	public static void write() {
		
		UserVO user = new UserVO("홍길동",26,"010-4444-3333","울산시");
		UserVO user2 = new UserVO("상길동",26,"010-2333-3333","서울시");
		UserVO user3 = new UserVO("깅길동",26,"010-1333-3333","부산시");
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		FileOutputStream fos = null;
		
		ObjectOutputStream oos = null;
		
		
		try {
			fos = new FileOutputStream("iodata/userList_2.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
//			for(UserVO vo : list) {
//				oos.writeObject(vo);
//			}
			oos.flush();
			System.out.println("저장완료");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
			FileClose.close(oos);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		List<UserVO> list = null;
		
		try {
			fis = new FileInputStream("iodata/userList_2.txt");
			ois = new ObjectInputStream(fis);
			
			list = (List<UserVO>)ois.readObject();  
			
//			while(true) {
//				try {
//					UserVO user = (UserVO) ois.readObject();
//					list.add(user);
//				} catch (Exception e) {
//					break; //이건 끝을 모르니까 끝을 알 수 없으니까 그래서 에러가 생기면 멈추게 코드를 짠거야.
//					// 근데 맘에 안들지?
//				}
//			}
//			
			System.out.println("파일 로드 완료");
			
			for(UserVO vo : list) {
				System.out.println(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis);
			FileClose.close(ois);
		}
		
	}

	public static void main(String[] args) {
		read();
		//write();
	}

}
