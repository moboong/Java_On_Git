package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* 중복허용
 * 
 * List : 순서(o), 중복(o)
 * 구현 클래스 : ArrayList, LinkedList
 * 
 * 주요메소드
 * - add()
 * - get()
 * - remove()
 * - size()
 * - clear()
 * - isEmpty()
 * - contains()
 * - iterator()
 */

public class ListMain {

	public static void main(String[] args) {

//		List list = new ArrayList(); // 1.5미만 방식

//		List<String> list = new ArrayList<String>(); // 1.5버전의 Generic

		List<String> list = new ArrayList<>(); // 1.7버전의 방식 앞에 적었으면 생략 가능

		list.add("one");
//		list.add(1); // 에러뜸. 메세지 읽어봐.
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list.size());
		list.add("one");
		System.out.println(list.size());

		// 출력1: get메소드와 인덱스를 이용.

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 출력2: for-each
		// 이게 훨씬 쉽네????
		for (String str : list) {
			System.out.println(str);
		}

		// 출력3: toArray() 메소드 사용하여 출력
		Object[] arr = list.toArray(); // list를 고정길이 배열로 변환.
		System.out.println(Arrays.toString(arr));

		// 출력4: iterator() 메소드 사용하여 출력
		/*
		 * Iterator -> 순환자 주요 메소드
		 * 
		 * - hasNext() : 추출한 다음데이터의 존재여부 판단 - next() : 데이터추출
		 * 
		 */

		Iterator<String> ite = list.iterator(); // list내부 데이터 접근을 목적으로 한 순환객체를 하나 만든다.
		while(ite.hasNext()) { //다음이 없으면 false 있으면 true 그러고 출력.
			System.out.println(ite.next()); 
		}
		// 야 이거 좋다?
		
		
		//list에서는 3,4번 많이 안써도 set에서는 많이 쓰인다.
		
		//remove();
		
		
	}

}
