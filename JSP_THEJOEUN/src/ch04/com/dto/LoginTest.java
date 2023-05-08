package ch04.com.dto;

import java.util.regex.Pattern;

public class LoginTest {
	public LoginTest() {}
	
	public Boolean id() {
		
		String 문자 = "/^[a-Z | A-Z | ㄱ-ㅎ | ㅏ-ㅣ | 가-힣 ]/";
		String in = "";
		boolean result = Pattern.matches(문자, in);//매치확인
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		return result;
	}
	
	public Boolean pw() {
		String 숫자 = "/^[0-9]*$/";
		String in = "";
		boolean result = Pattern.matches(숫자, in);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		return result;
	}
		
	public Boolean name() {
		String 이름 = "/^[가-힣]*$/";
		String in = "";
		boolean result = Pattern.matches(이름, in);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		return result;
}
		
	public Boolean phone() {
		String 번호 = "(02|010|011|016|017|019)-\\d{3,4}-\\d{4}";//d가 디스몰의 약자
		String in = "";
		boolean result = Pattern.matches(번호, in);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		return result;
	}
		
	public Boolean email() {
		String 이메일= "\\w+@\\e+\\*@[0-9|a-z|A-Z]";
		String in = "";
		boolean result = Pattern.matches(이메일, in);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		return result;
	}
	
}
