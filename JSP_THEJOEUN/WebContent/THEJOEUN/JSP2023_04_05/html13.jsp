<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%--radio 는 독립적인애라 멀티가 안됨 --%>
<%--checkbox 는 멀티가 됨. 같은 이름(name)으로 묶으면 같이 찾기가 가능 --%>
<%--checked 를 넣으면 체크박스에 처음부터 표시가 되어있음 --%>
<body>
<h3> *라디오, 체크박스 연습*</h3><hr><br>
	<form action="#">
			<input type="radio" name="color" value="빨간색" checked>빨간색<br>
			<input type="radio" name="color" value="초록색" >초록색<br>
			<input type="radio" name="color" value="보라색" >보라색<br>
		좋아하는 과일<br>
			<input type="checkbox" name="fruit" value="사과" checked>사과<br>
			<input type="checkbox" name="fruit" value="오랜지" >오랜지<br>
			<input type="checkbox" name="fruit" value="바나나" >바나나<br>
			<input type="submit" value="내용 확인" ><br>
	</form>
</body>
</html>