<%@ page contentType="text/html; charset=UTF-8"
%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h3>param 액션 테그</h3>
	<jsp:include page="param02_data.jsp">
	<jsp:param name="title"
		value = '<%=java.net.URLEncoder.encode("오늘의 날짜와 시각")%>'/>
	<jsp:param name="date"
		value = "<%=java.util.Calendar.getInstance().getTime()%>"/>
	</jsp:include>
</body>
</html>