package TreeBank;

import java.util.Scanner;

import TreeBank.Dao.ImplementTransaction;
import TreeBank.Dao.ImplementMember;
import TreeBank.Service.A1_회원가입;
import TreeBank.Service.A2_회원정보;
import TreeBank.Service.A3_로그인;
import TreeBank.Service.A4_자산관리;
import TreeBank.Dto.User;
public class Main {

	public static void main(String[] args) {
		/* 변수 선언부 */
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String id = "";
		String password = "";
//		String[][] database = new String [10][5];
//		List<User> database = new ArrayList<User>();
		User session = new User();
		
		/* 클래스 instance 생성 */
		ImplementMember member = new ImplementMember();
		ImplementTransaction transaction = new ImplementTransaction();
		try {
			/* 구현부 */
			do {
				/* Controller의 역할 */
				// 요청받은것을 Service > Model(Database)로 전달
				System.out.println("-------------------------------------------------");
				System.out.println("=============== | 10.CREATE Table | ==============");
				System.out.println("=============== | 11.DROP Table | ==============");
				System.out.println("-------------------------------------------------");
				System.out.println("1.회원가입 | 2. 회원관리 | 3. 자산관리 | 99. 종료");
 				System.out.println("-------------------------------------------------");
				System.out.print("선택>");
				
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				
				case 10://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("**************| 10.CREATE TABLE |***************");
					member.createTable();
					transaction.create();
					System.out.println("------------------------------------------------");
					break;
				case 11://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("****************| 11.DROP Table |***************");
					member.Delete();
					transaction.Delete();
					System.out.println("------------------------------------------------");
					break;
				case 1://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 1. 회원가입 ******************");
					System.out.println("------------------------------------------------");
					A1_회원가입.회원가입();
					break;
				case 2://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 2. 회원정보 ******************");
					System.out.println("------------------------------------------------");
					A2_회원정보.회원정보();
					break;
				case 3:
					System.out.println("------------------------------------------------");
					System.out.println("***************** 3. 자산관리 ******************");
					System.out.println("------------------------------------------------");
					A3_로그인 login = new A3_로그인();
					User user = login.로그인();
					if ( user != null) {
						A4_자산관리.자산관리시스템(user);
					}
					break;
				case 99:
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
