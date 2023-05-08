package Java_2023_03_20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
[태이블 생성]
		"CREATE TALE TEST3("
		+"ID VARCHAR(10) primary key,"
		+"PW VARCHAR(30),"
		+"NAME VARCHAR(30),"
		+"MDate DATE"
		+"AGE INT)";
*/

public class DBEx12 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			String sql = "create table test3("
					+"ID VARCHAR(10) primary key,"
					+"PW VARCHAR(30),"
					+"NAME VARCHAR(30),"
					+"MDate DATE"
					+"AGE INT)";
			sql = insert();
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
//		String sql = "insert into test3(pw) values('123')";
		String sql = "insert into test3 values('abc', '123', '홍길동', '2023-03-20',10)";

		return sql;
	}
}
