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
 * Servlet implementation class UserInfoAdd
 */
@WebServlet("/UserInfoAdd")
public class UserInfoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserInfoDaolmpl userInfoDao = new UserInfoDaolmpl();
			
			userInfoDao.insert(new UserInfo()
			.setId(request.getParameter("id"))
			.setPw(request.getParameter("pw"))
			.setName(request.getParameter("name")));
			
			response.sendRedirect("LoginP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
