package study;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

import thejoeun.Servlet2023_04_13.UserInfo;

public class ToDayTest01DAO implements ToDayTestInterf {
	String databaseName = "JSPBookDB";
	String port = "3306";
	String ip = "127.0.0.1";
	String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://"+ip+":"+port+"/"+databaseName;
	
	String databaseID = "root";
	String databasePW = "java";
	String tableName = "member";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public Boolean insert(UserInfo userinfo) {
		String query = "INSERT INTO member(id, password, name)";
				query+= " VALUES(?, ?, ?) ";
				System.out.println(query);
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userinfo.getId());
			pstmt.setString(2, userinfo.getPw());
			pstmt.setString(3, userinfo.getName());
			pstmt.executeUpdate();
			System.out.println("회원가입 : "+userinfo.toString());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}// The end of Method
	
	@Override
	public Boolean check (UserInfo userinfo) {
		String query = "SELECT * FROM"+tableName+" WHERE id = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userinfo.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				userinfo.setId(rs.getString(1));
				userinfo.setPw(rs.getString(2));
				userinfo.setName(rs.getString(3));
				if (rs.getString(1).equals(userinfo.getId())) {
					System.out.println("중복된 아이디입니다.");
					return false;
				}else {
					System.out.println("사용가능한 아이디 입니다.");
					return true;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}// The end of Method
}
