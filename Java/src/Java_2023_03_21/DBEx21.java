package Java_2023_03_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * create table lstest(
 phone varchar(15),
 name varchar(10));
 [추가된 레코드]
create table lstest values('011-1234-5678', '홍길동');
create table lstest values('011-1234-5678', '이순신');
create table lstest values('011-1234-5678', '만득이');
create table lstest values('011-1234-5678', '개똥이');
create table lstest values('011-1234-5678', '칠득이');
create table lstest values('011-1234-5678', '갑돌이');
 */

public class DBEx21 {
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
			String sql = "create table lstest" + 
					" phone varchar(15)," + 
					" name varchar(10));";
			st.executeUpdate(sql);
			String qe = select();
			st.executeUpdate(qe);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
	public static String select() {
//		String qe = "select phone, name from lstest where phone like'%011'";
//		String qe = "select phone, name from lstest where phone like'011%'";
//		String qe = "select phone, name from lstest where phone like'%070%'";
//		String qe = "select phone, name from lstest where phone like'0%8'";
//		String qe = "select phone, name from lstest where phone like'_순_'";
//		String qe = "select phone, name from lstest where phone like'칠__'";
//		String qe = "select phone, name from lstest where phone like'__이'";
		String qe = "select phone, name from lstest where phone like'갑_이'";
		return qe;
	}
}
