package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class 추가분에값넣기 {
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
			st.executeUpdate(sql);
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
		System.out.println("아이디를 입력해주세요!");
		System.out.print(">>");
		String id = sc.next();
		System.out.println("패스워드를 입력해주세요!");
		System.out.print(">>");
		String pw = sc.next();
		System.out.println("나이를 입력해주세요!");
		System.out.print(">>");
		String age = sc.next();
		String sq = "INSERT INTO DBTEST3 VALUES" + "('"+id+"','"+pw+"',"+age+", now())";
		return sq;//리턴에서 데이터베이스 이름체크 반드시
	}
	
	/*
	 * 데이터베이스 3입력값
	a, a, 10
	a, a, 11
	b, b, 12
	c, c, 20
	d, d, 30
	*/
}
