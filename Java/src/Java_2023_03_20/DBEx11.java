package Java_2023_03_20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.xml.internal.ws.Closeable;
//이거 유니크문
public class DBEx11 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			String sql = insert();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(st != null) st.close();
			if(con != null) con.close();
			}catch (SQLException e2) {}
		}
	}
	public static String insert() {
		String sql = "insert into test2(id,pw) values('abc','123')";
		return sql;
	}
}
