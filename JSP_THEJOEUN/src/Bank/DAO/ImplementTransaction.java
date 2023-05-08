package Bank.DAO;
import Bank.DTO.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementTransaction implements Transaction {
	
//	테이블 생성을 위한 주소값(위치, 아이디, 비번)
	String databaseName = "app";
	String port = "3306";
	String ip = "127.0.0.1";
	String mysqlDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://"+ip+":"+port+"/"+databaseName;
	/* Database 사용자 계정 */
	String databaseID = "root";
	String databasePW = "java";
	String tableName = "Transaction";
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
//	테이블 만들기
public Boolean create() {
		
		String query = "";
		query += "create table "+tableName+" (";
		query += "계좌번호 varchar(100), ";
		query += "deposit int, ";
		query += "withdraw int, ";
		query += "출금위치 varchar(100),";
		query += "balance int,";
		query += "JDate Timestamp not null default Current_timestamp";
		query += " )";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 거래내역 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			/* Query 실행 */
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("Query!");
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
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
//	계좌번호 입력받기
	@Override
	public Boolean insertData(User user) {
		String query = "INSERT INTO "+tableName+" (계좌번호, deposit, withdraw, balance, 출금위치) "
				+ " VALUES ('"
				+user.getAccountNum()+"','"
				+user.getDeposit()+"','"
				+user.getWithdraw()+"','"
				+user.getBalance()+"','"
				+user.getAccount()+"'"
				+ ")";
		
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 거래내역 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
			System.out.println("SQL : "+query);
			System.out.println("계좌번호 입력 성공!");
			return true;
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return false;
	}
	
//	업데이트 되는것들 총합묶음!!(입금,출금,총액)
	@Override
	public Boolean updateUser(User user) {
		String query = "UPDATE "+tableName+" SET "
				+ " WHERE 계좌번호 LIKE '"+ user.getAccountNum()+"'";
		System.out.println("SQL : "+query);
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 거래내역 드라이버 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			statement = connection.createStatement();//창조자
			statement.executeUpdate(query);
		
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return null;
	}
	
	//	계좌조회(계좌번호로 데이터베이스에서 검색가능하게끔)
	@Override
	public User selectUserAccountNum(String accountNum) {
		User userT = new User();
		String query = "SELECT * FROM "+tableName+" WHERE 계좌번호 LIKE '"+ accountNum+"'";
		System.out.println("SQL : "+query);
		ResultSet rs = null;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 거래내역 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			statement = connection.createStatement();//창조자
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				userT.setAccountNum(rs.getString(1));
				userT.setDeposit(rs.getInt(2));
				userT.setWithdraw(rs.getInt(3));
				userT.setAccount(rs.getString(4));
				userT.setBalance(rs.getString(5));
				userT.setJoinDate(rs.getString(6));
				return userT;
			}
			
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return null;
	}
	
	@Override
	public List<User> selectListAll(String accountNum) {
		List<User> list = new ArrayList<User>();
		String query = "SELECT * FROM "+tableName + " WHERE 계좌번호 LIKE '"+accountNum+"'";
		System.out.println("SQL : "+query);
		ResultSet rs = null;
		try {
			Class.forName(mysqlDriver);
			System.out.println("데이터베이스 드라이버 거래내역 로딩 성공");
			connection = DriverManager.getConnection(url, databaseID, databasePW);
			System.out.println("데이터베이스 거래내역 연결 성공!");
			statement = connection.createStatement();//창조자
			rs = statement.executeQuery(query);
			
			while (rs.next()) {
				User userT = new User();
				userT.setAccountNum(rs.getString(1));
				userT.setDeposit(rs.getInt(2));
				userT.setWithdraw(rs.getInt(3));
				userT.setAccount(rs.getString(4));
				userT.setBalance(rs.getString(5));
				userT.setJoinDate(rs.getString(6));
				list.add(userT);
			}
			
		} catch (Exception e) {
			System.out.println("데이터베이스 거래내역 로딩 및 연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {}
		}
		return list;
	}
}
