package study.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import study.DTO.User;

public class ImplementMember implements MemberDAO{
	//데이터베이스 주소창
	String databaseName = "app";
	String port = "3306";
	String ip = "127.0.0.1";
	String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://"+ip+":"+port+"/"+databaseName;
	
	/* Database 사용자 계정 */
	String databaseID = "root";
	String databasePW = "java";
	String tableName = "PT";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//데이터테이블만들기
	@Override
	public Boolean createTable() {
		String query = "";
		query += "create table "+tableName+" (";
		query += "ID varchar(50), ";
		query += "PW varchar(50), ";
		query += "NAME varchar(20), ";
		query += "PHONE varchar(13), ";
		query += "ADDRESS varchar(100), ";
		query += "EMAIL varchar(50), ";
		query += "JDate Timestamp not null default Current_timestamp";
		query += " )";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 거래내역 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			/* Query 실행 */
			pstmt = conn.prepareStatement(query);
			pstmt.executeQuery();
			System.out.println("SQL : "+query);
			System.out.println("Query 성공!");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	//데이터테이블삭제
	@Override
	public Boolean Delete()	{
		
		String query = "";
		query += "Drop table "+tableName+"";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 로딩 성공");
			conn = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			/* Query 실행 */
			pstmt = conn.prepareStatement(query);
			pstmt.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("데이터베이스 삭제 완료");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	//회원가입
	@Override
	public Boolean insertData(String id, String password, String name, String phone, String ADDRESS, String email) {
		String query = "INSERT INTO "+tableName+" (ID,PW,NAME,PHONE,ADDRESS,EMAIL) VALUES(?,?,?,?,?,?)";
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스를 로딩합니다");
			conn = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 로딩 성공!");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, ADDRESS);
			pstmt.setString(6, email);
			pstmt.executeUpdate(query);
			System.out.println("SQL : "+query);
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	//회원정보수정문(업데이트)
	@Override
	public Boolean updateUser(User user) {
		String query = "UPDATE "+tableName+"SET PW =?, NAME=?, PHONE=?, ADDRESS=?, EMAIL=?";
		System.out.println("SQL : "+query);
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 로딩중...");
			conn = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 로딩 성공!");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getPw());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPhone());
			pstmt.setString(4, user.getADDRESS());
			pstmt.setString(5, user.getEmail());
			pstmt.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	//회원 탈퇴문(딜리트)
	@Override
	public Boolean deleteData(String id) {
		String query = "DELETE FROM "+tableName+" WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);			
			pstmt.executeUpdate();
			System.out.println("SQL : "+query);
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	//아이디 중복체크
	@Override
	public Boolean selectID(String id) {
		String query = "SELECT * FROM "+tableName+" WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);			
			pstmt.executeUpdate();
			System.out.println("SQL : "+query);
			return false;
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		System.out.println("SQL : "+query);
		System.out.println("출력 성공!");
		return true;
	}
	
	//회원리스트출력(관리자)
	@Override
	public Object selectAll(){
		List<User> userList = new ArrayList<User>();
		String query = "SELECT * FROM "+tableName;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 ~로딩중~");
			conn = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("연결 성공!");
			pstmt = conn.prepareStatement(query);
			while (rs.next()) {
				User user = new User();
				pstmt.setString(1, user.getPw());
				pstmt.setString(2, user.getName());
				pstmt.setString(3, user.getPhone());
				pstmt.setString(4, user.getADDRESS());
				pstmt.setString(5, user.getEmail());
				userList.add(user);
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		System.out.println("SQL : "+query);
		System.out.println("출력 성공!");
		return userList;
	}
}
