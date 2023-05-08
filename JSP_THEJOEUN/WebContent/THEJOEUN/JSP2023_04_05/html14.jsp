<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--select option 하면, 생년월일창처럼 여러개 보여줌 --%>
<%--multiple : 한번에 여러개(영수증마냥) 보여주는 애 --%>
<h3>*리스트와 리스트 박스 연습하기*</h3>
		<form action="#">
			좋아하는 색깔 <br>
			<select name="color" size = "1">
				<option value="빨간색" >빨간색
				<option value="초록색" >초록색
				<option value="보라색" >보라색
			</select><p>
			좋아하는 과일<br>
			<select name="fruit" size = "3" multiple>
				<option value="사과" >사과
				<option value="오랜지" >오랜지
				<option value="바나나" >바나나
			</select><p>
		<input type=submit value="내용 확인" ><br>
	</form>
</body>
</html>