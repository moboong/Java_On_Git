package kr.ac.kopo.day09;

public class StringMain05 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		

		String str = "";
		for(int i = 0; i < 100000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		
		// 요거 3.9초 걸림. 고작 10만번인데 왤케 오래걸려??..
		// 왜냐면.. String은 불변. 새로운 공간 생성하고 주소값 가리키고 이 과정을 10만번하니까 겁나 오래 걸리고 공간 낭비도 극심해.
		// 이건 너무 비효율적이고 별로야.
		// 이래서 StringBuffer나 StringBuilder가 사용되어야하는 것이야!!!
		
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100000; i++) {
			sb.append(i); //이건 대입 코드 필요없어. 자체가 알아서 변하니까.
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000.0 + "초");
		System.out.println(str);
		
		// 미친듯한 속도차이.
		// 이건 공간 10만개 생성x, 1개 생성 
	}

}
