<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function CheckLogin() {
		var form =  document.loginForm;
		if (form.id.value.length < 4 || form.id.value.length > 12) {
			alert("아이디는 4~12자 이내로 입력 가능합니다!");
			form.id.select();
			return;
		}
		if (form.pw.value.length < 4 ) {
			alert("비밀번호는 4자 이상 입력해야 합니다!");
			form.pw.select();
			return;
		}
		form.submit();
	}
</script>
</head>
<body>
	<form name="loginForm" action="LOGIN3_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="pw">
		<p> <input type="button" value="전송" onclick="CheckLogin()">
	</form>
</body>
</html>