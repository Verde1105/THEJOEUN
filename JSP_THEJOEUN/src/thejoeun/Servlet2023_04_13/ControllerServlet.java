package thejoeun.Servlet2023_04_13;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{
	response.setContentType("text/html; charset=utf-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	LoginBean bean = new LoginBean();
	bean.setId(id);
	bean.setPassword(password);
	request.setAttribute("bean", bean);
	boolean status = bean.vaildate();
	if(status) {
		RequestDispatcher rd = request.getRequestDispatcher("MVC.jsp");
		rd.forward(request, response);
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("MVCError.jsp");
		rd.forward(request, response);
		
	}
	
	}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
			doPost(req, resp);
		}
	
}
