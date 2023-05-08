package Java_2023_02_24;

import java.util.Scanner;

public class BankMenu {

	public static void main(String[] args) {
	boolean run = true;
	int balance = 0;
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
	}while(run);
	System.out.print("프로그램 종료");
	}
		
}
	
