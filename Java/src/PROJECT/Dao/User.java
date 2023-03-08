package PROJECT.Dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class User {
	
	private String id;
	private String pw;
	private String balance;
	private String accountNum;
	private String joinDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return " [아이디=" + id + ", 비밀번호=" + pw + ", 잔고=" + balance + ", 계좌번호=" + accountNum + ", 가입일="
				+ joinDate + "]";
	}
	public User() {
		super();
		this.joinDate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
	}
	
}
