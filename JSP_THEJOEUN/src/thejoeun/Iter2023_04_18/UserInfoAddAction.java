package thejoeun.Iter2023_04_18;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch04.com.dto.UserInfoDaolmpl;
import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoAddAction implements Action{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		try {
			UserInfoDao0418 userInfoDao0418 = new UserInfoDao0418();
			userInfoDao0418.insert(new UserInfo()
					.setId(request.getParameter("id"))
					.setPw(request.getParameter("pw"))
					.setName(request.getParameter("name")));
			response.sendRedirect("ControllerServlet?command=list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
