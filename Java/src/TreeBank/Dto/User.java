package TreeBank.Dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class User {
//	
	private String id;
	private String pw;
	private String balance;
	private String accountNum;
	private String joinDate;
	private Date date;
	private int deposit;
	private int withdraw;
	private String account;//account는 거래내역 중, 이체받는 계좌를 뜻함.
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return " [아이디=" + id + ", 비밀번호=" + pw + ", 잔고=" + balance + ", 계좌번호=" + accountNum + ", 가입일="
				+ joinDate + "]";
	}
	public User() {
		super();
		String day = "";
		int dayNum = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		int monthNum = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		switch (dayNum) {
		case 1:
			day = "일";
			break;
		case 2:
			day = "월";
			break;
		case 3:
			day = "화";
			break;
		case 4:
			day = "수";
			break;
		case 5:
			day = "목";
			break;
		case 6:
			day = "금";
			break;
		case 7:
			day = "토";
			break;
		}
		
		this.joinDate = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"))+" "+day;
	}// a HH:mm:ss를 추가(오전/오후 시 분 초
	
}
