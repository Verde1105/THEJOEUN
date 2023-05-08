<%@page import="com.company.board.DTO.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<Board> boardList = (ArrayList) request.getAttribute("boardList");
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
		<h1>CORONA COMUNITY</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<header>
					<h1>CORONA COMUNITY</h1>
				</header>

				<!-- CONTENT -->
				<div class="container">
					<div class="">
						<form action="BoardWrite" method="post">
							<table class=""
								style="text-align: center; border: 1px solid #dddddd">
								<thead>
									<tr>
										<th>JSP PROJECT OF KMS COMPANY</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="text" placeholder="글 제목"
											name="board_title" maxlength="50"></td>
									</tr>
									<tr>
										<td><textarea placeholder="글 내용" name="board_content"
												maxlength="2048" style="height: 350px;"></textarea></td>
									</tr>
								</tbody>
							</table>
							<input type="submit" class="" value="글쓰기">
						</form>
					</div>
				</div>

			</div>
		</div>
	</section>

	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>
	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>



</body>
</html>