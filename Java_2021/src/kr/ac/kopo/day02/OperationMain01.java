package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		
		num += 1;
		
		++num;
		num++; //유일하게 대입연산자없이 자기자신이 바뀌는 경우.
		
		num = 10;
		System.out.println(++num); //11
		num = 10; 
		System.out.println(num++); //10
		System.out.println(num); //한번더 출력하면 11
	}

}
