package thejoeun.Servlet2023_04_17;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch04.com.dto.UserInfoDaolmpl;

/**
 * Servlet implementation class LoginP
 */
@WebServlet("/THEJOEUN/JSP2023_04_17/LoginP")
public class LoginP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserInfo userinfo = null;
		out.println("<html>");
		out.println("<body>");
		try {
			Connection conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("select * from member where id = ? ");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			RequestDispatcher rd = request.getRequestDispatcher("Servlet03");
			RequestDispatcher rd2 = request.getRequestDispatcher("ServletIdFail");
			RequestDispatcher rd3 = request.getRequestDispatcher("ServletPwFail");
			if(rs.next()) {
				if(pw.equals(rs.getString("password"))){
					userinfo = new UserInfo().setId(rs.getString("id"))
											.setPw(rs.getString("password"))
											.setName(rs.getString("name"));
//					out.println("id : " + userinfo.getId() + ", name : " + userinfo.getName());
//					out.println("<br><b> 인증되었습니다. </b>");
					rd.forward(request, response);
					HttpSession session = request.getSession();
					session.setAttribute("id",userinfo.getId() );
				}else {
//					out.println("pw x");
					rd3.forward(request, response);
				}
			}else {
//				out.println("id x");
				rd2.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				/*if(stmt != null) stmt.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}
		try {
			UserlnfoDaolmpl userlnfoDao = new UserlnfoDaolmpl();
			UserlnfoDaolmpl userlnfo = userlnfoDao.exist(request.getParameter("id"), request.getParameter("pw"));
			if (userlnfo != null) {
				HttpSession session = request.getSession();
				session.setAttribute("userlnfo", userlnfoDao);
				response.sendRedirect("UserlnfoDaoListServlet");
			}else {
				response.sendRedirect("UserlnfoLogin.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		try {
		 */
		UserInfoDaolmpl userlnfoDao = new UserInfoDaolmpl();
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
