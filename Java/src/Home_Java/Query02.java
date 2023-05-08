package Home_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Query02 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(dr);
			con = DriverManager.getConnection(url, "root","java");
			st = con.createStatement();
			String sql = "create table sss(id varchar(50), pwvacher(50), cre_date datetime)";
			st.executeUpdate(sql);
			String qu = insert();
			st.executeUpdate(qu);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
	
	public static String insert() {
		String qu = "insert into sss(id, pw, now)";
		return qu;
	}
}
