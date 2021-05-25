package kr.ac.kopo.jdbc;


class Test implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("close()...");
	}
}

public class SelectMain03 {

	public static void main(String[] args) {
		
		try (
				Test t = new Test(); //그냥은 안되고 오토클로저블 상속하면 됨.. 소름
		){
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
// 이러면... close쓰기위해서 finally를 쓸 필요가 없게 됐어. (물론 다른거를 해야되면 쓸 수 있지)
// 다른 거 아무것도 안했는데 클로즈 메소드 실행된 거 보이지??
// 그리고 우리가 이번에 다룰 Connection객체와 preparedstmt 객체 모두 오토클로저블 상속 받고 있음
// 그래서 1.7버전의 try-catch 사용 가능
// 이것 외에도 일반적인 IO들도 다 오토클로저블 상속받음 그래서 그거도 1.7 try() 사용 가능