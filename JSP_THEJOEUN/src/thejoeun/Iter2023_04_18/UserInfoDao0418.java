package thejoeun.Iter2023_04_18;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import thejoeun.Servlet2023_04_13.DBConnection;
import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoDao0418 implements UserDAO{
	public UserInfo selectone(String id) throws Exception{
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		UserInfo userlnfo = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, password, name form member where id = '" + id + "'");
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
			pstmt = conn.prepareStatement("select id, password, name from member where id=? and password=?");
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
			pstmt = conn.prepareStatement("insert into member(id,password,name) " + "values(?,?,?)");
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
	
	public UserInfo selectOne(String id) throws Exception {
	      Connection conn = DBConnection.getConnection();
	      Statement stmt = null;
	      ResultSet rs = null;
	      UserInfo userinfo = null;
	      try {
	         stmt = conn.createStatement(); // statement 쿼리 종류 선언
	 rs = stmt.executeQuery("SELECT ID, password, NAME FROM member WHERE ID= '" + id + "'");//쿼리선언
	 if (rs.next()) {
	    userinfo = new UserInfo().setId(rs.getString("ID")).setPw(rs.getString("password"))
	  .setName(rs.getString("NAME"));
	         }
	      } catch (Exception e) {
	         throw e;
	      } finally {
	         try {
	            if (rs != null)
	               rs.close();
	            if (stmt != null)
	               stmt.close();
	            if (conn != null)
	            	conn.close();
	
	         } catch (Exception e) {
	         }
	      }
	      return userinfo;
	   }
	   
	public int update(UserInfo userinfo)throws Exception{
	      Connection conn = DBConnection.getConnection(); //DB연결
	      PreparedStatement pstmt = null;
	      try {
	         //mysql, oracle
	         pstmt = conn.prepareStatement("UPDATE member SET password=?, NAME=? WHERE ID=?");
	            pstmt.setString(1, userinfo.getPw());
	            pstmt.setString(2, userinfo.getName());
	            pstmt.setString(3, userinfo.getId());
	         return pstmt.executeUpdate();
	      }catch(Exception e) {
	         throw e;
	      } finally {
	         try {
	            if(pstmt != null) pstmt.close();
	            if(conn != null) conn.close();
	         }catch(Exception e) {}
	      }
	   }
	
	public int delete(String id)throws Exception{
	      Connection conn = DBConnection.getConnection(); //DB연결
	      Statement stmt = null;
	      try {
	         //mysql, oracle
	         stmt = conn.createStatement();
	         return stmt.executeUpdate(
	               "DELETE FROM member WHERE ID='" + id + "'");
	      }catch(Exception e) {
	         throw e;
	      } finally {
	         try {
	            if(stmt != null) stmt.close();
	            if(conn != null) conn.close();
	         }catch(Exception e) {}
	      }
	   }
	   
	
	@Override
	public List<UserInfo> selectList() throws Exception{
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<UserInfo> userlnfos = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id,password, name from " + "member order by name asc");
			userlnfos = new ArrayList<UserInfo>();
			while (rs.next()) {
				userlnfos.add(new UserInfo()
					.setId(rs.getString("id"))
					.setPw(rs.getString("password"))
					.setName(rs.getString("name")));
			}
		} catch (Exception e) {
			throw e;
		}finally {
			try {
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {}
		}return userlnfos;
	}
}
