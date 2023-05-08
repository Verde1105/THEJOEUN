package 참고.BANK.main;

import java.util.Scanner;

import 참고.BANK.source.A1_회원가입;
import 참고.BANK.source.A2_회원정보;
import 참고.BANK.source.A3_로그인;
import 참고.BANK.source.A4_자산관리;

public class CV_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수부 */
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String id = "";
		String password = "";
		String[][] database = new String [10][3];
		String session[] = new String[3];
		
		try {
			/* 구현부 */
			do {
				System.out.println("New Ver 2.0 (Class로 구현한 버전)");
				System.out.println("------------------------------------------------");
				System.out.println("1.회원가입 | 2. 회원관리 | 3. 자산관리 | 4. 종료");
				System.out.println("------------------------------------------------");
				System.out.print("선택>");
				
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				
				case 1://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 1. 회원가입 ******************");
					database = A1_회원가입.회원가입(database, "없음", "없음");
					System.out.println("------------------------------------------------");
					break;
				case 2://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 2. 회원정보 ******************");
					System.out.println("------------------------------------------------");
					A2_회원정보.회원정보(database);
					break;
				case 3:
					System.out.println("------------------------------------------------");
					System.out.println("***************** 3. 자산관리 ******************");
					System.out.println("------------------------------------------------");
					if (A3_로그인.로그인(database, session) != null) {
						System.out.println("------------------------------------------------");
						System.out.println("************* 자산관리시스템 접속 **************");
						System.out.println("------------------------------------------------");
						A4_자산관리.자산관리시스템(database, session);
						break;
					}else {
						System.out.println("------------------------------------------------");
						System.out.println("********** 자산관리시스템 접속 실패 ************");
						System.out.println("------------------------------------------------");
						break;
					}
					
				case 4:
					System.out.println("4. 종료");
					run = false;
					break;
				default:
					System.out.println("Wrong answer");
				}
			}while(run); /* 구현부 끝 */
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception :"+e);
		}
		System.out.println("------------------------------------------------");
		System.out.println("************ === 프로그램 종료 === *************");
		System.out.println("------------------------------------------------");
	}

}
