package Java_2023_02_27.복습;
import java.util.Scanner;

public class Bank_시도 {
//앱스트랩?과 인터페이스가 고비
	public static void main(String[] args) {
		//회원가입 + 계좌개설
		//회원정보(등록잘되었는지 확인)
		//로그인
		//은행내용(1.입금/2.출금/3.이체(계좌간거래)/4.조회/5.종료)
		//마이너스 통장 Y/N 확인
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		String id;
		String password;
		String[][] data = new String[10][10];
		
		//인터페이스만들기
		do {
			System.out.println("===============================");
			System.out.println("은행에 계좌가 있으신가요?");
			System.out.println("===============================");
			System.out.println("YES or NO");
			System.out.print("선택> ");
			System.out.println("E를 누르면 종료합니다.");
			String 개좌선택 = scan.nextString();
			if (scan == "N") {
				System.out.println("===============================");
				System.out.println("회원 가입 이후 이용 가능합니다.");
				System.out.println("가입하시겠습니까?");
				System.out.println("===============================");
				System.out.println("YES or NO");
				System.out.print("선택> ");
				String 개설선택= scan.nextString();
				//Y누를시 회원가입 페이지로.
				//N는 종료가 되거나 돌아가게끔
			}else if (scan == "n") {
				System.out.println("===============================");
				System.out.println("회원 가입 이후 이용 가능합니다.");
				System.out.println("가입하시겠습니까?");
				System.out.println("===============================");
				System.out.println("YES or NO");
				System.out.print("선택> ");
				String 개설선택= scan.nextString();
				//Y누를시 회원가입 페이지로.
				//N는 종료가 되거나 돌아가게끔
			}else if (scan == "y") {
				System.out.println("===============================");
				System.out.println("로그인 페이지로 이동합니다.");
				System.out.println("아이디와 패스워드를 입력해주세요.");
				System.out.println("===============================");
				//Y는 로그인 페이지로 이동
			}else if (scan == "Y") {
				System.out.println("===============================");
				System.out.println("로그인 페이지로 이동합니다.");
				System.out.println("아이디와 패스워드를 입력해주세요.");
				System.out.println("===============================");
				//Y는 로그인 페이지로 이동
			}else if (scan == "E") {
				System.out.println("종료합니다.");
				run = false;
				//끄기
			}else{
				System.out.println("===============================");
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 한번 눌러 주십시오.");
				System.out.println("===============================");
				//잘못된걸 누를 시, 첫 화면으로 돌아간다.
			}
			
		}while(run);
		
		
	}
}
