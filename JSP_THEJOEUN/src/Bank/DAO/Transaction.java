package Bank.DAO;
import Bank.DTO.User;

import java.util.List;

public interface Transaction {
		//거래내역시 필요한것들
//	테이블 생성해야하고
	public Boolean create();
//	계좌번호 입력
	public Boolean insertData(User user);
//	입금,출금,총액 데이터베이스 업데이트
	public Boolean updateUser(User user);
//	계좌조회
	public User selectUserAccountNum(String accountNum) ;
	public List<User> selectListAll(String accountNum) ;
}
