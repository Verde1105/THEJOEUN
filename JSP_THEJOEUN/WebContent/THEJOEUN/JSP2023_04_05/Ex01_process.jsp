<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String i = request.getParameter("v1");
		String j = request.getParameter("v2");
		String v = request.getParameter("op");
		
		int ii = Integer.parseInt(i);
		int jj = Integer.parseInt(j);
		//int vv = Integer.parseInt(v);
		
		if(v == null) {
				out.println(ii+v+jj);
		}else if(v.equals("+")){
			out.println(ii+v+jj+"="+(ii+jj));
		}else if(v.equals("-")){
			out.println(ii+v+jj+"="+(ii-jj));
		}else if(v.equals("/")){
			out.println(ii+v+jj+"="+(ii/jj));
		}else if(v.equals("*")){
			out.println(ii+v+jj+"="+(ii*jj));
		}

	%>
		
</body>
</html>