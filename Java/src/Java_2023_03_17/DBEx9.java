package Java_2023_03_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx9 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();
			/*
			String sql = insert();
			st.executeUpdate(sql);
			*/
			String sql = select();
			rs = st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cnt = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= cnt; i++) {
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
			} catch (SQLException e) {}
		}
	}
	
	public static String insert() {
		String sql = "insert into dbtets2(id, pw) velues('abc', '123')";
		return sql;
	}
	
	public static String select() {
		String sql = "select * from dbtwxt2";//* 에스타리스크(Asterisk) 는 전체를 표하는 표시
		return sql;
	}
}
