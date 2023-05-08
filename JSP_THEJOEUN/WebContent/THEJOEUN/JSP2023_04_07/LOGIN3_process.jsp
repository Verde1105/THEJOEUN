<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력에 성공했습니다.</h3>
	<%-- 스트링 아이디, 패스워드에 요청한다. 소괄호 안에 지정한 데이터값을--%>
	<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	%>
	<%--출력해라. 해당 아이디와 패스워드를 --%>
	<%=id %>
	<%=pw %>
</body>
</html>