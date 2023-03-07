package 복습용.연습용20230305;

import java.util.Scanner;

public class 은행회원가입완전정복 {
	public static void main(String[] args) {
		User u = new User();
		
		/* 1. 입력받을 데이터 */
		//id
		//패스워드
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하시오.");
		
		//아이디 비밀번호 스캔 후 입력
		String id = scan.nextLine();
		System.out.println("패스워드를 입력하시오.");
		String password = scan.nextLine();
		
		//세터와 스캔 연동
		u.setId(id);
		u.setPassword(password);
		u.setNum(0);
		
		//데이터베이스
		User[] userArr = new User[10];
		userArr[0] = u;
		
		System.out.println(userArr[0].toString());
	}
}
//입력받을 데이터가 무엇인지 먼저 확인
//데이터를 받으려면 무엇을 해야할지 확인
//데이터 짜기(클래스 설계)
//결과 확인을 위한 출력