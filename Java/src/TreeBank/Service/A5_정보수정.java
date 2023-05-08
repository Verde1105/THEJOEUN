package TreeBank.Service;

import java.util.Scanner;

import TreeBank.Dao.ImplementMember;
import TreeBank.Dto.User;
public class A5_정보수정 {
	public static void 회원정보수정시스템(User session) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		ImplementMember change = new ImplementMember();
		User loginUser = change.selectUserID(session.getId());
		
		int remote = scanner.nextInt();
		
		switch (remote) {
		case 1://아이디 수정
			System.out.println("고객님의 아이디를 수정합니다");
			System.out.println("수정하실 아이디를 입력해주세요");
			System.out.print(">>");
			String 수정할아이디 = scanner.next();
			loginUser.setId(수정할아이디);
			change.updateUser(loginUser);
			break;
			
		case 2://비밀번호 수정
			System.out.println("고객님의 비밀번호를 수정합니다");
			System.out.println("수정하실 비밀번호를 입력해주세요");
			System.out.print(">>");
			String 수정할비밀번호 = scanner.next();
			loginUser.setPw(수정할비밀번호);
			change.updateUser(loginUser);
			break;
			
			/*
			case 3://아이디나 비번찾기 = 너무 복잡해질것같아, 동결
			System.out.println("고객님의 아이디를 찾습니다");
			System.out.println("계좌번호를 입력해주세요");
			System.out.print(">>");
			String 계좌번호 = scanner.next();
//			loginUser.
			change.updateUser(loginUser);
			break;
			*/
		case 3://회원탈퇴
			System.out.println(loginUser.getId()+"님,");
			System.out.println("회원탈퇴를 진행합니다.");
			System.out.println("탈퇴하실 아이디와 비밀번호, 계좌번호를 입력해주시길 바랍니다.");
			System.out.println("아이디를 입력해주세요.");
			System.out.print(">>");
			String 지워질id = scanner.next();
			String 지워질pw = scanner.next();
			String 지워질계좌 = scanner.next();
			change.deleteData();
			change.deleteData();
			change.deleteData();
			/*
			loginUser.setId(null);
			loginUser.setPw(null);
			loginUser.setAccountNum(null);
			change.updateUser(loginUser);
			 */
			break;
		}
		
		
	}
}
