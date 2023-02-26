package Java_2023_02_24.mission.source;

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
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
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
				run = false;
				break;
			default:
				System.out.println("Wrong answer");
			}
			System.out.println();
			database[Integer.parseInt(session[2])][2] = Integer.toString(balance);
		}while(run);
		System.out.print("프로그램 종료");
		
		return null;
	}// The end of method
}
