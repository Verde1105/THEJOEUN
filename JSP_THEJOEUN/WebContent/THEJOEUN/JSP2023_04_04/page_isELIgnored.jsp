<%@ page contentType="text/html; charset=UTF-8"
%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setAttribute("RequestAttribute","request 내장 객체");
	%>
	${requestScope.RequestAttribute}
</body>
</html>