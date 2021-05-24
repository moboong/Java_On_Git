package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
   JDBC 작업 순서
   1. 드라이버 로딩
   2. DB 접속 후 연결 객체 얻기
   3. SQL문 실행할 객체 얻기
   4. SQL문 실행 및 결과 얻기
   5. DB접속 해제
 */


public class InsertMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		// 이둘을 위로 올리는 이유..!!

		Scanner sc = new Scanner(System.in);

		try {
			// 1단계 : JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공...");

			// 2단계 : DB 연결 후 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);

			System.out.print("아이디를 입력: ");
			String id = sc.nextLine();
			System.out.print("이름을 입력: ");
			String name = sc.nextLine();

			//preparedStatement 연습하기 (1,2,5단계는 안 바뀐다? 3,4만 바뀌어.)
			// 3단계 : SQL 실행객체 얻어오기 (커넥션 객체의 크리에티이스트먼트 메소드 사용하기)
			// 얘는 무조건 쿼리부터 만들기!!!!
			String sql  = "insert into t_test(id, name) ";
				   sql += " values(?, ?)";
			pstmt = conn.prepareStatement(sql);
			//물음표에 set을 이용해서 넣기
			pstmt.setString(1, id); //이러면 알아서 첫번째 물음표가 ''가 붙어.
			pstmt.setString(2, name);

			// 4단계 : SQL문 실행 및 결과 얻기
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 삽입");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 : 늘상 말하듯 이건 IO 행위야 그래서 결과가 어떻게 되든 무조건 닫아줘야해. 그래서 finally에서 5단계 닫기가 진행돼.
			if (pstmt != null) {
				try {
					pstmt.close(); // 그냥 닫으려니까 안닫혀 왜냐면 블럭 스코프거든. 그럼 올려줘야지 ㅇㅇ
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			if (conn != null) {
				try {
					conn.close(); // 그냥 닫으려니까 안닫혀 왜냐면 블럭 스코프거든. 그럼 올려줘야지 ㅇㅇ
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			sc.close();

		}
	}

}
