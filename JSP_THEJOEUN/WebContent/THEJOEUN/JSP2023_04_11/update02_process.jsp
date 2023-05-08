<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="dbconn.jsp" %>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try{
			String sql = "select id, password from member where id=?";/*팢아라 맴버테이블의 패스워드 아이디 칼럼에서 해당 아이디를*/
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				String rid = rs.getString("id");/*적어넣기*/
				String rpw = rs.getString("password");
				if(id.equals(rid) && pw.equals(pw)){
					sql = "update member set name=? where id = ?";/*해당 아이디 어디선가 찾으면, 이름을 갈아엎어라*/
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.executeUpdate();
					out.println("member 테이블의 이름을 수정했습니다.");
				}else{
					out.println("일치하는 비밀번호가 아닙니다.");
			}
		}else {
			out.println("일치하는 아이디가 없습니다.");
		}
		}catch(SQLException e){
			out.println("SQLException : " + e.getMessage());
		}finally{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	%>
</body>
</html>