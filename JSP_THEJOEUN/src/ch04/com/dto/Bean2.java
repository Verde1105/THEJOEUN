package ch04.com.dto;

import java.util.regex.Pattern;

public class Bean2 {
	private String id = "";
	private String pw = "";
	private String name = "";
	
	public Bean2() {	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		String 아이디확인용 = "/^[a-Z | A-Z | ㄱ-ㅎ | ㅏ-ㅣ | 가-힣 ]/";
		Pattern.matches(아이디확인용, id);
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		String 숫자 = "/^[0-9]*$/";
		Pattern.matches(숫자, pw);
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

}
