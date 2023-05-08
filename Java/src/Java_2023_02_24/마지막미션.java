package Java_2023_02_24;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

/*
	1. 여러명의 사용인을 생성 후 여러명의 정보 관리
	2. 회원가입, 장고부족 기능 추가 
 */
public class 마지막미션 {
	
	public static void main(String[] args) {
	boolean run = true;
	int balance = 0;
	Scanner scanner = new Scanner(System.in);
	//1.2.3 제작
	do {
		String 사용자명단[] = {"A,B,C"};
		int 예금액[] = new int[3];
		int 사용자 = 사용자명단.length;
		int 잔고관리[] = new int[예금액.length];
		//int [][]고객관리 = new int[사용자][잔고관리];
		사용자 = scanner.nextInt();
		System.out.println("------------------");
		System.out.println("사용인을 선택하시오.");
		System.out.println("1.A | 2. B | 3. C");
		System.out.println("------------------");
		System.out.print("선택>");
			for (int i = 0; i < 사용자; i++) {
				for (int j = 0; j < 잔고관리.length; j++) {
					System.out.print("["+사용자+" : "+잔고관리[j]+"] \n");
				}
			}
			if() {
				System.out.println("------------------");
				System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("------------------");
				System.out.print("선택>");
				switch (사용자) {
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
					System.out.println("balance");
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("Wrong answer");
				}
			}
			else{
				System.out.println("잘못된 사용인 입니다.");
			}
			System.out.println();
	}while(run);
	System.out.print("프로그램 종료");
	}
}
			/*System.out.println("------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------");
			System.out.print("선택>");
			switch (사용자) {
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
				System.out.println("balance");
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("Wrong answer");
			}
			System.out.println();

			
		}*/
	

