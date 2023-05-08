package study.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.DAO.ImplementMember;
import study.DTO.User;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/STUDY/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/* 서블릿의 역할 */
		// 1. jsp에서 데이터를 받는다.
		String id      = request.getParameter("j_username");
		String pw      = request.getParameter("j_password");
		
		// 2. 입력이 잘 되는지 확인
		System.out.println("ID : "+id);
		System.out.println("PW : "+pw);
		
		// 3. DTO에 데이터를 넣어준다.
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		
		// 4. DAO를 통해 데이터베이스에 입력받은 데이터를 저장
		ImplementMember member = new ImplementMember();
		// 로그인 DAO
		//		member.
		
//		doGet(request, response);
	}

}
