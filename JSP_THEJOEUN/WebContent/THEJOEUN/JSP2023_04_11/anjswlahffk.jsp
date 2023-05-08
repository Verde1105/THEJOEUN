<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<%@ include file="dbconn.jsp"%>
	<table width="300" border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<%
			//DB 가져오는 로직
			ResultSet rs = null;
			Statement stmt = null;
			try {
				String sql = "select*from member"; //member테이블로부터 모든 데이터 추출해오겠음
				stmt = conn.createStatement(); //conn인스턴스 통해 객체 얻어내고
				rs = stmt.executeQuery(sql); //sql문 수행해서 rs 얻음
				while (rs.next()) { //member테이블로부터 저장된 모든 데이터를 출력하기 위한 데이터 가져오기 작업
					String id = rs.getString("id");
					String pw = rs.getString("passwd");
					String name = rs.getString("name");
		%>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
		</tr>
		<%
			}
			} catch (SQLException ex) {
				out.println("Member 테이블 호출이 실패했습니다.<br>");
				out.println("SQLException:" + ex.getMessage());
			} finally {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
		%>
	</table>

</body>
</html>