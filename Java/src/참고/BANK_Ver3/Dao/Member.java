package 참고.BANK_Ver3.Dao;

import 참고.Dao.User;

public interface Member {
	// Table 생성
	public Boolean createTable();
	// 회원가입
	public Boolean insertData(User user);
	// 회원리스트
	public Object selectAll();
	// 회원 조회 ID
	public User selectUserID(String id);
	// 회원 조회 bankNum
	public User selectUserAccountNum(String accountNum);
	// 회원탈퇴
	public Boolean deleteData();
	// 회원정보 수정
	public Boolean updateUser(User user);
	// 계좌이체
	public Boolean updateAccount();
}
