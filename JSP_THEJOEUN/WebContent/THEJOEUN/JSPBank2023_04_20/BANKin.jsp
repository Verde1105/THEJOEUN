<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/계좌만들고,입력받을곳(인서트돌아가야함)" method="post">
		<p> =회원가입= </p>
		<p> 아이디 : <input type="text" name="id"></p>
		<p> 패스워드 : <input type="text" name="password"></p>
		<p> <input type="submit" name="가입하기"></p>
	</form>
	
	<form action="/BankController" method="post">
	<p>=계좌유무= </p>
		<p> 계좌번호를 입력해주세요 : <input type="text" name="accountNum"></p>
		<p> <input type="submit" name="찾기"></p>
	</form>
	
	<form action="/리스트뽑기니까 셀렉트있어야함. 이름은 대강 유저리스트?"  method="post">
		<p>=회원관리=</p>
		<p> 계좌번호를 입력해주세요 : <input type="text" name="userList"></p>
		<p> <input type="submit" name="출력"></p>
	</form>
	
	<form action="/은행으로 연결. asset"  method="post">
		<p>=자산관리=</p>
		<p> 계좌번호를 입력해주세요 : <input type="text" name="asset"></p>
		<p> <input type="submit" name="H2R은행 연결"></p>
	</form>
</body>
</html>