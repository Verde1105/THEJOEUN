package thejoeun.Servlet2023_04_19;

import java.time.LocalDateTime;


public class MemberRegisterService {
	
	private MemberDAO memberDAO;
	public void MembetRegisterService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public long regist(RegisterRequest req) {
		Member member = memberDAO.selectByEmail(req.getemail());
		if ( member != null) { 
			throw new DuplicatMemberException("dup email " + req.getemail());
		}
		Member newMember = new Member(
				req.getemail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDAO.insert(newMember);
		return newMember.getId();
	}
}
