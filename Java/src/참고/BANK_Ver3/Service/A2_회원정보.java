package 참고.BANK_Ver3.Service;

import java.util.ArrayList;
import java.util.List;

import 참고.BANK_Ver3.Dao.ImplementMember;
import 참고.Dao.User;

public class A2_회원정보 {
	public static void 회원정보() {
		
		ImplementMember db = new ImplementMember();
		List<User> userList = db.selectAll();
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).toString());;
		}// The end of for (data select *)
	}
}
