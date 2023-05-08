package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DEL {
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
			String sql = "create table plan("
					+ "otp int primary key auto_increment," 
					+ "name varchar(100),"//얘를 pk로 지정하고 이후 하나씩 값이 증가되게 할것이다.
					+ "ID varchar(50),"
					+ "PW varchar(50),"
					+ "계좌번호 varchar(30),"
					+"MDate DATE,"
					+ "Balance INT,"
					+ "phone varchar(50))";
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
