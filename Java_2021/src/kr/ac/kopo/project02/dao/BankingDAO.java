package kr.ac.kopo.project02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.project02.vo.AccountVO;
import kr.ac.kopo.project02.vo.ClientVO;
import kr.ac.kopo.project02.vo.TransactionVO;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class BankingDAO {
	
	//로그인
	public ClientVO loginDAO(ClientVO newClient) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ClientVO client = new ClientVO();
		
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM CLIENTS ");
			sql.append(" WHERE ID = ? AND PW = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, newClient.getId());
			pstmt.setString(2, newClient.getPw());

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("ID");
				String pw = rs.getString("PW");
				String name = rs.getString("NAME");
				String birth_dt = rs.getString("BIRTH_DT");
				String regist_dt = rs.getString("REGIST_DT");
				String lac_dt = rs.getString("LAC_DT");

				client = new ClientVO(id, pw, name, birth_dt, regist_dt, lac_dt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return client;
	}
	
	
	// 계좌 생성
	public void addDAO(AccountVO newAccount) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;

		try {
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false); //오토커밋 끄고
			
			StringBuilder sql = new StringBuilder();
			StringBuilder sql2 = new StringBuilder();
			
			sql.append("INSERT INTO ACCOUNTS (BNAME, ACCOUNT_NO, ACCOUNT_ID, BALANCE, ALIAS) ");
			sql.append(
					" VALUES('하나', TO_CHAR(SYSDATE,'YY') || TO_CHAR(SYSDATE,'DDD') || TO_CHAR(SYSTIMESTAMP,'HHMMSSFF1'), ? , ? , ? ) ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, newAccount.getAccount_id());
			pstmt.setLong(2, newAccount.getBalance());
			pstmt.setString(3, newAccount.getAlias());

			pstmt.executeUpdate();

			// 회원테이블에 최근 생성 날짜 정보 추가
			sql2.append("UPDATE CLIENTS SET LAC_DT = SYSDATE WHERE ID = ? ");
			pstmt2 = conn.prepareStatement(sql2.toString());
			pstmt2.setString(1, newAccount.getAccount_id());
			
			pstmt2.executeUpdate();
			
			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt);
			JDBCClose.close(conn, pstmt2);
		}
	}

	// 계좌 별칭 수정
	public int updateDAO(AccountVO newAccount) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;
		
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE ACCOUNTS SET ALIAS = ? ");
			sql.append(" WHERE ACCOUNT_ID = ? AND ACCOUNT_NO = ? ");

			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, newAccount.getAlias());
			pstmt.setString(2, newAccount.getAccount_id());
			pstmt.setString(3, newAccount.getAccount_no());

			check = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return check;

	}

	// 계좌 삭제
	public int deleteDAO(AccountVO newAccount) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int check = 0;

		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE ACCOUNTS SET BALANCE = NULL, ALIAS = '폐기' ");
			sql.append(" WHERE ACCOUNT_ID = ? AND BNAME = '하나' AND ACCOUNT_NO = ? AND BALANCE = 0 ");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, newAccount.getAccount_id());
			pstmt.setString(2, newAccount.getAccount_no());

			check = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return check;
	}

	// 계좌 조회
	public List<AccountVO> searchDAO(AccountVO newAccount) throws Exception {
		List<AccountVO> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM ACCOUNTS ");
			sql.append(" WHERE 1=1 ");
			sql.append(" AND ACCOUNT_ID = ? ");
			sql.append(" AND BALANCE IS NOT NULL ");

			// null이 아니면 부분 출력
			if (!(newAccount.getBname() == null || newAccount.getBname().equals(""))) {
				sql.append(" AND BNAME = ? ");
			}

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newAccount.getAccount_id());

			if (!(newAccount.getBname() == null || newAccount.getBname().equals(""))) {
				pstmt.setString(2, newAccount.getBname());
			}

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String bname = rs.getString("BNAME");
				String account_no = rs.getString("ACCOUNT_NO");
				String account_id = rs.getString("ACCOUNT_ID");
				long balance = rs.getLong("BALANCE");
				String alias = rs.getString("ALIAS");

				AccountVO account = new AccountVO(bname, account_no, account_id, balance, alias);
				list.add(account);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}

	// 거래 내역 조회
	public List<TransactionVO> transDAO(AccountVO newAccount) throws Exception {
		
		List<TransactionVO> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT A.T_ID, A.ACCOUNT_NO, B.ACCOUNT_ID , A.T_TYPE, A.T_AMOUNT, A.T_DT, A.BALANCE ");
			sql.append(" FROM TRANSACTION_HISTORY A, ACCOUNTS B ");
			sql.append(" WHERE 1=1 ");
			sql.append(" AND A.ACCOUNT_NO = B.ACCOUNT_NO ");
			sql.append(" AND B.ACCOUNT_ID = ? ");
			sql.append(" ORDER BY A.T_DT DESC ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newAccount.getAccount_id());

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String t_id = rs.getString("T_ID");
				String account_no = rs.getString("ACCOUNT_NO");
				String t_type = rs.getString("T_TYPE");
				long t_amount = rs.getLong("T_AMOUNT");
				String t_dt = rs.getString("T_DT");
				long balance = rs.getLong("BALANCE");

				TransactionVO tarnsaction = new TransactionVO(t_id, account_no, t_type, t_amount, t_dt, balance);
				list.add(tarnsaction);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}

		return list;
	}
	
	// 계좌이체
	public int transferDAO(AccountVO newAccount) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		int check = 0;
		
		try {
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false); //오토커밋 끄고
			
			StringBuilder sql = new StringBuilder();
			StringBuilder sql2 = new StringBuilder();
			StringBuilder sql3 = new StringBuilder();
			//account 테이블
			sql.append("UPDATE ACCOUNTS SET BALANCE = BALANCE - ? ");
			sql.append(" WHERE ACCOUNT_NO = ? AND ACCOUNT_ID = ? ");

			sql2.append("UPDATE ACCOUNTS SET BALANCE = BALANCE + ? ");
			sql2.append(" WHERE ACCOUNT_NO = ? ");
			
			//transaction 테이블
			sql3.append("INSERT ALL ");
			sql3.append(" INTO TRANSACTION_HISTORY (T_ID, ACCOUNT_NO, T_TYPE, T_AMOUNT, T_DT, BALANCE) ");
			sql3.append(" VALUES(TH_SEQ.NEXTVAL, ? , '출금', ? , TO_CHAR(SYSDATE,'YYYY-MM-DD HH:MI:SS') ");
			sql3.append(" , (SELECT BALANCE FROM ACCOUNTS WHERE ACCOUNT_NO = ? AND ACCOUNT_ID = ? )) ");
			sql3.append(" INTO TRANSACTION_HISTORY (T_ID, ACCOUNT_NO, T_TYPE, T_AMOUNT, T_DT, BALANCE) ");
			sql3.append(" VALUES(TH_SEQ.NEXTVAL, ? , '입금', ? , TO_CHAR(SYSDATE,'YYYY-MM-DD HH:MI:SS') ");
			sql3.append(" , (SELECT BALANCE FROM ACCOUNTS WHERE ACCOUNT_NO = ? )) ");
			sql3.append(" SELECT * FROM DUAL ");
			
			//account 테이블
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setLong(1, newAccount.getBalance());
			pstmt.setString(2, newAccount.getAccount_no());
			pstmt.setString(3, newAccount.getAccount_id());
			int a = pstmt.executeUpdate();
			
			pstmt2 = conn.prepareStatement(sql2.toString());
			pstmt2.setLong(1, newAccount.getBalance());
			pstmt2.setString(2, newAccount.getAlias());//별명에 대상계좌 담아옴
			int b = pstmt2.executeUpdate();
			
			//transaction 테이블
			pstmt3 = conn.prepareStatement(sql3.toString());
			pstmt3.setString(1, newAccount.getAccount_no());
			pstmt3.setLong(2, newAccount.getBalance());
			pstmt3.setString(3, newAccount.getAccount_no());
			pstmt3.setString(4, newAccount.getAccount_id());
			
			pstmt3.setString(5, newAccount.getAlias());//별명에 대상계좌 담아옴
			pstmt3.setLong(6, newAccount.getBalance());
			pstmt3.setString(7, newAccount.getAlias());//별명에 대상계좌 담아옴
			int c =  pstmt3.executeUpdate();
			
			conn.commit();
			
			check = a + b + c;
			
		} catch (Exception e) {
			conn.rollback();
			check = 0;
			System.out.println("-> 거래 오류 발생. 트랜잭션 취소");
			//e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt);
			JDBCClose.close(pstmt2);
			JDBCClose.close(conn, pstmt3);
		}
		return check;
	}
	
	// 입출금
		public int dewiDAO(AccountVO newAccount) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			int check = 0;
			
			try {
				conn = new ConnectionFactory().getConnection();
				conn.setAutoCommit(false); //오토커밋 끄고
				
				StringBuilder sql = new StringBuilder();
				StringBuilder sql2 = new StringBuilder();
				
				sql.append("UPDATE ACCOUNTS ");
				if(newAccount.getAlias().equals("입금")) {
					sql.append(" SET BALANCE = BALANCE + ? ");
				} else if(newAccount.getAlias().equals("출금")) {
					sql.append(" SET BALANCE = BALANCE - ? ");
				}
				sql.append(" WHERE ACCOUNT_NO = ? AND ACCOUNT_ID = ? ");
		
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setLong(1, newAccount.getBalance());
				pstmt.setString(2, newAccount.getAccount_no());
				pstmt.setString(3, newAccount.getAccount_id());
				int a = pstmt.executeUpdate();
				
				
				
				sql2.append("INSERT INTO TRANSACTION_HISTORY (T_ID, ACCOUNT_NO, T_TYPE, T_AMOUNT, T_DT, BALANCE) ");
				sql2.append(" VALUES(TH_SEQ.NEXTVAL, ?, ?, ?, ");
				sql2.append(" TO_CHAR(SYSDATE,'YYYY-MM-DD HH:MI:SS'), ");
				sql2.append(" (SELECT BALANCE FROM ACCOUNTS WHERE ACCOUNT_NO = ? AND ACCOUNT_ID = ? )) ");
				
				pstmt2 = conn.prepareStatement(sql2.toString());
				pstmt2.setString(1, newAccount.getAccount_no());
				pstmt2.setString(2, newAccount.getAlias());//임시로 타입으로 사용
				pstmt2.setLong(3, newAccount.getBalance());//임시로 금액으로 사용
				pstmt2.setString(4, newAccount.getAccount_no());
				pstmt2.setString(5, newAccount.getAccount_id());
				int b = pstmt2.executeUpdate();
				
				conn.commit();
				
				check = a + b;
				
			} catch (Exception e) {
				conn.rollback();
				check = 0;
				System.out.println("-> 거래 오류 발생. 트랜잭션 취소");
				//e.printStackTrace();
			} finally {
				JDBCClose.close(pstmt);
				JDBCClose.close(conn, pstmt2);
			}
			return check;
		}

}
