package ch04.com.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import study.DTO.User;

public class Java2023_04_17DAO implements Java2023_04_17Member{
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
		
		//회원가입
		@Override
		public Boolean insertData(String id, String password, String name, String phone, String ADDRESS, String email) {
			String query = "INSERT INTO "+tableName+" (ID,PW,NAME,PHONE,ADDRESS,EMAIL) VALUES(?,?,?,?,?,?)";
			
			try {
				Class.forName(mysqlDriver);
				System.out.println("데이터베이스 드라이버 로딩 성공");
				conn = DriverManager.getConnection(url, databaseID, databasePW);
				System.out.println("데이터베이스 연결 성공!");
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, password);
				pstmt.setString(3, name);
				pstmt.setString(4, phone);
				pstmt.setString(5, ADDRESS);
				pstmt.setString(6, email);
				pstmt.executeUpdate(query);
				System.out.println("SQL : "+query);
				System.out.println("Query 성공!");
				return true;
			} catch (Exception e) {
				System.out.println("데이터베이스 로딩 및 연결실패");
				e.printStackTrace();//뭔 예외인지 설명해주는 애
			}finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {}
			}
			return false;
		}
	//회원정보수정문(업데이트)
	public Boolean updateUser(User user) {
		return false;
		
	}
	
	//회원 탈퇴문(딜리트)
	public Boolean deleteData(String id) {
		return false;
		
	}
			
	//회원리스트출력(관리자)
	public Object selectAll() {
		return false;
	}

}
