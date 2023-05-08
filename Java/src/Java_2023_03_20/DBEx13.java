package Java_2023_03_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx13 {
//생성자
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = DBaction.getInstance().getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			/*
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			*/
			st = con.createStatement();
			String sql = "create table TEST3("
					+ "id varchar(10),"
					+ "pw varchar(30),"
					+ "name varchar(30),"
					+ "mdate date,"
					+ "age int)";
			//생성자일땐 위에처럼. 삽입시엔 밑에 처럼
//			String sql = select();
			rs = st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					System.out.println(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
		}finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	public static String insert() {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String age = sc.next();
		
		String sql = "insert into test4(id,pw,name,mdate,age)" + "values('abc','123','홍길동','2023-03-20','10'";
		return sql;
	}
}
