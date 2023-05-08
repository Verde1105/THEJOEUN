package thejoeun.Iter2023_04_18;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thejoeun.Servlet2023_04_13.UserInfo;

public class UserInfoListA implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			List<UserInfo> userinfos = new UserInfoDao0418().selectList();
			request.setAttribute("userinfos", userinfos);
			request.getRequestDispatcher("selsct02.jsp").include(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
