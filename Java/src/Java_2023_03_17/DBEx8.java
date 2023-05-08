package Java_2023_03_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


//컬럼 값 가져오기
public class DBEx8 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩성공!");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();
			String sql = select();
			
			rs = st.executeQuery(sql);
			ResultSetMetaData rsmd =  rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while (rs.next()) {//데이터베이스는 인덱스 넘버 0이 없다
				System.out.println("id : " + rs.getString(1));
				System.out.println("pw : " + rs.getString(2));
				System.out.println("age : " + rs.getInt(3));
				System.out.println("date : " + rs.getString(4));
				for (int i = 1; i < 4; i++) {
					System.out.println(rs.getString(i));
				}
			}//인덱스 넘버만이 아닌 겟 스트링에 오버로드 된 컬럼명으로도 가져올수있음
		} catch (Exception e) {
			e.printStackTrace();
			}try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
	}

	public static String select() {
	String sql = "select * from dbtwxt3";//* 아스트레이크 는 전체를 표하는 표시
		return sql;
	}
}
