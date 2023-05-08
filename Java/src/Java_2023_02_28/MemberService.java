package Java_2023_02_28;

public class MemberService {
	public Member member; // 객체 생성
	public MemberService() {
		// 회원가입
		member = new Member("허윤서", "abc", "123");
	}

	public boolean login(String id, String pw) {
		boolean result = false;							// 돌아가게끔 해야해서!! return false값 받아서 다시 id와 pw 치게 해야하니까!!!!!!
//		if(member.getId() == id && member.getPw() == pw) {						//입력한 id와 저장된 id를 비교한다, && 를 넣어서 아이디 확인되면
		if(member.getId().equals(id) == id && member.getPw().equals(pw)) 			// 얘도 가능																		  패스워드도 함께 확인하게 해줘! 																												
			System.out.println(member.getName() + "님 로그인 성공!");
			result = true;
//		}
		return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}