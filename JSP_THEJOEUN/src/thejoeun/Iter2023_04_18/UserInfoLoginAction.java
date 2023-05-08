package thejoeun.Iter2023_04_18;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoLoginAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HttpSession session = request.getSession();
		try {
			UserInfo userInfo = new UserInfoDao0418().exist(id, pw);
			session.setAttribute("userinfo", userInfo);
			response.sendRedirect("ControllerServlet?command=list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
