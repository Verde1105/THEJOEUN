package ch04.com.dto;

import study.DTO.User;

public interface Java2023_04_17Member {
	//회원가입
		public Boolean insertData(String id, String password, String name, String phone, String ADDRESS, String email);

	//로그인(세션만들어 달리기 시작)
	
	//로그아웃(만들어진 세션 지우기)

	//회원정보수정문(업데이트)
		public Boolean updateUser(User user);

	//회원 탈퇴문(딜리트)
		public Boolean deleteData(String id);

	//회원리스트출력(관리자)
		public Object selectAll();
		
	
}
