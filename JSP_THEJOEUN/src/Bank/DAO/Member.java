package Bank.DAO;

import Bank.DTO.User;

// 실행 X, 계획 plan만 적어놓는다.
public interface Member {
	// Table 생성
	public Boolean createTable();
	// 회원가입
	public Boolean insertData(String id, String password, String 계좌번호);
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
	// Test 함수 
	public void test();
}
