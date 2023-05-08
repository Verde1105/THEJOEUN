package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class 추가분 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();//창조자
//			String sql = "create table DBTEST3(ID varchar(5), PW varchar(15), age integer, cre_date datetime)";//id = 컬럼
//			sql = "create table DBTEST3(ID varchar(5), PW varchar(15), age integer, cre_date datetime)";
//			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
}
