package 참고.BANK_Ver3.Service;

//import java.util.List;
import java.util.Scanner;

import 참고.BANK_Ver3.Dao.ImplementMember;
import 참고.Dao.User;

public class A3_로그인 {
	static int sCount = 0;
	public static User 로그인() {
		System.out.println("------------------------------------------------");
		System.out.println("*********** === 프로그램 로그인 === ************");
		System.out.println("------------------------------------------------");
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		
		ImplementMember member = new ImplementMember();
		User user = member.selectUserID(id);
		
		if (user != null) {
			System.out.println("ID is in Database");
			if (user.getId().equals(id)) {
				if ( user.getPw().equals(password)) {
					System.out.println("------------------------------------------------");
					System.out.println("************** === 로그인 성공 === *************");
					System.out.println("------------------------------------------------");
					return user;
				}else {
					System.out.println("------------------------------------------------");
					System.out.println("********** === 비밀번호가 다릅니다. === ********");
					System.out.println("------------------------------------------------");
					sCount++;
					return null;
				}
			}else {
				System.out.println("------------------------------------------------");
				System.out.println("************** === 로그인 실패 === *************");
				System.out.println("************ 로그인을 할 수 없습니다.***********");
				System.out.println("------------------------------------------------");
				sCount++;
				return null;
			}
		}else if(user == null) {
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 실패 === *************");
			System.out.println("************ 로그인을 할 수 없습니다.***********");
			System.out.println("------------------------------------------------");
			sCount++;
			return null;
		}
		
		
		
		
		if (sCount == 0) {
			return null;
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
