package Home_Java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java_2023_03_20.DBaction;

public class 쿼리문연습01 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DBaction.getInstance().getConnection();
			st = con.createStatement();
			String sql = "create table tb01(id varchar(20), pw varchar(), age int";
			st.executeUpdate(sql);
			String qu = insert();
			st.executeUpdate(qu);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e2) {}
		}
	}
	
	public static String insert() {
		String qu = "insert into tb01(id,pw,age)";
		return qu;
	}
}
