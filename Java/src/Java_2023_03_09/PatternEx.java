package Java_2023_03_09;

import java.util.regex.Pattern;

public class PatternEx {
//유효성검사
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//d가 디스몰의 약자
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);//매치확인
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		regExp = "\\w+@\\e+\\.com";
		data = "angel@nave.com";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
//AWT숫자만 입력가능한 텍스트 필드 이벤트라던가. 02나 010선택가능한 리스트라던가
