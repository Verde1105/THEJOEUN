package Java_2023_03_21;
/*
now, sysdate : 현재시간, 날짜정보 출력
curdate, currentdate : 현재 날짜정보 출력
curtime, currenttime : 현재 시간정보 출력
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.org.apache.bcel.internal.generic.Select;

import Java_2023_03_20.DBaction;

public class DBEx19 {
	public static void main(String[] args) {
		Connection con = DBaction.getInstance().getConnection();
		Statement st = null;
		ResultSet rs = null;
		String sql = select();
		try {
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
	}
	public static String select() {
//		String sql = "select sysdate() sysdate, now(), now";//현재시간, 날자정보 출력 
//		String sql = "select curdate() curdate, currnet_date() currentadte";// 
		String sql = "select curtime() curtime, currnet_time() currenttime";// 
		return sql;
	}
//	연습문제) 뱅크 사용자(회원) 가입일 기록하시오
}
