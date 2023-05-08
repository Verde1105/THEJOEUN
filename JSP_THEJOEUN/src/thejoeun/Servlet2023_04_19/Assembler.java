package thejoeun.Servlet2023_04_19;

public class Assembler {
	private MemberDAO memberDAO;
	private MemberRegisterService reService;
	private ChangPasswordService pwService;
	public Assembler() {
		memberDAO = new MemberDAO();
		reService = new MemberRegisterService(memberDAO);
		pwService = new ChangPasswordService();
		pwService.setMemberDAO(memberDAO);
	}
	public MemberDAO getMemberDAO() {
		return memberDAO;
	}
	public MemberRegisterService getMemberRegisterService() {
		return reService;
	}
	public ChangPasswordService getChangPasswordService() {
		return pwService;
	}
}
