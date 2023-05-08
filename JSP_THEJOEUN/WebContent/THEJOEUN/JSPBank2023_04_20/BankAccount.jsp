<%@page import="Bank.DTO.User"%>
<%@ page import="Bank.Controller.BankController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색결과</h1>
	<h1>accountNum</h1>
		<%
		ImplementMember mamberDao = new ImplementMember();
		User User = mamberDao.selectUserAccountNum(request.getParameter("accountNum"));
			out.print("계좌번호 : " + User.getAccountNum());
		%>
</body>
</html>