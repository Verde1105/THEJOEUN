package thejoeun.Servlet2023_04_19;

public class MemberListService {
	private MemberDAO memberDAO;
	private MemberPrimter printer;
	public MemberListService(MemberDAO memberDAO, MemberPrimter printer() {
		this.memberDAO = memberDAO;
		this.printer = printer;
	}
}
