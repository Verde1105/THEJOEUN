<%@ page import="com.company.member.DTO.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<Member> memberList = (ArrayList) request.getAttribute("memberList");
%>
<!DOCTYPE HTML>
<html>
<head>
<title>Generic Page - Industrious by TEMPLATED</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/company/assets/css/main.css" />
</head>
<body class="is-preload">

	<!-- HEADER -->
	<%@include file="/company/include/header.jsp"%>

	<!-- Nav -->
	<%@include file="/company/include/nav.jsp"%>

	<!-- Heading -->
	<div id="heading">
		<h1>회원관리 페이지</h1>
	</div>

	<!-- CONTENT -->
	<div class="">
		<table class="" style="text-align: center">
			<thead>
				<tr>
					<th style="background-color: #eeeeee; text-align: center;">아이디</th>
					<th style="background-color: #eeeeee; text-align: center;">비밀번호</th>
					<th style="background-color: #eeeeee; text-align: center;">이름</th>
					<th style="background-color: #eeeeee; text-align: center;">등급</th>
					<th style="background-color: #eeeeee; text-align: center;">주소</th>
					<th style="background-color: #eeeeee; text-align: center;">전화번호</th>
					<th style="background-color: #eeeeee; text-align: center;">검사결과</th>
					<th style="background-color: #eeeeee; text-align: center;">가입일</th>
					<th style="background-color: #eeeeee; text-align: center;">탈퇴상황</th>
					<th style="background-color: #eeeeee; text-align: center;">IP</th>
					<th style="background-color: #eeeeee; text-align: center;">수정/삭제</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0; i < memberList.size(); i++) {
				%>
				<tr>
					<td><%=memberList.get(i).getMember_id()%></td>
					<td><%=memberList.get(i).getMember_password()%></td>
					<td><%=memberList.get(i).getMember_name()%></td>
					<td><%=memberList.get(i).getMember_rank()%></td>
					<td><%=memberList.get(i).getMember_adress()%></td>
					<td><%=memberList.get(i).getMember_phone()%></td>
					<td><%=memberList.get(i).getMember_selfresult()%></td>
					<td><%=memberList.get(i).getMember_joindate()%></td>
					<td><%=memberList.get(i).getDelete_yn()%></td>
					<td><%=memberList.get(i).getIp()%></td>
					<td>
						<a href="Update?member_id=<%=memberList.get(i).getMember_id()%>" class="button small">수정</a> 
						<a href="Delete?member_id=<%=memberList.get(i).getMember_id()%>" class="button small">삭제</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>

	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>
	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>

</body>
</html>