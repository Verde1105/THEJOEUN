package Java_2023_03_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEx {
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
//			String sql = "create table dbtest3(ID varchar(5), pw varchar(20))";
//			sql = Update();
//			int result = st.executeUpdate(sql);//명령수행문
//			System.out.println(result);
//			if (result < 0) {
//				System.out.println("실행실패");
	//		} else {
		//		System.out.println("실행성공");
			//}
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
		} finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	
	public static String Update() {
//		String sql = "Update DBTEST4 SET ID = 'a', PW = '1'";//어딘가 id가 a면 패스워드도 1로만들어버려라
//		String sql = "Update DBTEST4 SET ID = 'a', pw = '1' and where ID = 'a', and where pw = '1'"; //어딘가에 아이디가 a인 칼럼이 있다면 아이디와 패스워드를 교체
//		and 를 사용시 교집합이어야 함. 에러는 안나도 반영이 안될 수 있음.
//		String sql = "Update DBTEST4 SET ID = 'c', pw = '3' and where ID = 'z', or pw = '2'";
		Scanner sc = new Scanner(System.in);
		System.out.println("id : ");
		String id = sc.next();
		System.out.println("pw : ");
		String pw = sc.next();
		String sql = "Update dbtest3 set pw ='" + pw + "', cre_date= now() where id = '" + id + "'";
		
		return sql;
		
	}
}
