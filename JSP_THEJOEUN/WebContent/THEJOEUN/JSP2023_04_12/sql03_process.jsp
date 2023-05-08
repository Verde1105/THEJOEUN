<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
<title>JSTL</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
	%>
	<sql:setDataSource var="dataSource"
		url="jdbc:mysql://localhost:3306/JSPBookDB"
		driver="com.mysql.jdbc.Driver" user="root" password="java" />


	<sql:update dataSource="${dataSource}" var="resultSet">
		UPDATE member SET name =?  where id =? and passwd =?
		<sql:param value="<%=name%>" />
		<sql:param value="<%=id%>" />		
		<sql:param value="<%=passwd%>" />		
	</sql:update>
	<c:import var="url" url="sql01.jsp"  />
	${url}
</body>
</html>