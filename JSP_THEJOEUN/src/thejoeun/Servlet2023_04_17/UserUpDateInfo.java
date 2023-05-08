package thejoeun.Servlet2023_04_17;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import thejoeun.Servlet2023_04_13.DBConnection;
import thejoeun.Servlet2023_04_13.UserInfo;

/**
 * Servlet implementation class UserUpDateInfo
 */
@WebServlet("/UserUpDateInfo")
public class UserUpDateInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpDateInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public int update(UserInfo userinfo) throws Exception{
    	Connection conn = DBConnection.getConnection();
    	PreparedStatement pstmt = null;
    	try {
    		pstmt = conn.prepareStatement("update userinfo set pw=?, name=?, ehere id = ?");
    		return pstmt.executeUpdate(); 
		} catch (Exception e) {
			throw e;
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
    }
    
    public int delete(String id) throws Exception{
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate("delete from userinfo where id ='"+id+"'");
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UserUpDateInfo userInfoDAO = new UserUpDateInfo();
			userInfoDAO.delete(request.getParameter("id"));
			response.sendRedirect("UserInfoLoginServlet");//???뭔가 치는 사이에 달라졌어 뭐여
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
