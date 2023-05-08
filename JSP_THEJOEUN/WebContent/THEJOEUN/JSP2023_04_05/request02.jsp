<%@ page contentType="text/html; charset=UTF-8"
%>
<html>
<head>
<title>Insert title here</title>
</head>
<%-- 폼태그는 자바의 오브젝트같아. 리스트메소드 + 오브젝트가 합쳐진거. 인풋(쿼리), 셀렉트(쿼리), 텍스트에리어(ui) 등의 다양한 입력양식이 가능. --%>
<%-- 챕터6 --%>
<%-- 폼 액션="주소" 는 해당 주소 호출해달라고도 가능.--%>
<%-- 포스트의 기능은 = 안심번호--%>
<%-- 인풋타입 텍스트 기능은 = 입력창--%>
<%-- 인풋타입 패스워드 기능은 = 비밀번호 검은 땡땡이(정규식 주민번호 가리기처럼)--%>
<%--서브밋을 넣기만 하면 버튼생성 + 이벤트까지 들어가있어서, 입력이 가능해짐. --%>

<body>
	<form action="request02_process.jsp" method="post">
		취미 : <br>
		독서 : <input type="checkbox" name="hobby" value="독서">
		운동 : <input type="checkbox" name="hobby" value="운동">
		영화 : <input type="checkbox" name="hobby" value="영화">
		<p> <input type="submit" value="전송"/>
	</form>
</body>
</html>