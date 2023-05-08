package thejoeun.Iter2023_04_18;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInfoDeleteAction implements Action{
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		try {
			new UserInfoDao0418().delete(request.getParameter("id"));
			response.sendRedirect("ControllerServlet?command=list");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
