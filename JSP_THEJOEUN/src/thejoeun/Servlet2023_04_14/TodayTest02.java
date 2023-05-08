package thejoeun.Servlet2023_04_14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayTest02
 */
@WebServlet("/TodayTest02")
public class TodayTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayTest02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    Connection conn;
    @Override
    public void init() throws ServletException{
    super.init();
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/JSPBookDB";
    try {
    	Class.forName(driver);
    	conn = DriverManager.getConnection(url,"root","java");
    } catch (Exception e) {
    	// TODO: handle exception
    	e.printStackTrace();
    }
}
    @Override
	public void destroy() {
		try {
			if (conn != null) {
				conn.close();	
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				response.setCharacterEncoding("utf-8");
				RequestDispatcher rd = request.getRequestDispatcher("HeadersServle01");
				RequestDispatcher rd2 = request.getRequestDispatcher("FooterServlet01");
				rd.include(request, response);
				PrintWriter out = response.getWriter();
				out.println ("<html>");
				out.println ("<body>");
				out.println ("<table border = '1'>");
				out.println ("<tr><h5>회원정보</h5></tr>");
				Statement stmt = null;
				ResultSet rs = null;
				ResultSetMetaData rsmd = null;
				try {
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT * FROM member WHERE id = ? VALUES(?, ?, ?)");
					rsmd = rs.getMetaData();
					
					out.println("</table>");
					out.println("</body>");
					out.println("</html>");
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if (rs != null) {
							rs.close();
						}
						if (stmt != null) {
							stmt.close();
						}
					} catch (SQLException e2) {
						e2.printStackTrace();
					}
				}
				rd2.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
