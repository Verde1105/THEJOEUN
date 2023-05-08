package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBEx23 {
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
			String sql = "create table jmtest2("
					+ "id int,"
					+ "mdate date,"
					+ "name varchar(10))";
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
