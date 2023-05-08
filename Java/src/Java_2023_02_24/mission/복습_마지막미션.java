package Java_2023_02_24.mission;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

/*
1. 여러명의 사용인을 생성 후 여러명의 정보 관리
2. 회원가입, 장고부족 기능 추가 
*/
public class 복습_마지막미션 {
	
	public static void main(String[] args) {
		
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
				System.out.println("------------------------------------------------");
				System.out.println("1.회원가입 | 2. 회원관리 | 3. 자산관리 | 4. 종료");
				System.out.println("------------------------------------------------");
				System.out.print("선택>");
				
				int menuNum = scanner.nextInt();
				switch (menuNum) {
				
				case 1://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 1. 회원가입 ******************");
					database = 회원가입(database);
					System.out.println("------------------------------------------------");
					break;
				case 2://연산 후 대입연산
					System.out.println("------------------------------------------------");
					System.out.println("***************** 2. 회원정보 ******************");
					System.out.println("------------------------------------------------");
					회원정보(database);
					break;
				case 3:
					System.out.println("------------------------------------------------");
					System.out.println("***************** 3. 자산관리 ******************");
					System.out.println("------------------------------------------------");
					if (로그인(database, session) != null) {
						System.out.println("------------------------------------------------");
						System.out.println("************* 자산관리시스템 접속 **************");
						System.out.println("------------------------------------------------");
						자산관리시스템(database, session);
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
	}// The end of method
	
	/* 1. 회원가입 기능 */
	public static String[][] 회원가입(String[][] database) {
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		
		System.out.println("ID : "+id);
		System.out.println("PW : "+password);
		
		
		// 1. 데이터 입력
		for (int i = 0; i < database.length; i++) {
			if (database[i][0] == null) {
				// System.out.println(i + " index is null");
				database[i][0] = id;
				database[i][1] = password;
				database[i][2] = "0";
				break;
			}else {
				System.out.println(i + " index is not null");
				System.out.println(id + "," + password);
			}
		}// The end of for (data insert)
		
		// 2. 입력된 데이터 확인
		for (int i = 0; i < database.length; i++) {
			System.out.println(i+", ID : " + database[i][0]);
			System.out.println(i+", PW : " + database[i][1]);
			System.out.println(i+", BALANCE : " + database[i][2]);
			break;
		}// The end of for (data select *)
		
		return database;
	}// The end of method
	
	/*2. 회원정보*/
	public static void 회원정보(String[][] database) {
		// 2. 입력된 데이터 확인
		for (int i = 0; i < database.length; i++) {
			System.out.println(i+", ID : " + database[i][0]+", PW : " + database[i][1]+", BALANCE : " + database[i][2]);
		}// The end of for (data select *)
	}
	
	/* 3. 로그인기능 */
	public static String[] 로그인(String[][] database, String session[]) {
		System.out.println("------------------------------------------------");
		System.out.println("*********** === 프로그램 로그인 === ************");
		System.out.println("------------------------------------------------");
		System.out.print("아이디 입력 : ");
		String id = new Scanner(System.in).nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = new Scanner(System.in).nextLine();
		String chackPW = "";
		int sCount = 0;
		
		// 1. Database에 ID 확인
		for (int i = 0; i < database.length; i++) {
			
			// 1-1. 아이디가 있으면 세션에 비밀번호와 index 저장
			if (database[i][0].equals(id)) {
				chackPW = database[i][1];
				session[2] = Integer.toString(i); //PK
				break;
			}
		}// The end of For
		
		// 2. ID 있으면 비밀번호 확인
		if (chackPW.equals(password)) {
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 성공 === *************");
			System.out.println("------------------------------------------------");
		}else {
			System.out.println("------------------------------------------------");
			System.out.println("********** === 비밀번호가 다릅니다. === ********");
			System.out.println("------------------------------------------------");
			sCount++;
		}
		
		if (sCount == 0) {
			// 로그인 성공했을 때 ID,PW를 세션에 저장
			session[0] = id;
			session[1] = password;
			return session;
		}else {
			System.out.println("------------------------------------------------");
			System.out.println("************** === 로그인 실패 === *************");
			System.out.println("************** ===\t"+database[Integer.parseInt(session[2])][0]);
			System.out.println("************** ===\t"+database[Integer.parseInt(session[2])][1]);
			System.out.println("------------------------------------------------");
		}
		
		
		return null;
	}// The end of method
	
	/* 4. 자산관리시스템 접근 */
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
	
}// The end of class
