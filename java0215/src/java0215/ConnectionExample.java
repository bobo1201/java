package java0215;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 8.0 이상
//			Class.forName("com.mysql.jdbc.Driver"); // 5점대 이하
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.111.40:3306/thisisjava",
					"java",
					"mysql"
					);
					
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}
	
//	출력 : 
//	연결 성공
//	연결 끊기