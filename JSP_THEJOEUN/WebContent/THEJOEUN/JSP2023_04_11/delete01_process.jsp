<%@ page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
	<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	ResultSet rs = null;
	Statement stmt = null;
	try {
		String sql = "select id, password from member where id = '" + id + "'";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		if(rs.next()){
			String rid = rs.getString("id");
			String rpw = rs.getString("password");
			if(id.equals(rid) && pw.equals(rpw)) {
				sql = "delete from member where id = '" + id + "' + and password ='" + pw + "'";
				stmt = conn.createStatement();
						stmt.executeUpdate(sql);
				out.println("member 테이블을 삭제했습니다.");
			}else
				out.println("일치하는 비밀번호가 아닙니다.");
		}else
			out.println("member 테이블에 일치하는 아이디가 없습니다.");
	}catch(SQLException ex){
		out.println("SQLException : " + ex.getMessage());
	}finally{
		if(rs !=  null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	%>
</body>
</html>