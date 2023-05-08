<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scripting tag</title>
</head>
<!-- html주석 --> 
<%-- jsp 주석 --%>

<body>
	<%
	for(int i = 1; i <= 69; i++) {
		if (i % 7 == 0)
			out.println(i + "<br>");
	}
	
	for(int i = 2; i<= 9; i++) {
		for(int j = 1; j<= 9; j++) {
			out.println(i + "x" + j + "="+ i * j);
		}
		out.print("<br>");
	}
	
	%>
<%-- 연습문제) 구구단 7단 --%>
</body>
</html>