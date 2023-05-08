package Java_2023_03_20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
create table test5(
		id int primary key,
		name varchar(30)
		);

create table test5_1(
		test5_1_id int primary key,
		id int,
		foreign key (id) references test5(id)
		);
*/

public class DBEx14 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = DBaction.getInstance().getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			String sql = 
					/*
					 * "create table test5("
					+ "id int primary key,"
					+ "name varchar(30))";
			*/
					"create table test5_1("
					+ "test5_1_id int primary key,"
					+ "id int,"
					+ "foreign key(id) references test5(id))";
//			String sql = insert();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(con != null) con.close();
		} catch (Exception e) {}
		}
	}
	public static String insert() {
//		return "insert into test5(id,name)" + "values(1,'a')";
		return "insert into test5_1(test5_1_id, id) values(1,1)";

	}
}
