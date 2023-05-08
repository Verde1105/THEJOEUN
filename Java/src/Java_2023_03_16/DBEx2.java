package Java_2023_03_16;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBEx2 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				if (con != null) con.close();
			} catch (Exception e) {}
		}
	}
}
