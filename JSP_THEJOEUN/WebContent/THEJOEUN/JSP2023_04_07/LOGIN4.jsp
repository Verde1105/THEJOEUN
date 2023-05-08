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
		for(var i=0; i<form.id.vaule.length; i++) {
			var ch = form.id.value.charAt(i);
			if ((ch > 'a' || ch<'z') && (ch < 'A' || ch>'Z') && (ch>'0' || ch<'9')) {
				alert("아이디는 영문 소문자로만 입력 가능합니다.");
				form.id.select();
				return;
			}
		}
		if (isNaN(form.pw.value)) {
			alert("비밀번호는 숫자로만 입력 가능합니다.");
			form.pw.select();
			return;
		}
		form.submit();
	}
</script>
</head>
<body>
	<form name="loginForm" action="LOGIN4_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="pw">
		<p> <input type="button" value="전송" onclick="CheckLogin()">
	</form>
</body>
</html>