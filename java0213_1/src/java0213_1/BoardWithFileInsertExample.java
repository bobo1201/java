package java0213_1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {
	public static void main(String[] args) {
		// boards 테이블에 게시물 정보 저장
		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.111.220:1521/orcl",
					"java",
					"oracle"
					);
			
			// 매개변수화된 SQL문 작성
			String sql = ""+
			"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("src/java0213_1/snow.jpg"));
			
			// SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			// bno 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : " + bno);
				}
				rs.close();
			}
			
			// PreparedStatement 닫기
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}

//	출력 : 
//	저장된 행 수 : 1
//	저장된 bno : 1  → 실행 횟수에 따라서 숫자 값은 늘어납니다.




