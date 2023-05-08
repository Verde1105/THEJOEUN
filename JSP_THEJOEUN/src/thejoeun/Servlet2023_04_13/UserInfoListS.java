package thejoeun.Servlet2023_04_13;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UserInfoListS
 */
@WebServlet("/UserInfoListS")
public class UserInfoListS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfoListS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = utf-8");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("select * from vserinfo");
			rs = pstmt.executeQuery();
			List<UserInfo> userInfoListS = new ArrayList<UserInfo>();
			while (rs.next()) {
				UserInfo userinfo = new UserInfo();
				userinfo.setId(rs.getString(1));
				userinfo.setPw(rs.getString(2));
				userinfo.setName(rs.getString(3));
				userInfoListS.add(userinfo);
			}
			request.setAttribute("Userinfos", userInfoListS);
			RequestDispatcher rd = request.getRequestDispatcher("select");
			rd.include(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (Exception e2) {}
		}
		doGet(request, response);
	}

}
