package Java_2023_03_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import 참고.Dao.User;

public class 은행에연동해보기 {
	//값넣는 곳
	
//	유저타입 클래스를 생성자로 불러와서
//	겟,셋으로 세팅
//	id는 아이디대로 
//	pw는 비밀번호대로 각 지정
	static User u = new User();
	
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
			String sql = insert();
//			u.setId(insert());
//			u.setPw(insert());
//			System.out.println(1);
			st.executeUpdate(sql);
//			System.out.println(2);
			System.out.println(u.getId() + " : " + u.getPw());
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결 실패!");
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	
	public static String insert() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요!");
		System.out.print(">>");
		String id = sc.next();
		u.setId(id);
		System.out.println("패스워드를 입력해주세요!");
		System.out.print(">>");
		String pw = sc.next();
		u.setPw(pw);
//		System.out.println("계좌 번호를 입력해주세요!");
//		System.out.print(">>");
//		String age = sc.next();
		String sq = "INSERT INTO 은행데이터베이스 VALUES" + "('"+id+"','"+pw+"', now())";
		
		return sq;//리턴에서 데이터베이스 이름체크 반드시
	}
}
