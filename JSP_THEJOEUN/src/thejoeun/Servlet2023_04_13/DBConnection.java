package thejoeun.Servlet2023_04_13;
import java.sql.SQLException;
import java.sql.*;

public class DBConnection {
	public static Connection getConnection()throws SQLException, ClassNotFoundException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/JSPBookDB";
		String user = "root";
		String password = "java";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
}
