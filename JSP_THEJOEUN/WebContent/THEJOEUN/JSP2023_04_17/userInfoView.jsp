<%@page import="thejoeun.Servlet2023_04_13.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="thejoeun.Iter2023_04_18.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>user</h1>
	<% UserInfo userInfo = (UserInfo)request.getAttribute("userinfo"); %>
	<h1> ID : <%=userInfo.getId() %></h1>
	<h1> PW : <%=userInfo.getPw() %></h1>
	<h1> NAME : <%=userInfo.getName() %></h1>
</body>
</html>