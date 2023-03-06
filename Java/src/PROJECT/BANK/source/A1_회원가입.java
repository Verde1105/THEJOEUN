package PROJECT.BANK.source;

import java.util.Scanner;

public class A1_회원가입 {
	/* 1. 회원가입 기능 */
	public static String[][] 회원가입(String[][] database) {
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		
		System.out.println("ID : "+id);
		System.out.println("PW : "+password);
		
		
		// 1. 회원 데이터 입력
		for (int i = 0; i < database.length; i++) {
			if (database[i][0] == null) {
				// System.out.println(i + " index is null");
				database[i][0] = id;										// 아이디
				database[i][1] = password;									// 비밀번호
				database[i][2] = "0";										// 잔고
				database[i][3] =  String.valueOf((int)(Math.random()*100));	// 계좌번호
				break;
			}else {
				System.out.println(i + " index is not null");
				System.out.println(id + "," + password);
			}
		}// The end of for (data insert)
		
		// 2. 입력된 데이터 확인
		for (int i = 0; i < database.length; i++) {
			System.out.println(i+", ID : " 		+ database[i][0]);
			System.out.println(i+", PW : " 		+ database[i][1]);
			System.out.println(i+", BALANCE : " + database[i][2]);
			System.out.println(i+", 계좌번호 : "+ database[i][3]);
			break;
		}// The end of for (data select *)
		
		return database;
	}// The end of method
}
