package Home_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import 참고.Dao.User;

public class 일차원배열객체 {
	public static void main(String[] args) {
		/* 1. 입력받을 데이터 */
		//id
		//패스워드
		//스캐너 생성
		//리스트생성
		//+세션넣기+ 사용하지않을때 시간이 흐르도록(30분)
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		User u = new User();
		
		//아이디 비밀번호 스캔 후 입력
		System.out.println("아이디를 입력하시오.");
		String id = scan.nextLine();
		System.out.println("패스워드를 입력하시오.");
		String password = scan.nextLine();
		
		//세터와 스캔 연동
		u.setId(id);
		u.setPw(password);
		u.setBalance("0");
		
		//데이터베이스
		//EX에 ADD로 행 삽입.
		List<ArrayList<User>> ex = new ArrayList<>();
		
		//회원가입 안에 필요한거 클래스로 만들어
//		어레이명.에드();로 삽입
		ArrayList<User> 회원가입 = new ArrayList<>();
		ex.add(회원가입);
		ArrayList<User> 회원정보 = new ArrayList<>();
		ex.add(회원정보);
		ArrayList<User> 로그인   = new ArrayList<>();
		ex.add(로그인);
		ArrayList<User> 자산관리 = new ArrayList<>();
		ex.add(자산관리);
		
		
		
		
	}
}