package Java_2023_03_20;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBaction {

	private static DBaction instance = new DBaction(); 
	public Connection conn = null;
	public DBaction() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/corona";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root", "java");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static DBaction getInstance() {
		if(instance == null) new DBaction();
		return instance;
	}
	public Connection getConnection() {
		return this.conn;
	}
	
}
