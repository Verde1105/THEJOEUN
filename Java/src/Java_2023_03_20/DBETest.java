package Java_2023_03_20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBETest {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
	String sql = "CREATE TALE TEST2("
			+"ID VARCHAR(10) unique,"
			+"PW VARCHAR(30),"
			+"NAME VARCHAR(30),"
			+"MDate DATE"
			+"AGE INT)";
	int result = 
		}
	}
