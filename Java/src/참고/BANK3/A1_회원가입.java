package 참고.BANK3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import 참고.Dao.User;

public class A1_회원가입 {
	/* 1. 회원가입 기능 */
//	public static List<User> 회원가입(List<User> database, String awtID, String awtPW) {
	public static ArrayList<User> 회원가입(ArrayList<User> database, String awtID, String awtPW) {
		
		String id = null;
		String password = null;
		
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
		
		// 1. 회원 데이터 입력
//		for (int i = 0; i < database.length; i++) {
			if (database[i][0] == null) {
				// System.out.println(i + " index is null");
				
				/* 총 13자리 */
				// 1. 5
				// 2. 3
				// 3. 5
				계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
				계좌번호 += "-";
				계좌번호 += String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
				계좌번호 += "-";
				계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
				
				database[i][0] = id;										// 아이디
				database[i][1] = password;									// 비밀번호
				database[i][2] = "0";										// 잔고
			//	database[i][3] = String.valueOf((int)(Math.random()*100));	// 계좌번호
				database[i][3] = 계좌번호;
				database[i][4] = LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
				break;
			}else if( (database[i][0] != null && database[i][0].equals(id)) ){
				System.out.println("------------------------------------------------");
				System.out.println("************* === 회원가입 실패 === ************");
				System.out.println("************** 중복된 아이디 입니다.************");
				System.out.println("------------------------------------------------");
				break;
			}
//		}// The end of for (data insert)
		
		// 2. 입력된 데이터 확인
		if (debugMode) {
			System.out.println("입력된 데이터 확인");
			for (int i = 0; i < database.length; i++) {
				System.out.println(i+", ID : " 		+ database[i][0]);
				System.out.println(i+", PW : " 		+ database[i][1]);
				System.out.println(i+", BALANCE : " + database[i][2]);
				System.out.println(i+", 계좌번호 : "+ database[i][3]);
				System.out.println(i+", 가입날짜 : "+ database[i][4]);
				break;
			}// The end of for (data select *)
		}
		
		return database;
	}// The end of method
}
