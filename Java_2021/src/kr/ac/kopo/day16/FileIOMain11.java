package kr.ac.kopo.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain11 {
	
	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		
		FileOutputStream fos= new FileOutputStream("iodata/objectData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		oos.flush();
		
		FileClose.close(oos);
		System.out.println("objectData.txt 저장완료");
		
	}
	
	public static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iodata/objectData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		UserInfo user = (UserInfo)ois.readObject();
		
		FileClose.close(ois);
		System.out.println("파일 로드 완료...");
		System.out.println(user);
		
	}
	
	
	public static void main(String[] args) {
		//이건 오브젝트로 읽고 쓴다.
		//오브젝트 아웃풋 스트림 -> 얘도 필터클래스임.
		
		// 그냥 넣으려면 에러가 뜸.
		// 한줄로 쭉 세우고 이를 넣어주는데 
		// 객체 직렬화를 실시해야해
		// 객체 직렬화 방법은 쉬워
		// 시리얼라이즈라는 객체를 상속받기만해도 돼. -> 추상메소드를 갖고 있지않아.
		// ->  단지 넣을 때 어떤 방식으로 할지만 결정하면 돼.
		// 실제 그 모습을 살펴보면 우리가 해석할 수 없는 형태로 저장돼 있어.
		
		// 일부만 저장하고 싶다? 예를 들어 set메소드를 사용하여 나이를 0으로 만든다거나. null로 만들어준다. 근데 이게 비효율적이어 보여.
		// age는 빼고 싶다 그럼 age 변수 앞에 transient 키워드를 사용해서 객체 직렬화 대상에서 제외시켜준다.
		
		try {
//			write();
			read();
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}

}
