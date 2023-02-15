package java0213_1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
	public static void main(String[] args) {
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
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=? ")
					.append("WHERE bno=?")
					.toString();
				
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("src/java0213_1/snowman.jpg"));
			pstmt.setInt(5, 2);
			
			// SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수 : " + rows);
			
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
//	수정된 행 수 : 1
//	이전시간에 실행했던 BoardUpdateExample을 다시 실행하고 위의 코드를 실행하면 행이 수정됩니다.


