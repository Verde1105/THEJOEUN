package Java_2023_03_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx18_2 {
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
			String qu = insert();//인덱스 입력한 이후 얘를 끄고 셀렉트문 입력시켜주면 됨.
			st.executeUpdate(qu);
//			String qu = select();
//			st = con.createStatement();
//			st.executeUpdate(qu);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (SQLException e2) {}
		}
	}
	
	public static String insert() {
//		String qu = "insert into bwtest values(1, '2020-01-01', '홍길동')";
		String qu = "insert into bwtest values(2, '2020-01-02', '이순신')";
//		String qu = "insert into bwtest values(3, '2020-01-03', '만득이')";
//		String qu = "insert into bwtest values(4, '2020-02-01', '개똥이')";
//		String qu = "insert into bwtest values(5, '2020-02-02', '칠득이')";
//		String qu = "insert into bwtest values(6, '2020-0301', '갑돌이')";
//		String qu = "insert into bwtest values(7, '2020-0302', '갑순이')";
		return qu;
	}
//	public static String select() {
//		String qu = "select * from bwtest where idx between 2 and 5";
//		String qu = "select * from bwtest where idx >= 2 and <= 5";
//		String qu = "select * from bwtest limit 2";//1~n개;
//		String qu = "select * from bwtest limit 2 offset 5";//가져올 게시물 n개 ~ n 이후부터;
//		String qu = "select * from bwtest order by idx desc limit 5,2";//n 이후부터 ~ 가져올 게시물 n개;
//		return qu;
//		연습문제) 2020-01-02 ~2020-01-08 범위의 레코드를 추출하시오.
//		limit : 범위 추출
//		연습문제) 뱅크 사용자(회원) 출력화면을 만들고 5명씩 페이지별로 출력하시오
		
//	}
}
