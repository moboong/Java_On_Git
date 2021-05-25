package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.Statement;

public class JDBCClose {
	
	// 사실 우리는 pstmt를 더 많이 쓰지만 분명 stmt쓸 경우도 있을 거고 둘다 닫기 편하기 위해서 stmt로 close클래스를 만든다.
	public static void close(Connection conn, Statement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
