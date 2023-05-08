package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbeX22_1 {
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
//			String qe = insert();
//			st.executeUpdate(qe);
			String se = select();
			st.executeUpdate(se);
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
	
//	public static String insert() {
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '이순신')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '개똥이')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '만득이')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '칠득이')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '홍길동')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '갑돌이')";
//		String qe = "insert into jmtest1(phone,name) values('011-1234-5678', '갑순이')";
//		return qe;
//	}
	
	public static String select() {
//		return "select * from jmteste1 cross join jntest2";
//		return "select * from jmteste1, jntest2";
//		return "select * from jmteste1 t1 inner join jntest2 t2 on t1.id = t2.id";
		return "select * from jmteste1 t1, jntest2 t2 where t1.id = t2.id";
//		return "select * from jmteste1 t1 left outer join jntest2 t2 on t1.id = t2.id";
//		return "select * from jmteste1 t1 left join jntest2 t2 on t1.id = t2.id";
//		return "select * from jmteste1 t1 right outer join jntest2 t2 on t1.id = t2.id";
//		return "select * from jmteste1 t1 right join jntest2 t2 on t1.id = t2.id";
//		return "select * from jmteste1 t1 left join jntest2 t2 on t1.id = t2.id union select * from jntest1 t1 right join jntest2 t2.id on t1.id - t2.id";
		
	}
}
