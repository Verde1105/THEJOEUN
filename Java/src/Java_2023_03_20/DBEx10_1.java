package Java_2023_03_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx10_1 {
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
		String sql = insert();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(con != null) con.close();
		} catch (SQLException e) {}
	}
}

public static String insert() {
//	String sql = "insert into TEST1(id,pw) values('abc','123')";
	String sql = "insert into TEST1(pw) values('123')";
	return sql;
}
public static String select() {
	String sql = "select id, pw from cbtest2 where id='abc'";
	return sql;
}
}
