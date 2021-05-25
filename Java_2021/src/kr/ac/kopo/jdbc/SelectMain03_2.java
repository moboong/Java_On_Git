package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

public class SelectMain03_2 {

	public static void main(String[] args) {

		String sql = "select * from t_test "; // 원래 안에 있는게 맞는데 안에는 알다시피 오토클로저블만 가능

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}

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