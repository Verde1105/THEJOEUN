package Java_2023_03_21;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import Java_2023_03_20.DBaction;
/*
order by 문 order by (asc[ascending], desc[descer])
*/

public class DBEx17 {
	public static void main(String[] args) {
		Connection con = DBaction.getInstance().getConnection();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
/*
			String qu = insert();
			st.executeUpdate(qu);
			*/
			String qu = orderby();
			st.executeUpdate(qu);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			//이하 셀랙트문 핵심
			while (rs.next()) {
				for (int i = 1; i < cols; i++) {
					System.out.println(rs.getString(i)+ "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
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
//		String qu = "insert into obtest values(1, 'abc')";
//		String qu = "insert into obtest values(2, 'def')";
		String qu = "insert into obtest values(3, 'ghi')";
		return qu;
	}
	
	public static String orderby() {
//		String qu = "select * from obder by num asc";//해당 테이블로부터 추출해오겠다. 넘버 기준으로, 정렬해서.(기본은 오름차순 정렬)
		String qu = "select * from board order by board_id desc";//내림차순 정렬 방식
		return qu;
	}
//	실습과제 ) 뱅크 사용자 등급별로 vip등급 기준 내림차순으로 정렬하여 출력하시오.
//관리자 모드 만들기
}
