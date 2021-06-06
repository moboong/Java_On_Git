package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 	아이디를 입력하세요 : hong
 	수정할 이름을 입력하세요 : 홍길순 
 */

public class UpdateMain01 {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(url, user, password);
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 아이디를 입력 :");
			String id = sc.nextLine();
			System.out.print("수정할 이름을 입력 :");
			String name = sc.nextLine();
			
			// 3단계
			// String은 수정 불가 매우 비효율 성능 측면에서도 낫굿 그래서 StringBuilder
			// 우리 웹사이트 만들잖아? 변화가 자주 일어나는 상황에서 String 쓰면 안돼.
			// 지킬 수 있는 단축할 수 있는 부분을 최대한 챙겨서 성능을 끌어올리려고 해야해.
//			String  sql =  "update t_test ";
//					sql += " set name = ? ";
//					sql += " where id = ? ";
			
			StringBuilder sql = new StringBuilder();
			sql.append("update t_test ");
			sql.append(" set name = ? ");
			sql.append(" where id = ? ");
					
			
			pstmt = conn.prepareStatement(sql.toString()); //빌더를 다시 스트링으로 ㄱ
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			// 4단계
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 수정");
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
