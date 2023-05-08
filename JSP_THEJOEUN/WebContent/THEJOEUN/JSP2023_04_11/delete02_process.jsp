<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "dbconn.jsp"%>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "select id,password from membwr where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(sql);
			if (rs.next()){
				String rid = rs.getString("id");
				String rpw = rs.getString("pw");
				if(id.equals(rid) && password.equals(rpw)){
					sql = "delete from member where id = ? and password = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, id);
					pstmt.setString(2, pw);
					pstmt.executeUpdate();
					out.println("member 테이블을 삭제했습니다.");
				}else{
					out.println("일치하는 비밀번호가 아닙니다.");
				}
			}else
			out.println("member 테이블에 일치하는 아이디가 없습니다.");
		}catch(SQLException ex){
			out.println("SQLException : " + ex.getMessage());
		}finally{
			if(rs !=  null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
	%> 
</body>
</html>