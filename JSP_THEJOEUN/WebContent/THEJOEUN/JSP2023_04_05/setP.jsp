<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dto.Bean" scope = "request"></jsp:useBean>
	<jsp:setProperty property="id" name="person" value ="20182005"/>
	<jsp:setProperty property="name" name="person" value ="홍길동"/>
		<p> 아이디 : <%=person.getId() %>
		<p> 이름 : <%=person.getName() %>
</body>
</html>