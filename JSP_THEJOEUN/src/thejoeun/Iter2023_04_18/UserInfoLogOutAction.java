package thejoeun.Iter2023_04_18;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInfoLogOutAction implements Action {
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("UserInfoLogin.jsp");
	//프론트 컨트롤러 디자인 패턴 적용페이지 컨트롤러에 대한 분류, 개선
	}
}
