package kr.ac.kopo.jdbc.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactoryHr;

public class JDBChomeworkMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("급여를 입력하시오 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		//쿼리
		StringBuilder sql = new StringBuilder();
		sql.append("select JOB_TITLE, AVG(SALARY) as AVG_SAL ");
		sql.append(" from ( ");
		sql.append(" select E.EMPLOYEE_ID, E.SALARY, E.JOB_ID, J.JOB_TITLE ");
		sql.append(" from EMPLOYEES E, JOBS J ");
		sql.append(" where 1=1 ");
		sql.append(" and E.JOB_ID = J.JOB_ID ");
		sql.append(" and E.SALARY >= ? ");  // 입력할 부분.
		sql.append(" ) ");
		sql.append(" group by JOB_TITLE ");
		sql.append(" order by AVG_SAL desc ");
		
		try (Connection conn = new ConnectionFactoryHr().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setInt(1, input);
			ResultSet rs = pstmt.executeQuery();
			
			int n = 0; 
			
			while (rs.next()) {
				String jobTitle = rs.getString("JOB_TITLE");
				String avgSal = rs.getString("AVG_SAL");
				System.out.println("[" + jobTitle + "] " + avgSal);
				n = rs.getRow(); // 마지막행을 출력하는 메소드
			}
			
			System.out.println("총 [" + n + "]명이 검색됐습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
