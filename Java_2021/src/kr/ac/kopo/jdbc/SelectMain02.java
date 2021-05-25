package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

//이건 5단계 줄였어. 이제 1,2 단계 줄여보자. (3,4는 우리가 조작하는 부분임. 나머지(1,2,5)는 모듈화)

public class SelectMain02 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1,2단계 축약
//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();
			
			conn = new ConnectionFactory().getConnection();
			
			// 3단계
			String sql = "select * from t_test ";
			pstmt = conn.prepareStatement(sql);

			// 4단계
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.println("id : " + id + ", name : " + name);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5단계 축약
			JDBCClose.close(conn, pstmt);
		}

	}

}
