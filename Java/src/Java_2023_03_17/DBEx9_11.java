package Java_2023_03_17;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class DBEx9_11 {
		public static void main(String[] args) {
			String dr = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/app";
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			
			try {
				Class.forName(dr);
				System.out.println("드라이버 로딩 성공!");
				con = DriverManager.getConnection(url,"root", "java");
				System.out.println("데이터베이스 연결 성공!");
				st = con.createStatement();
				String sql = select();
				st.executeUpdate(sql);
				ArrayList<DBTest> data = new ArrayList<>();
				while (rs.next()) {//들어가야할것이 두개 이상이라면 이프가 아닌 와일문이어야할것
				
				DBTest dbtest = new DBTest();
				dbtest.setId(rs.getString("id"));
				dbtest.setPw(rs.getString("pw"));
				dbtest.setAge(rs.getInt("age"));
				dbtest.setCre_date(rs.getTimestamp("Cre_date"));
				
				Iterator<DBTest> result = data.iterator();
				while (result.hasNext()) {
					DBTest userinfo = result.next();
					System.out.println(
							userinfo.getId() + "," +
							userinfo.getPw() + "," +
							userinfo.getAge() + "," +
							userinfo.getCre_date()
							);
				}
//					data.add(new DBTest().setId(rs.getString("id")));
//					data.add(new DBTest().setAge(rs.getInt("AGE")));
					
				}
				//if(rs.next()) {//이거 풀어쓰기 가능한데 한줄로 만들기도 이렇게 가능
//					data.add(new DBTest().setId(rs.getString("id")).setPw(rs.getString("pw")));
//				}
					
				/*
				Iterator<dbtest> result = data.iterator();
				while (result.hasNext()) {
					dbtest userinfo = result.next();
					System.out.println(userinfo.getId());
					System.out.println(userinfo.getPw());
				}
				*/
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs != null) rs.close();
					if(st != null) st.close();
					if(con != null) con.close();
				} catch (Exception e) {}
			}
		}
		
		public static String select() {
//			String sql = "select id from cbtest3";
			String sql = "select id, pw from cbtest2 where id='abc'";
			return sql;
		}
}
class DBTest{
	private String id;
	private String pw;
	private int age;
	private Timestamp cre_date;
	
	public String getId() {
		return id;
	}
	public DBTest setId(String id) {
		this.id = id;
		return this;
	}
	public String getPw() {
		return pw;
	}
	public DBTest setPw(String pw) {
		this.pw = pw;
		return this;
	}
	public int getAge() {
		return age;
	}
	public DBTest setAge(int age) {
		this.age = age;
		return this;
	}
	public Timestamp getCre_date() {
		return cre_date;
	}
	public DBTest setCre_date(Timestamp cre_date) {
		this.cre_date = cre_date;
		return this;
	}
	
}
