package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JoinData {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(dr);
			con = DriverManager.getConnection(url,"root", "java");
			st = con.createStatement();
			String sql = "create table joindata("
					+ "name varchar(100),"
					+ "계좌번호 varchar(30) primary key,"//얘를 pk로 지정.
					+ "Balance INT)";
//					+ "day CREATE_DATE)";
			st.executeUpdate(sql);
		} catch (Exception e) {
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (Exception e2) {
			}
		}
	}
}
