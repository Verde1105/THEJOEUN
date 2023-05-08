<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkMember() {
		//바디에서 입력받은거 불러옴
		var form =  document.loginForm;
		//아이디로 지정.
		for(var i=0; i<form.id.vaule.length; i++) {
			var vid = form.id.value.charAt(i);
			if((vid < 'a' || vid > 'z') && (vid < 'A' || vid>'Z') && (vid>'0' || vid<'9')){
				alert("아이디는 문자로만 가능합니다!");
				form.id.select();
				return;
			}
		}
		
		for(var i=0; i<form.name.vaule.length; i++) {
			var vname = form.id.value.charAt(i);
			if ((vname < '가' || vid > '힝') && (vname < 'ㄱ' || vid>'ㅎ') && (vname < 'ㅏ' || vname > 'ㅣ') && (vname>'0' || vname<'9') && (vname > 'a' || vname < 'z') && (vname > 'A' || vname < 'Z')) {
				alert("이름은 한글만 가능합니다!");
				form.name.select();
				return;
			}
		}
		
		for(var i=0; i<form.pw.vaule.length; i++) {
			var vpw = form.pw.value;
			if ((vpw < '0' || vpw >'9') && (vpw > '가' || vpw < '힝') && (vpw > 'ㄱ' || vpw<'ㅎ') && (vpw > 'ㅏ' || vpw < 'ㅣ') && (vpw > 'a' || vpw < 'z') && (vpw > 'A' || vpw < 'Z')) {
				alert("비밀번호는 숫자만 가능합니다!");
				form.pw.select();
				return;
			}
		}
		
		for(var i=0; i<form.phone1.vaule.length; i++) {
			var vpo1 = form.phone1.value;
			if ((vpo1 == '010' || vpo1 =='011'|| vpo1 =='016'|| vpo1 =='017'|| vpo1 =='019')) {
				alert("선택을 확인");
				form.phone1.select();
				return;
			}
		}
		for(var i=0; i<form.phone2.vaule.length; i++) {
			var vpo2 = form.phone2.value;
			if ((vpo2 < '0' || vpo2 >'9')) {
				alert("중간 번호");
				form.phone2.select();
				return;
			}
		}
		for(var i=0; i<form.phone3.vaule.length; i++) {
			var vpo3 = form.phone3.value;
			if ((vpo3 < '0' || vpo3 >'9')) {
				alert("마지막 번호");
				form.phone3.select();
				return;
			}
		}
		
		for(var i=0; i<form.email.vaule.length; i++) {
			var vid = form.id.value.charAt(i);
			if (!regExpEmail.test(email)) {
				alert("이메일 주소 입력 확인");
				form.email.select();
				return;
			}
		}
		
		if(form!=null) {
			alert("어딘가 출력이 안된거 같은데...");
			return;
		}
	form.submit();
	}
	//아이디는 문자로만
	//이름은 한글만
	//비밀번호는 숫자만
	//연락처 입력을 확인
</script>
</head>
<body>
	보기)
		1. /^[a-Z | A-Z | ㄱ-ㅎ | ㅏ-ㅣ | 가-힣 ]/
		2./^[가-힣]*$/
		3./^[0-9]*$/
		4./^\d{3}-\d{3,4}-\d{4}$/
		5./^[0-9a-z-A-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]
		([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
		회원가입 폼 작성해주세요.
		->LOGIN5_PRODESS ->데이터 처리후 출력
	<h3>회원가입</h3>
	<%--인풋 타입에 이메일이 따로 존재.--%>
	<form name="loginForm" action="LOGIN5_process.jsp" method="post">
		<p> 
			아이디 : <input type="text" name="id">
					 <input type="button" value="아이디 중복 검사">
		</p>
		<p> 
			비밀번호 : <input type="password" name="pw">
		</p>
		<p> 
			이름 : <input type="text" name="name">
		</p>
		<p> 
			연락처 : <select name="phone1">
						<option value="02">02</option>
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="019">019</option>
					 </select>
					-
					<input type="text" maxlength="4" size="4" name="phone2"> 
					-
					<input type="text" maxlength="4" size="4" name="phone3">
		</p>
		<p>
			성별 :  <input type="radio" name="sex" value="남성" checked>남성 
					<input type="radio" name="sex" value="여성" >여성 
		</p>
		<p>
			취미 : 독서 <input type="checkbox" name="hobby1" checked> 
				   운동 <input type="checkbox" name="hobby2" > 
				   영화 <input type="checkbox" name="hobby3" > 
		</p>
		<p> 
			<textarea name="comment" cols="30" rows="3" placeholder="가입인사를 입력해주세요">
			</textarea>
		</p>
		<p> 
			<input type="submit" value="가입하기">
		</p>
		<p> 
			<input type="reset" value="다시쓰기">
		</p>
		<%--위쪽 스크립트로 입력된 정보를 보내버림 --%>
		<p> <input type="button" value="전송" onclick="CheckLogin()">
		</p>
	</form>
</body>
</html>