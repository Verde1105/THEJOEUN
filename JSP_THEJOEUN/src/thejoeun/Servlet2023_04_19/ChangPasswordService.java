package thejoeun.Servlet2023_04_19;

public class ChangPasswordService {
	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}	
	public void ChangPassword(String email, String oldPwd, String newPwd) {
		Member member = memberDAO.selectByEmail(email);
		if(member == null)
			throw new MemberMotFoundException();
		member.changePassword(oldPwd, newPwd);
		memberDAO.update(member);
	}
}
