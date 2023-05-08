<%@page import="com.company.member.DTO.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
	Member memberInfo_session = (Member)session.getAttribute("member");
	IMemberDAO memberInfo_dao = new IMemberDAO();
	Member memberInfo_dto =  memberInfo_dao.select_Member(memberInfo_session);
%>
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
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
		<h1>나의 회원정보</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<header>
				</header>
				
				<!-- MyinfoUpdate Form -->
				<form>					
					<div>
						<div>
							<label>아이디 : <%=memberInfo_dto.getMember_id()%></label>
						</div>
					</div>
					<p>
					<div>
						<div>
							<label>비밀번호 : <%=memberInfo_dto.getMember_password()%></label>
						</div>
					</div>
					<p>
					<div>
						<div>
							<label>이름 : <%=memberInfo_dto.getMember_name()%></label>
						</div>
					</div>
					<p>
					<div>
						<div>
							<label>주소 : <%=memberInfo_dto.getMember_adress()%></label>
						</div>
					</div>
					<p>
					<div>
						<div>
							<label>전화번호 : <%=memberInfo_dto.getMember_phone()%></label>
						</div>
					</div>
					<p>
					<div>
						<div>
							<label>자가진단 결과 : <%=memberInfo_dto.getMember_selfresult()%></label>
						</div>
					</div>
					<p>
					<p>
					<a href="MemberUpdate.jsp" class="button">회원정보 수정</a>
					<a href="MemberDelete.jsp" class="button">회원 탈퇴</a>
				</form>
				<!-- The end of MyinfoUpdate -->
				
			</div>
		</div>
	</section>

	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>
	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>



</body>
</html>