package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain02 {
	
	public static void main(String[] args) {
		
		System.out.println("main start....");
		
		Random r = new Random();
		int num = r.nextInt(3); //0~2
		System.out.println("num : " + num);
		
		String str = "hello";
		
		try {
			
			System.out.println(10 / num);
			System.out.println(str.charAt(8));
			
		} catch(Exception e) { // 이런거 다 필요없고 묵시적 형변환으로 
			e.printStackTrace(); 
		}
//		} catch(ArithmeticException ae) { //에러의 유형을 정확히 입력해줘야해
//			System.out.println("catch 블럭 진입 -> 0으로 나누는 에러 발생");
//			//System.out.println(ae.getMessage());
//			ae.printStackTrace();
//		} catch(NullPointerException ne) {
//			System.out.println("멀티캐치 -> NullPoint Exception");
//			ne.printStackTrace();
//		}
		
		// catch(ArithmeticException | NullPointerException e) { e.printStackTrace(); }
		
		
		System.out.println("main end....");
	}
}
