<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>제대로 된 입력 값 입니다.</h3>
	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone1  = request.getParameter("phone1");
		String phone2  = request.getParameter("phone2");
		String phone3  = request.getParameter("phone3");
		String email  = request.getParameter("email");
		String sex     = request.getParameter("sex");
		String hobby1  = request.getParameter("hobby1");
		String hobby2  = request.getParameter("hobby2");
		String hobby3  = request.getParameter("hobby3");
		String comment = request.getParameter("comment");
		/*
		if(id == null) {
			out.println("야 너 이거 맞음?");
		}else if(v.equals("+")){
			out.println(ii+v+jj+"="+(ii+jj));
		}else if(v.equals("-")){
			out.println(ii+v+jj+"="+(ii-jj));
		}else if(v.equals("/")){
			out.println(ii+v+jj+"="+(ii/jj));
		}else if(v.equals("*")){
			out.println(ii+v+jj+"="+(ii*jj));
		}
		*/
	%>
	<p> 
		아이디 : <%=id %>
	</p>
	<p> 
		비밀번호 : <%=pw %>
	</p>
	<p> 
		이름 : <%=name %>
	</p>
	<p> 
		전화번호 : <%=phone1 %> - <%=phone2 %> - <%=phone3 %>
	</p>
	<p> 
		이메일 : <%=email %>
	</p>
	<p>
		성별     : <%=sex %>
	</p>
	<p>
		취미     : <%=hobby1 %> <%=hobby2 %> <%=hobby3 %>
	</p>
	<p>
		가입인사 : <%=comment %>
	</p>
</body>
</html>