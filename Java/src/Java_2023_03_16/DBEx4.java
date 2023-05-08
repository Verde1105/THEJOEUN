package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx4 {
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
			String sql = insert();
			int result = st.executeUpdate(sql);
			String msg = result > -1 ? "성공" : "실패";
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	public static String insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("DBTEST 테이블에 값 입력하기");
		System.out.println("ID : ");
		String id = sc.next();
		String sql = "INSERT INTO DBTEST VALUES('"+id+"')";
//		"INSERT INTO DBTEST VALUES('id')//sql or 오라클
		return sql;
	}
}
