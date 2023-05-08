<%@ page import="thejoeun.Servlet2023_04_13.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<P>로그인 성공했습니다.</P>
	<p>
		<%
			LoginBean bean = (LoginBean) request.getAttribute("bean");
			out.print("아이디 : " + bean.getId());
		%>
	</p>
</body>
</html>