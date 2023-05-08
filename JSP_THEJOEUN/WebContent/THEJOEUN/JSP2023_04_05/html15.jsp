<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%--legend = 테두리만들기 (필드셋) --%>
<%--maxlength = 글자수지정이 있다는건 반대로 최소지정도 가능하다는 말이네? --%>
<%--reset = submit 처럼 누르기만 하면 지워주는 버튼이 생김. 말고도 일반 버튼도 만들수 있으며 해당 버튼에 기능 부여도 가능. --%>
<%--<input type="image" src="img/web.jpg" alt="검색"/> 예를들어 이곳에 src주소를 제대로 넣어주면 돋보기모양을 만들수도 있다. --%>
<body>
	<h1>input 요소</h1>
		<form action="#">
			<fieldset>
				<legend>회원가입</legend>
				<p> 아이디 : <input type="text" size="12" maxlength="8"></p>
				<p> 비밀번호 : <input type="password" size="12" maxlength="8"></p>
				<p>메일 수신 여부 : 
					<input type="radio" value="y" name="receive"/>예
					<input type="radio" value="n" name="receive"/>아니오
				</p>
				<p>관심 분야 : 
					<input type="checkbox" value="html" name="chk1"/>html
					<input type="checkbox" value="css" name="chk2"/>css
					<input type="checkbox" value="javascript" name="chk3"/>javascript
				</p>
				<p>
				<input type="submit" value="전송"/>
				<input type="reset" value="취소"/>
				<input type="button" value="확인"/>
				<input type="image" src="G:\Github\Atelier.크툴루 도둑.png" alt="검색"/>
				</p>
				<p>파일올리기 : <input type="file"/></p>
				<p><input type="hidden"/></p>
			</fieldset>
		</form>
</body>
</html>