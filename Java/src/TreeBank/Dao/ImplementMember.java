package TreeBank.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TreeBank.Dto.User;
public class ImplementMember implements Member {
	
	/* Database 접속 정보 */
	String databaseName = "app";
	String port = "3306";
	String ip = "127.0.0.1";
	String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://"+ip+":"+port+"/"+databaseName;
	/* Database 사용자 계정 */
	String databaseID = "root";
	String databasePW = "java";
	String tableName = "member";
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	/* 테이블 생성 */
	@Override
	public Boolean createTable() {
		
		String query = "";
		query += "create table "+tableName+" (";
		query += "ID varchar(50) ,";
		query += "PW varchar(50), ";
		query += "balance int, ";
		query += "accountNum varchar(100) PRIMARY KEY,";
		query += "Date Timestamp not null default current_Timestamp";
		query += " )";
		System.out.println(query);
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			/* Query 실행 */
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("Query 성공!");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		} finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
public Boolean Delete() {
		
		String query = "";
		query += "Drop table "+tableName+"";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 거래내역 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			/* Query 실행 */
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("데이터베이스 삭제 완료");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		} finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	/* 회원 데이터 삽입 */
	@Override
	public Boolean insertData(String id, String password, String 계좌번호) {
		String query = "INSERT INTO "+tableName+" (ID,PW,BALANCE,accountNum) VALUES('"+id+"','"+password+"','0','"+계좌번호+"')";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("Query 성공!");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
	/* 회원 데이터 조회 */
	@Override
	public List<User> selectAll() {
		List<User> userList = new ArrayList<User>();
		String query = "SELECT * FROM "+tableName;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			statement = connection.createStatement();//창조자
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getString(1));
				user.setPw(resultSet.getString(2));
				user.setBalance(resultSet.getString(3));
				user.setAccountNum(resultSet.getString(4));
				user.setJoinDate(resultSet.getString(5));
				userList.add(user);
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		System.out.println("SQL : "+query);
		System.out.println("Query 성공!");
		return userList;
	}
	
	/* ID로 회원정보 조회 */
	@Override
	public User selectUserID(String id) {
		User user = new User();
		String query = "SELECT * FROM "+tableName+" WHERE ID LIKE '"+ id+"'";
		System.out.println("SQL : "+query);
		ResultSet rs = null;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			statement = connection.createStatement();//창조자
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				user.setId(rs.getString(1));
				user.setPw(rs.getString(2));
				user.setBalance(rs.getString(3));
				user.setAccountNum(rs.getString(4));
				user.setJoinDate(rs.getString(5));
				return user;
			}
		
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return null;
	}
	
	@Override
	public User selectUserAccountNum(String accountNum) {
		User user = new User();
		String query = "SELECT * FROM "+tableName+" WHERE accountNum LIKE '"+ accountNum+"'";
		System.out.println("SQL : "+query);
		ResultSet rs = null;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			statement = connection.createStatement();//창조자
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				user.setId(rs.getString(1));
				user.setPw(rs.getString(2));
				user.setBalance(rs.getString(3));
				user.setAccountNum(rs.getString(4));
				return user;
			}
		
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return null;
	}
	
	@Override
	public Boolean deleteData() {
		String query = "";
		return null;
	}

	@Override
	public Boolean updateUser(User user) {
		String query = "UPDATE "+tableName+" "
				+ " SET ID = '"+user.getId()+"',"
				+ "  PW = '"+user.getPw()+"',"
				+ "  balance = '"+user.getBalance()+"',"
				+ "  accountNum = '"+user.getAccountNum()+"'"
				+ " WHERE accountNum LIKE '"+ user.getAccountNum()+"'";
		System.out.println("SQL : "+query);
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 연결 성공!");
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
		
		} catch (Exception e) {
			System.out.println("데이터베이스 로딩 및 연결실패");
			e.printStackTrace();//뭔 예외인지 설명해주는 애
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return null;
	}

	@Override
	public Boolean updateAccount() {
		String query = "";
		return null;
	}
	
	@Override
	public void test() {
		System.out.println("이 함수를 이용한다.");
	}
}
