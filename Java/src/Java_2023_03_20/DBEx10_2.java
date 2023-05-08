package Java_2023_03_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBEx10_2 {
		public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			/*
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			*/
			DBaction dbaxtion= dbaxtion.getinstance();
			con = dbaxtion.getConnection();
			st = con.createStatement();
			String sql = select();
			rs = st.executeQuery(sql);
					/*"CREATE TALE TEST1("
							+"ID VARCHAR(10) NOT NULL,"
							+"PW VARCHAR(30),"
							+"NAME VARCHAR(30),"
							+"MDate DATE"
							+"AGE INT)";
							*/
			int result = st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	}
