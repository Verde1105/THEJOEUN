<%@page import="java.sql.*"%>
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
		String i = request.getParameter("id");
		String passwd = request.getParameter("pw");
		String name = request.getParameter("name");
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into member(id,password,name) values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, i);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.executeUpdate();
			out.println("member 테이블 삽입이 성공했습니다.");
		}catch(SQLException ex){
			out.println("member 테이블 삽입에 실패했습니다.<br>");
			out.println("SQLException: " + ex.getMessage());
		}finally {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}
	%>
</body>
</html>