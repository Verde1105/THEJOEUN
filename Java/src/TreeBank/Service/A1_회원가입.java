package TreeBank.Service;
import java.util.Scanner;
import TreeBank.Dao.ImplementMember;
import TreeBank.Dao.ImplementTransaction;
import TreeBank.Dto.User;

public class A1_회원가입 {
	/* 1. 회원가입 기능 */
	public static void 회원가입() throws Exception{
		
		String id = null;
		String password = null;
		User user = new User();
		ImplementMember member = new ImplementMember();
		ImplementTransaction transaction = new ImplementTransaction();
		System.out.println("------------------------------------------------");
		System.out.println("************* === 한글입력 금지 === ************");
		System.out.println("************* === 콘솔 에러발생 === ************");
		System.out.println("------------------------------------------------");
		System.out.print("아이디 입력 : ");
		id = new Scanner(System.in).next();
		System.out.print("비밀번호 입력 : ");
		password = new Scanner(System.in).next();
		
		System.out.println("ID : "+id);
		System.out.println("PW : "+password);
		String 계좌번호 = "";
		
		if ( member.selectUserID(id) == null ) {// 아이디 중복체크 추후 구현
			// System.out.println(i + " index is null");
			
			/* 총 13자리 */
			// 1. 5
			// 2. 3
			// 3. 5
			계좌번호 =  String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 +=String.valueOf((int)(Math.random()*(1000)-(100))+100);		// 100 - 1000 범위의 난수 발생
			계좌번호 += "-";
			계좌번호 += String.valueOf((int)(Math.random()*(100000-10000))+10000);// 100000 ~ 10000 범위의 난수 발생
			
			user.setId(id);					// 아이디
			user.setPw(password);			// 비밀번호
			user.setBalance("0");			// 잔고
			user.setAccountNum(계좌번호);	// 계좌번호
			member.insertData(id, password,계좌번호);
			transaction.insertData(user);
			
		} else {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("************* === 회원가입 실패 === ************");
			System.out.println("************** 중복된 아이디 입니다.************");
			System.out.println("-----------------------------------------------------------------");
			
		}
		
	}// The end of method
}
