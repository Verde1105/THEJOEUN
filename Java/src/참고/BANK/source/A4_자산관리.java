package 참고.BANK.source;

import java.util.Scanner;

public class A4_자산관리 {
public static String[][] 자산관리시스템(String[][] database, String[] session) {
		
		
		boolean run = true;
		int balance = 0;
		
		// database = [["id", "pw", "balance"]]
		balance = Integer.parseInt(database[Integer.parseInt(session[2])][2]);
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
				for (int i = 0; i < database.length; i++) {
					// 1. 입력한 계좌번호가 맞으면
					if (database[i][3].equals(계좌번호)) {
						// 2. 계좌번호 주인의 balance에 금액을 더한다.
						database[i][2] = String.valueOf(입금금액);
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
			database[Integer.parseInt(session[2])][2] = Integer.toString(balance);
		}while(run);
		System.out.print("자산관리 로그아웃");
		
		return null;
	}// The end of method
}
