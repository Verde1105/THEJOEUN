package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//left join은 왼쪽 테이블 기준으로 추출하는 조인
//right join은 오늘쪽 테이블 기준으로 추출하는 조인, 레프트와 반대
//셀프조인은 자기 자신 기준으로 조인하는 기술(예시 : 깃허브)
/*

join test 1
create table jmtest1()id int primary key auto_increment,
phone varchar(15),
name varchar(20));
insert into jntest1(phone,name) values('011-1234-5678', '이순신');
insert into jntest1(phone,name) values('011-1234-5678', '개똥이');
insert into jntest1(phone,name) values('011-1234-5678', '만득이');
insert into jntest1(phone,name) values('011-1234-5678', '칠득이');
insert into jntest1(phone,name) values('011-1234-5678', '홍길동');
insert into jntest1(phone,name) values('011-1234-5678', '갑돌이');
insert into jntest1(phone,name) values('011-1234-5678', '갑순이');


jntest2
create table jmtest2(
	id int,
	mdate date,
	name varchar(10));
insert into jntest2 values(1,'2001-01-01','축구선수');
insert into jntest2 values(2,'2001-01-02','농구선수');
insert into jntest2 values(3,'2001-01-03','배구선수');
insert into jntest2 values(7,'2001-01-03','배구선수2');
 */

public class DBEx22 {
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
			String sql = "create table jmtest1("
					+ "id int primary key auto_increment,"
					+ "phone varchar(15)," 
					+ "name varchar(20))";
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
