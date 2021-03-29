package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map: key, value의 쌍으로 구성된 데이터의 집합, 키에 대한 중복(x), 순서(x)
 * 구현 클래스 : HashMap, TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {

		// key: ID, value: password

		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		
		Set<Entry<String, String>> e = map.entrySet();
		for(Entry<String, String> ent : e) {
			System.out.println(ent.getKey());
		}
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경 서비스입니다");
		System.out.print("ID를 입력하세요 : ");
		String id = sc.nextLine();
		if (!map.containsKey(id)) {
			System.out.println("입력하신 ID [" + id + "는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		System.out.println("현재 패스워드 입력하세요 : ");
		String password = sc.nextLine();
		if (!map.get(id).equals(password)) {
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다");
			System.exit(0);
		}

		System.out.print("변경할 패스워드를 입력하세요");
		String newPassword = sc.nextLine();
		map.put(id, newPassword); // 이러면 덮어쓰기된다. 수정이 된다.

		System.out.println("패스워드가 변경되었습니다");

		// 이제 출력하려고 봤더니 인덱스, for-each, 이터레이트, 투어레이 등등 안된다.!!!!!
		// 이게 좀 다르네???

		
		// 방법1
//		System.out.println("전체회원정보 출력");
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for(Entry<String,String> ent : entrySet) {
//			System.out.println("ID: " + ent.getKey());
//			System.out.println("PW: " + ent.getValue());
//		}
		
		// 방법2
		Set<String> keys = map.keySet();
		for (String s : keys) {
			System.out.println("ID : " + s + "  PW : " + map.get(s));
		}
	}

}
