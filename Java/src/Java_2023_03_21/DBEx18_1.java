package Java_2023_03_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java_2023_03_20.DBaction;
/*
between (범위) : a and b 에서 a와 b를 포함한(inclusive)
그 사이의 모든 값에 해당하는지 여부를 조건으로 한다.

between
create table bwtest()idx int,
birth date,
name varchar(10));
insert into bwtest values(1, '2020-0101', '홍길동');
insert into bwtest values(1, '2020-0102', '이순신');
insert into bwtest values(1, '2020-0103', '만득이');
insert into bwtest values(1, '2020-0101', '개똥이');
insert into bwtest values(1, '2020-0102', '칠득이');
insert into bwtest values(1, '2020-0101', '갑돌이');
insert into bwtest values(1, '2020-0102', '갑순이');
*/

public class DBEx18_1 {
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
			String sql ="create table bwtest("
					+ "idx int, birth date, name varchar(10))";
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (SQLException e2) {}
		}
	}
}
