<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function CheckForm() {
		alert("아이디 : " + document.loginForm.id.value + "\n" + 
		"비밀번호 : " + document.loginForm.pw.value);
	}
</script>
</head>
<body>
	<form name="loginForm">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="pw">
		<p> <input type="submit" value="전송" onclick="CheckForm()">
	</form>
</body>
</html>