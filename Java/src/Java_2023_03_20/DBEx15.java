package Java_2023_03_20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

/*
"create table test6("
+ "ID VARCHAR(10),"
+ "PW VARCHAR(30),"
+ "NAME VARCHAR(30) DEFAULT 'ANONTMOUS',"
+ "MDATE DATE,"
+ "AGE INT);"
*/

public class DBEx15 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DBaction.getInstance().getConnection();
			st = con.createStatement();
			String sql = Insert();
			st.executeUpdate(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 0; i < cols; i++) {
					System.out.println(rs.getString(i)+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
	
	public static String Insert() {
		String sql = "insert into test6(id, pw, mdate, age) values"
				+ "('abc', '123', '2021-0908', 100)";
		return sql;
	}
	
	public static String select() {
		String sql = "select * from test6";
		return sql;
	}
}
