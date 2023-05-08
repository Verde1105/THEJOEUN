package thejoeun.Servlet2023_04_17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch04.com.dto.UserInfoDaolmpl;
import thejoeun.Servlet2023_04_13.UserInfo;

/**
 * Servlet implementation class UpDateForm
 */
@WebServlet("/UpDateForm")
public class UpDateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpDateForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		try {
			UserInfoDaolmpl userinfoDAO = new UserInfoDaolmpl();
//			UserInfo userinfo = userinfoDAO.selectOne(request.getParameter("id"));
			UserInfo userInfo = userinfoDAO.selectone(request.getParameter("id"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
