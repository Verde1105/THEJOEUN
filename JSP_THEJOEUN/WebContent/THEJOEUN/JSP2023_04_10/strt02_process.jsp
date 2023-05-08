<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="startDbconn2.jsp" %>
	<%
		String i = request.getParameter("id");
		String passwd = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String sex     = request.getParameter("sex");
		String hobby1  = request.getParameter("hobby");
		String hobby2  = request.getParameter("hobby");
		String hobby3  = request.getParameter("hobby");
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into member(id,password,name,p,sex,hobby1,hobby2,hobby3) values(?,?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, i);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, sex);
			pstmt.setString(6, hobby1);
			pstmt.setString(7, hobby2);
			pstmt.setString(8, hobby3);
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