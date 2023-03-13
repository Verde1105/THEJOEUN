package PROJECT.BANK_Ver2.Service;
import java.util.List;
import java.util.Scanner;

import PROJECT.Dao.User;

public class A1_회원가입 {
	/* 1. 회원가입 기능 */
	public static List<User> 회원가입(List<User> database, String awtID, String awtPW) {
		
		String id = null;
		String password = null;
		User user = new User();
		
		// awt를 통해 입력받는 경우 기존방식 skip
		if (awtID.equals("없음")) {
			System.out.print("아이디 입력 : ");
			id = new Scanner(System.in).nextLine();
			System.out.print("비밀번호 입력 : ");
			password = new Scanner(System.in).nextLine();
		}else {
			// 기존방식으로 접근하는 경우
			id = awtID;
			password = awtPW;
		}
		
		
		boolean debugMode = false;
		
		System.out.println("ID : "+id);
		System.out.println("PW : "+password);
		String 계좌번호 = "";
		
		if ( database.size() == 0) {
			/* 총 13자리 */
			// 1. 5
			// 2. 3
			// 3. 5
			계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 +=String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			
			user.setId(id);					// 아이디
			user.setPw(password);			// 비밀번호
			user.setBalance("0");			// 비밀번호
			user.setAccountNum(계좌번호);	// 비밀번호
			
			database.add(user);
		}else {
			
			for (int i = 0; i < database.size(); i++) {
				if ( database.get(i)!=null && !database.get(i).getId().equals(id) ) {
					// System.out.println(i + " index is null");
					
					/* 총 13자리 */
					// 1. 5
					// 2. 3
					// 3. 5
					계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
					계좌번호 += "-";
					계좌번호 +=String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
					계좌번호 += "-";
					계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
					
					user.setId(id);					// 아이디
					user.setPw(password);			// 비밀번호
					user.setBalance("0");			// 비밀번호
					user.setAccountNum(계좌번호);	// 비밀번호
					
					database.add(user);
					
					break;
				}else if( database.get(i).getId().equals(id) ){
					System.out.println("------------------------------------------------");
					System.out.println("************* === 회원가입 실패 === ************");
					System.out.println("************** 중복된 아이디 입니다.************");
					System.out.println("------------------------------------------------");
					break;
				}
			}// The end of for (data insert)
		}
		
		
		return database;
	}// The end of method
}
