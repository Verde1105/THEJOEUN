package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bank.DAO.ImplementMember;
import Bank.DTO.User;

/**
 * Servlet implementation class BankController
 */
@WebServlet("/THEJOEUN/JSPBank2023_04_20/BankController")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //유저의 계좌번호를 찾아 부르는 컨트롤러
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ImplementMember mamberDao = new ImplementMember();
		PrintWriter script = response.getWriter();
		String BANKin = request.getParameter("BANKin.jsp");
		User user = mamberDao.selectUserAccountNum(request.getParameter("accountNum"));
		request.setAttribute("user", user);
		
		if (user.getAccountNum().equals(BANKin)) {
			RequestDispatcher BaccountNum = request.getRequestDispatcher("BankAccount.jsp");
			BaccountNum.forward(request, response);
		}else {
			script.println("alert('계좌번호를 찾을 수 없습니다.')");
		}
	}

}
