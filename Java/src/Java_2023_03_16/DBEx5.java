package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
//데이터베이스2를 만들고 아이디, 패스워드 칼럼 만들어서 데이터 저장
public class DBEx5 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(dr);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			con = DriverManager.getConnection(url,"root", "java");
			System.out.println("데이터베이스 연결 성공!");
			st = con.createStatement();//창조자
			String sql = "create table DBaction(ID varchar(5), PW varchar(15), age int)";//id = 컬럼
			st.executeUpdate(sql);
			String query = insert();
			st.executeUpdate(query);
//			System.out.println("여기까지왔는데 뭐가 에러인데");
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
	public static String insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요!");
		System.out.print(">>");
		String id = sc.next();
		System.out.println("패스워드를 입력해주세요!");
		System.out.print(">>");
		String pw = sc.next();
		System.out.println("나이를 입력해주세요!");
		System.out.print(">>");
		String age = sc.next();
		String query = "INSERT INTO DBaction VALUES('"+id+"','"+pw+"','"+age+"')";
		return query;
	}
}
