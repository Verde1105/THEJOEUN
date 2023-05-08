package thejoeun.Servlet2023_04_13;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userinfoupdateservlet
 */
@WebServlet("/userinfoupdateservlet")
public class userinfoupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userinfoupdateservlet() {
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
		// TODO Auto-generated method stub
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(
					"delete form +테이블명+ where id='" + request.getParameter("id") + "'' ");
			response.sendRedirect("userinfoupdateservlet");
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}finally {
			try {
				if (stmt != null)stmt.close();
			}catch(Exception e) {}
		}
		doGet(request, response);
	}

}
