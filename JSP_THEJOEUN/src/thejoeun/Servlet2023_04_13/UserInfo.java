package thejoeun.Servlet2023_04_13;
import java.sql.SQLException;
import java.sql.*;

public class UserInfo {
	private String id;
	private String pw;
	private String name;
	
	public String getId() {
		return id;
	}
	public UserInfo setId(String id) {
		this.id = id;
		return this;
	}
	public String getPw() {
		return pw;
	}
	public UserInfo setPw(String pw) {
		this.pw = pw;
		return this;
	}
	public String getName() {
		return name;
	}
	public UserInfo setName(String name) {
		this.name = name;
		return this;
	}
}
