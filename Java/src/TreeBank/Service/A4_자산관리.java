package TreeBank.Service;

import java.util.List;
//import java.util.List;
import java.util.Scanner;

import TreeBank.Dao.ImplementMember;
import TreeBank.Dao.ImplementTransaction;
import TreeBank.Dto.User;
public class A4_자산관리 {
public static void 자산관리시스템(User session) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		// 세션에 등록된 로그인계정 정보를 통해 balance를 불러온다
		ImplementMember member = new ImplementMember();
		ImplementTransaction transaction = new ImplementTransaction();
		User loginUser = member.selectUserID(session.getId());
		User 거래내역 = member.selectUserAccountNum(session.getAccountNum());
		
		int 잔고 = 0;
		//1.2.3 제작
		do {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 계좌이체 | 5. 거래내역 | 0. 로그아웃");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("선택>");
			int menuNum = scanner.nextInt();
			
			switch (menuNum) {
			case 1://연산 후 대입연산
				System.out.println("예금액>");
				int 예금금액 = scanner.nextInt();
				잔고 = Integer.parseInt(loginUser.getBalance());
				loginUser.setBalance(String.valueOf((int)(예금금액 + 잔고))); 
				거래내역.setBalance(String.valueOf((int)(예금금액 + 잔고))); 
				거래내역.setDeposit(예금금액);
				거래내역.setAccount("");
//				loginUser.setId("win");
				member.updateUser(loginUser);
				transaction.insertData(거래내역);
				break;
			case 2:
				System.out.println("출금액>");
				잔고 = Integer.parseInt(loginUser.getBalance());
				int 출금액 = scanner.nextInt();
				if (잔고 < 출금액) {
					System.out.println("통장에 금액이 충분하지 않습니다.");
				}else {
					loginUser.setBalance(String.valueOf((int)(잔고 - 출금액))); 
					거래내역.setBalance(String.valueOf((int)(잔고 - 출금액))); 
					거래내역.setWithdraw(출금액);
					거래내역.setDeposit(0);			// 입금초기화
					거래내역.setAccount("");
				}
				member.updateUser(loginUser);
				transaction.insertData(거래내역);
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
				거래내역.setAccount(계좌번호);
				거래내역.setWithdraw(입금금액);	//출금
				거래내역.setDeposit(0);			// 입금초기화
				
				if (잔고 > 입금금액) {
					loginUser.setBalance(String.valueOf((int)(잔고 - 입금금액)));
					거래내역.setBalance(String.valueOf((int)(잔고 - 입금금액)));
					member.updateUser(loginUser);
					transaction.insertData(거래내역);
				}else {
					System.out.println("입금금액이 잔액보다 많습니다.");
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
					//거래내역입력
					User 입금받는자 = transaction.selectUserAccountNum(계좌번호);
					입금받는자.setAccount(loginUser.getId()+"님 입금");
					입금받는자.setDeposit(입금금액);
					입금받는자.setBalance(String.valueOf(입금대상자잔고));
					transaction.insertData(입금받는자);
				}
				System.out.println("balance : "+loginUser.getBalance());//누구를 위한 벨런스인가를 고민해봤길 바람.
				break;
			case 5:
				System.out.println("거래내역");
				List<User> list = transaction.selectListAll(loginUser.getAccountNum());
				for (int i = 0; i < list.size(); i++) {
					System.out.println("||======================================");
					System.out.println("||계좌번호 : "+list.get(i).getAccountNum());
					System.out.println("||입금금액 : "+list.get(i).getDeposit());
					System.out.println("||출금금액 : "+list.get(i).getWithdraw());
					System.out.println("||받는계좌 : "+list.get(i).getAccount());
					System.out.println("||계좌잔액 : "+list.get(i).getBalance());
					System.out.println("||--------------------------------------");
					System.out.println("||거래일자 : "+list.get(i).getJoinDate());
					System.out.println("||======================================");
				}
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
