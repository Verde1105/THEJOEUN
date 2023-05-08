package Java_2023_03_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBEx7 {
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
			String sql = delete();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	
	public static String delete() {
//		String sql = "delete from dbtest";//테이블만 날릴때는 드랍. 해당문은 전부 날려버릴때 사용
//		String sql = "delete from dbtest3 where id = 'id'";//해당 dbtest3 테이블의 id 칼럼 어딘가에 'id'라는 데이터가 있다면, 지워라.
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		String id = sc.next();
		String sql = "delete from dbtets where id'"+ id +"'";
		return sql;
	}
}
