<%@page import="ch04.com.dto.Gugudan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>연습문제</h1>
	<h2>시간들어가야함</h2>
	<jsp:useBean id="gugudan" class = "ch04.com.dto.Gugudan"/>
	<table border="1">
	<%
		for(int j = 1; j<= 9; j++) {
			for(int i = 2; i<= 9; i++) {
				out.println("<td>"+i + "x" + j + "="+ (i*j)+"</td>");
			}
			out.println("<tr>");
		}
	%>
	</table>
	<hr>
	<table border="1">
		<tr>
		<%for(int i = 2; i<= 9; i++) { %>
		<th style="text-align: center"><b><%= i %>단</b></th>
		<%} %>
		</tr>
		
		<%for(int j = 1; j<= 9; j++) {%>
		<tr>
			<%for(int i = 2; i<= 9; i++) { %>
			<td><%= i %> X <%= j %> = <%= gugudan.gugu(i, j) %></td>
			<%}%>
		</tr>
		<%}%>
		
	</table>
</body>
</html>