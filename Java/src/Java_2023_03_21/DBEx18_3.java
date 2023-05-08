package Java_2023_03_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx18_3 {

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
			String qu = select();//인덱스 입력한 이후 얘를 끄고 셀렉트문 입력시켜주면 됨.
			st.executeQuery(qu);
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
	
	public static String select() {
		String qu = "select * from bwtest where idx between 2 and 5";
	//	String qu = "select * from bwtest where idx >= 2 and <= 5";
	//	String qu = "select * from bwtest limit 2";//1~n개;
	//	String qu = "select * from bwtest limit 2 offset 5";//가져올 게시물 n개 ~ n 이후부터;
	//	String qu = "select * from bwtest order by idx desc limit 5,2";//n 이후부터 ~ 가져올 게시물 n개;
		return qu;
	}
}
