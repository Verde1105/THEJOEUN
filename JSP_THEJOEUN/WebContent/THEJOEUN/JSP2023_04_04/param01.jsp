<%@ page contentType="text/html; charset=UTF-8"
%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h3>param 액션 태크</h3>
	<jsp:forward page = "param01_data.jsp">
		<jsp:param name="id" value="admin" />
		<jsp:param name="name" value='<%=java.net.URLEncoder.encode("관리자")%>'/>
	</jsp:forward>
	<p>Java Server Page
</body>
</html>