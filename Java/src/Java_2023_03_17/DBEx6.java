package Java_2023_03_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBEx6 {
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
			String sql = update();
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
	public static String update() {
		String sql = "update dbtest set id='a'";//해당 컬럼(차트이름)을 = 이후의 값으로 ''표시안에 지정
		return sql;
	}
}
