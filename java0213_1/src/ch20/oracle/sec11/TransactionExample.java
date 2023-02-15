package ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.111.220:1521/orcl",
					"java",
					"oracle"
				);
			
			// 자동 커밋 기능 끄기
			conn.setAutoCommit(false);
			
			// 출금 작업
			String sql1 = "UPDATE accounts SET balance=balance-? Where ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0) throw new Exception("출금되지 않았음");
			pstmt1.close();

			// 입금 작업
			String sql2 = "UPDATE accounts SET balance=balance+? Where ano=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2222");
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0) throw new Exception("입금되지 않았음");
			pstmt2.close();
			
			// 수동 커밋 : 모두 성공 처리
			conn.commit();
			System.out.println("계좌 이체 성공");
					
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {}
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 원래대로 자동 커밋 기능 켜기
					conn.setAutoCommit(true);
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}

//	출력 1 : 
//	계좌 이체 성공

//	출력 2(임의로 오류 생성시) : 
//	계좌 이체 실패
//	java.lang.Exception: 입금되지 않았음
//		at ch20.oracle.sec11.TransactionExample.main(TransactionExample.java:39)