<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//유효성 검사 하는 법. 빈칸이면 팝업창으로 알림
	function CheckLogin() {
		var form = document.loginForm;
		if (form.id.value == "") {
			alert("아이디를 입력하세요.");
			form.id.focus();
			return false;
		}else if (form.pw.value == "") {
			alert("비밀번호를 입력하세요.");
			form.pw.focus();
			return false;
		}
		form.submit();
	}
</script>
</head>
<body>
	<form name="loginForm" action="LOGIN2_process.jsp" method="post">
		<p> 아이디 : <input type="text" name="id">
		<p> 비밀번호 : <input type="password" name="pw">
		<p> <input type="button" value="전송" onclick="CheckLogin()">
	</form>
</body>
</html>