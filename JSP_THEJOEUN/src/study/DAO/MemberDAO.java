package study.DAO;

import study.DTO.User;
import thejoeun.Servlet2023_04_19.Member;

//<<로그인 페이지 설계도>>
public interface MemberDAO {
//데이터테이블만들기
	public Boolean createTable();

//데이터테이블삭제
	public Boolean Delete();

//회원가입
	public Boolean insertData(String id, String password, String name, String phone, String ADDRESS, String email);
	
//회원정보수정문(업데이트)
	public Boolean updateUser(User user);
	
//회원 탈퇴문(딜리트)
	public Boolean deleteData(String id);

//로그인(세션만들기)
	
//로그아웃(세션지우기)
	
//아이디 중복체크
	public Boolean selectID(String id);

//회원리스트출력(관리자)
	public Object selectAll();
	
}
