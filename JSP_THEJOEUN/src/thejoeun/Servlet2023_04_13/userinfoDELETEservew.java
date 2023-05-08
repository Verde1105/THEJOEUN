package thejoeun.Servlet2023_04_13;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class userinfoDELETEservlet
 */
@WebServlet("/userinfoDELETEservlet")
public class userinfoDELETEservew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userinfoDELETEservew() {
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
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn=DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, pw, name from member" +"where id = '" + request.getParameter("id") + "'");
			if (rs.next()) {
				UserInfo userinfo = new UserInfo();
				userinfo.setId(rs.getString("id"));
				userinfo.setPw(rs.getString("pw"));
				userinfo.setName(rs.getString("name"));
				request.setAttribute("userinfo", userinfo);
			}
			RequestDispatcher rd = request.getRequestDispatcher("userinfoupdateservlet.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		doGet(request, response);
		}
	}
