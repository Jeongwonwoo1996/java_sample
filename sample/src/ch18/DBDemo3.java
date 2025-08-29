package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo3 {

	public static void main(String[] args) throws SQLException {
		Connection conn = makeConnetion();
		// 3. preparedStatement 인터페이스 사용ㄴ
//		String sql = "insert into person (name, phone, email) values (?,?,?)";
//		String sql = "update person set email =? where id = ?";
		String sql = "delete from person where id = ?;";
		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, "테스트");
//		pstmt.setString(2, "010-4444-4444");
//		pstmt.setString(3, "d@naver.com");

//		pstmt.setString(1, "a@google.co.kr");
//		pstmt.setInt(2, 1);

		pstmt.setInt(1, 5);
		// 4. sql 문 실행
		if (pstmt.executeUpdate() == 1) {
			System.out.println("레코드 삭제 성공");
		} else {
			System.out.println("레코드 삭제 실패");
		}
		// 5. 연결 종료
		pstmt.close();
		conn.close();
	}

	public static Connection makeConnetion() {
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";
		Connection conn = null;

		// 1. 드라이버 로드

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결중 ...");
			// 2.데이터베이스 연결
			conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("데이터베이스 연결 성공 ...");

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다 ....");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패 ... ");
		}

		return conn;
	}

}
