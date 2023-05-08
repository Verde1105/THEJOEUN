<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="Bean2" class=ch04.com.dto.Bean2 scope="request"></jsp:useBean>
	
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