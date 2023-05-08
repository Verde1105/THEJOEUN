package 참고.BANK_Ver3.Service;

//import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.a.NativeConstants.IntegerDataType;

import jdk.internal.dynalink.linker.LinkerServices.Implementation;
import 참고.BANK_Ver3.Dao.ImplementMember;
import 참고.Dao.User;

public class A4_자산관리 {
public static void 자산관리시스템(User session) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		// 세션에 등록된 로그인계정 정보를 통해 balance를 불러온다
		ImplementMember member = new ImplementMember();
		User loginUser = member.selectUserID(session.getId());
		
		int 잔고 = 0;
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
				int 예금금액 = scanner.nextInt();
				잔고 = Integer.parseInt(loginUser.getBalance());
				loginUser.setBalance(String.valueOf((int)(예금금액 + 잔고))); 
//				loginUser.setId("win");
				member.updateUser(loginUser);
				break;
			case 2:
				System.out.println("출금액>");
				잔고 = Integer.parseInt(loginUser.getBalance());
				int 출금액 = scanner.nextInt();
				if (잔고 < 출금액) {
					System.out.println("통장에 금액이 충분하지 않습니다.");
				}else {
					loginUser.setBalance(String.valueOf((int)(잔고 - 출금액))); 
				}
				member.updateUser(loginUser);
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println("balance : "+loginUser.getBalance());//누구를 위한 벨런스인가를 고민해봤길 바람.
				break;
			case 4:
				System.out.println("계좌번호 입력>");
				String 계좌번호 = new Scanner(System.in).nextLine();
				System.out.println("입금금액 입력>");
				int 입금금액 = new Scanner(System.in).nextInt();
				잔고 = Integer.parseInt(loginUser.getBalance());
				
				if (잔고 > 입금금액) {
					loginUser.setBalance(String.valueOf((int)(잔고 - 입금금액)));
					member.updateUser(loginUser);
				}else {
					System.out.println("입금금액이 잔고보다 많습니다.");
					break;
				}
				
				// 계좌번호로 입금대상자 정보 조회
				User 입금대상자 = member.selectUserAccountNum(계좌번호);
				// 1. 입력한 계좌번호가 맞으면
				if (입금대상자.getAccountNum().equals(계좌번호)) {
					// 2. 계좌번호 주인의 balance에 금액을 더한다.
					int 입금대상자잔고 = (Integer.parseInt(입금대상자.getBalance()) + 입금금액);
					입금대상자.setBalance(String.valueOf(입금대상자잔고));
					member.updateUser(입금대상자);
				}
				System.out.println("balance : "+loginUser.getBalance());//누구를 위한 벨런스인가를 고민해봤길 바람.
				break;
			case 0:
				run = false;
				break;
			default:
				System.out.println("Wrong answer");
			}
			System.out.println();
			// database[Integer.parseInt(session[2])][2] = Integer.toString(balance);
//			database.get(Integer.parseInt(session[2])).setBalance(Integer.toString(balance));
		}while(run);
		System.out.print("프로그램 종료");
		
	}// The end of method
}
