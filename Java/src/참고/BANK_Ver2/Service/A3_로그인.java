package 참고.BANK_Ver2.Service;

import java.util.List;
import java.util.Scanner;

import 참고.Dao.User;

public class A3_로그인 {
	static int sCount = 0;
	public static String[] 로그인(List<User> database, String session[]) {
		System.out.println("------------------------------------------------");
		System.out.println("*********** === 프로그램 로그인 === ************");
		System.out.println("------------------------------------------------");
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		String chackPW = "";
		
		
		// 1. Database에 ID 확인
		for (int i = 0; i < database.size(); i++) {
			
			// 1-1. 아이디가 있으면 세션에 비밀번호와 index 저장
			if (database.get(i).getId().equals(id)) {
				
				// chackPW 변수에 database에 저장된 비밀번호 저장
				chackPW = database.get(i).getPw();
				
				// 세션에 아이디가 있는 index값(i) 저장
				session[2] = Integer.toString(i); //PK
				break;
				
			}else if (database.get(i).getId() == null ||database.get(i).getId().equals(null) || 
				!(database.get(i).getId().equals(id)) ) {
				System.out.println("------------------------------------------------");
				System.out.println("************** === 로그인 실패 === *************");
				System.out.println("************ 로그인을 할 수 없습니다.***********");
				System.out.println("------------------------------------------------");
				return null;
			}
		}// The end of For
		
		// 2. ID 있으면 비밀번호 확인
		if (chackPW.equals(password)) {
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 성공 === *************");
			System.out.println("------------------------------------------------");
		}else {
			System.out.println("------------------------------------------------");
			System.out.println("********** === 비밀번호가 다릅니다. === ********");
			System.out.println("------------------------------------------------");
			sCount++;
		}
		
		if (sCount == 0) {
			// 로그인 성공했을 때 ID,PW를 세션에 저장
			session[0] = id;
			session[1] = password;
			return session;
		}if (sCount > 2){
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 실패 === *************");
			System.out.println("*3회 이상 로그인 실패, 로그인을 할 수 없습니다.*");
			System.out.println("------------------------------------------------");
			return null;
		}else {
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 실패 === *************");
			System.out.println("------------------------------------------------");
		}
		
		
		return null;
	}// The end of method
}
