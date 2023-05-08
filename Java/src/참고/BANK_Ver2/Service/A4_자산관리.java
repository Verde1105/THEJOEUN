package 참고.BANK_Ver2.Service;

import java.util.List;
import java.util.Scanner;

import 참고.Dao.User;

public class A4_자산관리 {
public static String[][] 자산관리시스템(List<User> database, String[] session) {
		
		
		boolean run = true;
		int balance = 0;
		
		// database = [["id", "pw", "balance"]]
		
		/* 세션에 등록된 로그인계정의 PK(배열 index 정보)를 이용 */
		/* 해당 계정의 balance를 불러온다. */
//		balance = Integer.parseInt(database[Integer.parseInt(session[2])][2]);
		balance = Integer.parseInt(database.get(Integer.parseInt(session[2])).getBalance());
		Scanner scanner = new Scanner(System.in);
		//1.2.3 제작
		do {
			System.out.println("------------------------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 계좌이체 | 0. 로그아웃");
			System.out.println("------------------------------------------------------");
			System.out.println("선택>");
			int menuNum = scanner.nextInt();
			
			switch (menuNum) {
			case 1://연산 후 대입연산
				System.out.println("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println("balance : "+balance);//누구를 위한 벨런스인가를 고민해봤길 바람.
				break;
			case 4:
				System.out.println("계좌번호 입력>");
				String 계좌번호 = new Scanner(System.in).nextLine();
				System.out.println("입금금액 입력>");
				String 입금금액 = new Scanner(System.in).nextLine();
				for (int i = 0; i < database.size(); i++) {
					// 1. 입력한 계좌번호가 맞으면
					if (database.get(i).getAccountNum().equals(계좌번호)) {
						// 2. 계좌번호 주인의 balance에 금액을 더한다.
//						database[i][2] = String.valueOf(입금금액);
						database.get(i).setBalance(입금금액);
						break;
					}
				}
				balance -= Integer.parseInt(입금금액);
				System.out.println("balance : "+balance);//누구를 위한 벨런스인가를 고민해봤길 바람.
				break;
			case 0:
				run = false;
				break;
			default:
				System.out.println("Wrong answer");
			}
			System.out.println();
			// database[Integer.parseInt(session[2])][2] = Integer.toString(balance);
			database.get(Integer.parseInt(session[2])).setBalance(Integer.toString(balance));
		}while(run);
		System.out.print("프로그램 종료");
		
		return null;
	}// The end of method
}
