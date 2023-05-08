package ch04.com.dto;

import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

import thejoeun.Servlet2023_04_13.DBConnection;
import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoDaolmpl {
	public UserInfo selectone(String id) throws Exception{
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		UserInfo userlnfo = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, pw, name form userinfo where id = '" + id + "'");
			if (rs.next() ) {
				userlnfo = new UserInfo()
						.setId(rs.getString("id"))
						.setPw(rs.getString("pw"))
						.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			throw e;
		}finally {
			try {
				if (rs != null)rs.close();
				if (conn != null)conn.close();
				if (stmt != null)stmt.close();
			} catch (Exception e2) {}
		}
		return userlnfo;
	}
	
	public UserInfo exist(String id, String password) throws Exception{
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserInfo userlnfo = null;
		try {
			pstmt = conn.prepareStatement("select id, pw, name from Userlnfo where id=? and pw=?");
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				userlnfo = new UserInfo().setId(rs.getString(1)).setPw(rs.getString(2)).setName(rs.getString(3));
			}
		}catch (Exception e) {
			throw e;
		}finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return userlnfo;
	}
		
	public int insert(UserInfo userlnfo) throws Exception{
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("insert into userinfo(id,pw,name) + values(?,?,?)");
			pstmt.setString(1, userlnfo.getId());
			pstmt.setString(2, userlnfo.getPw());
			pstmt.setString(3, userlnfo.getName());
			return pstmt.executeUpdate();
		}catch (Exception e) {
			throw e;
		}finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {}
		}
	}
}
