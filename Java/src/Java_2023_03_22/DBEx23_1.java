package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBEx23_1 {
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
			String qe = insert();
			st.executeUpdate(qe);
//			String se = select();
//			st.executeUpdate(se);
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
	
	public static String insert() {
//		String qe = "insert into jmtest2 values(1,'2001-01-01','축구선수')";
//		String qe = "insert into jmtest2 values(2,'2001-01-02','농구선수')";
//		String qe = "insert into jmtest2 values(3,'2001-01-03','배구선수')";
		String qe = "insert into jmtest2 values(7,'2001-01-03','배구선수2')";
		return qe;
	}
}
