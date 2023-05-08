package thejoeun.Iter2023_04_18;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoUpdateFtomAction implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		try {
			UserInfoDao0418 userInfoDao0418 = new UserInfoDao0418();
			UserInfo userInfo = userInfoDao0418.selectOne(request.getParameter("id"));
			request.setAttribute("userinfo", userInfo);
			RequestDispatcher rd = request.getRequestDispatcher("userInfoView.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
