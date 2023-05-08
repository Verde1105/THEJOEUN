package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx3 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();
//			이하 크리에이트문
			String sql = "create table DBTEST(ID varchar(5))";//id = 컬럼
//			String sql = "create teble DBTEST(ID varchar2(5))";//id = 컬럼
//			한글이 깨질수 있긴 하지만 한영 상관 없이 한칸 개념.
//			varchar = 가변적이라 정해진 글자수보다 적다면 적은글자수에 맞춰줌.
//			char = 가변적이지 않아 적은 글자수라도, 줄어들지 않고 고정.
//			오라클과 명령문은 같음
			int result = st.executeUpdate(sql);//명령수행문
			System.out.println(result);
			if (result < 0) {//사실 결과값은 없어도 되지만 제대로 돌아가는지 확인을 위해 만든, int result와 if문.
				System.out.println("실행실패");
			} else {
				System.out.println("실행성공");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
		} finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
}
