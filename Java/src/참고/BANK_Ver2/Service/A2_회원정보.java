package 참고.BANK_Ver2.Service;

import java.util.List;

import 참고.Dao.User;

public class A2_회원정보 {
	public static void 회원정보(List<User> database) {
		// 2. 입력된 데이터 확인
		for (int i = 0; i < database.size(); i++) {
			//	System.out.println(i+", ID : " + database[i][0]+", PW : " + database[i][1]+", BALANCE : " + database[i][2] + " , 계좌번호 : "+database[i][3]+ " , 가입날짜 : "+database[i][4]);
			System.out.println(database.get(i).toString());;
		}// The end of for (data select *)
	}
}
