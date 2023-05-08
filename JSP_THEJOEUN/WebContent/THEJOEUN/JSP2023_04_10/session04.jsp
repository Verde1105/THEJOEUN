<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	<h4>----- 세션을 삭제하기 전 -----</h4>
	<% 
		String user_id = (String) session.getAttribute("userid");
		String user_pw = (String) session.getAttribute("userpw");
		out.println("설정된 세션 이름 userid : " + user_id+"<br>" );
		out.println("설정된 세션 값 userpw : " + user_pw);
		session.removeAttribute("userid");
	%>
	<p><h4>----- 세션을 삭제한 후 -----</h4>
	<%
		user_id = (String) session.getAttribute("userid");
		user_pw = (String) session.getAttribute("userpw");
		out.println("설정된 세션 이름 userid : " + user_id+"<br>" );
		out.println("설정된 세션 값 userpw : " + user_pw);
	%>
</body>
</html>