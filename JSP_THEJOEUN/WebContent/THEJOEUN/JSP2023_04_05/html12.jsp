<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#">
		<table border="1">
			<tr>
				<th align="center">이름</th>
				<td align="center">
					<input type="text" name="myname" size="50">
				</td>
			</tr>
			<tr>
				<th align="center">E - mail </th>
				<td align="center">
					<input type="text" name="email" size="50">
				</td>
			</tr>
			<tr>
				<th align="center">자기소개 </th>
				<td align="center">
					<textarea name="content" rows="14" cols="50"></textarea><%-- 여러문장을 입력할수 있는 녀석 --%>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="이름 확인">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>