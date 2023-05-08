package 복습용.연습용20230308;

import java.util.Scanner;

import 복습용.연습용20230305.User;

public class Main {

	public static void main(String[] args) {
		
		// 1. 아이디와 비밀번호를 입력받는다.
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		
		// 2. 데이터베이스에 저장된 아이디와 일치하는지 확인
		
		/* 데이터베이스 가정 */
		User user = new User();
		user.setId("test");
		user.setPassword("testpw");
		
		String dbID = user.getId();
		String dbPW = user.getPassword();
		
		if (dbID.equals(id)) {
			if (dbPW.equals(password)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("비밀번호가 다릅니다.");
			}
		}else {
			System.out.println("등록된 아이디가 없습니다.");
		}
	}

}
