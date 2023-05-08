package TreeBank.Service;

//import java.util.ArrayList;
import java.util.List;

import TreeBank.Dao.ImplementMember;
import TreeBank.Dto.User;
public class A2_회원정보 {
	public static void 회원정보() {
		
		ImplementMember db = new ImplementMember();
		List<User> userList = db.selectAll();
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).toString());;
		}// The end of for (data select *)
	}
}
