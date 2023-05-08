<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>1
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		var regExpPasswd = /^[0-9]*$/;
		var regExpName = /^[가-힣]*$/;
		var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
		//var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
		
		var form = document.member;

		var id = form.id.value;
		var passwd = form.pw.value;
		var name = form.name.value;
		var phone = form.phone1.value + "-" + form.phone2.value + "-" + form.phone3.value;

		
		if (!regExpId.test(id)) {
			alert("아이디는 문자로 시작해 주세요!");
			form.id.select();
			return;
		}
		if (!regExpPasswd.test(passwd)) {
			alert("비밀번호는 숫자만으로 입력해 주세요!");
			return;
		}
		if (!regExpName.test(name)) {
			alert("이름은 한글만으로 입력해 주세요!");
			return;
		}
		if (!regExpPhone.test(phone)) {
			alert("연락처 입력을 확인해 주세요!");
			return;
		}
		
		form.submit();
	}
</script>
</head>
<body>
<!-- 중복입력 추가하기 -->
<!-- 회원가입 수정하기 -->

	<form action="strt02_process.jsp" method="post" name="member">
		<p> 아 이 디 : <input type="text" name="id"></p>
		<p> 비밀번호 : <input type="password" name="pw"></p>
		<p> 이    름 : <input type="text" name="name"></p>
		<p> 전화번호 : <select name="phone1">
						<option value="010">010</option>
						<option value="011">011</option>
						</select>
			-<input type="text" maxlength="4" size="4" name="phone2">
			-<input type="text" maxlength="4" size="4" name="phone3">
		</p>
		<p> 성별 : <input type="radio" name="sex" value="M">남성
				   <input type="radio" name="sex" value="F">여성
		</p>
		<p> 
			취미 : 독서 <input type="checkbox" name="hooby" value="독서">
				   운동 <input type="checkbox" name="hobby" value="운동">
				   영화 <input type="checkbox" name="hobby" value="영화">
		</p>
		<p><input type="button" value="전송" onclick="check()"></p>
	</form>
</body>
</html>