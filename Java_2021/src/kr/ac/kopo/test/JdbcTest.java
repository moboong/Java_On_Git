package kr.ac.kopo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String serverName = "192.168.119.119";
		String portNumber = "1521";
		String sid = "dink";
		String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
		String username = "scott";
		String password = "tiger";
		Connection conn = DriverManager.getConnection(url, username, password);

		String sql = "SELECT DEPTNO,SAL*12 AS ANNUAL_SAL,ENAME,JOB,HIREDATE FROM EMP ORDER BY DEPTNO";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		ArrayList<String> list = new ArrayList<String>();

		while (rs.next()) {

			String current = rs.getString("ENAME");
			current = current + "\t" + rs.getString("SAL");
			current = current + "\t" + rs.getString("COMM");
			current = current + "\t" + rs.getString("DEPTNO");
			current = current + "\t" + rs.getString("JOB");
			list.add(current);
		}
		System.out.println("ENAME" + "\t" + "SAL" + "\t" + "COMM" + "\t" + "DEPTNO" + "\t" + "JOB");
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
