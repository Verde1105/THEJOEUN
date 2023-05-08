<%@page import="com.company.board.DTO.Board"%>
<%@page import="com.company.comment.DTO.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% Board board = (Board)request.getAttribute("board"); %>
<% ArrayList<Comment> commentList = (ArrayList<Comment>)request.getAttribute("commentList"); %>
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
						<table class="" style="text-align:center; border:1px solid #dddddd">
							<thead>
								<tr>
									<th>JSP PROJECT OF KMS COMPANY [<%=board.getBoard_id()%>]</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><%=board.getBoard_title()%></td>
								</tr>
								<tr>
									<td><p><%=board.getBoard_content()%><p></td>
								</tr>
							</tbody>
						</table>
						
						<!-- COMMENT -->
						<div class="table-wrapper">
							<table  class="alt">
								<thead>
									<tr>
										<th>Name</th>
										<th> - Content - </th>
										<th>Date</th>
									</tr>
								</thead>								
								<%for (int i = 0; i < commentList.size(); i++) {%>
								<tr>
									<td style="width: 200px;">
										<%=commentList.get(i).getMember_id() %> 
										<h6 style="margin: 0 0 0 0;"><%=commentList.get(i).getComment_date()%></h6>
										
									</td>
									<td>
										<p style="margin: 0 0 0 0;"><%=commentList.get(i).getComment() %></p>
										<!-- <h5 style="margin: 0 0 0 0;">댓글 시간</h5> -->
									</td>
									<td style="width: 150px; text-align: center;">
									<% if(member != null){ %>
										<!-- 회원중 자기 댓글은 컨트롤 가능 -->
										<%if(member.getMember_id().equals(commentList.get(i).getMember_id())){%>
										<a href="CommentUpdate?comment_id=<%=commentList.get(i).getComment_id()%>" class="button small">수정</a>
										<a href="CommentUpdate?comment_id=<%=commentList.get(i).getComment_id()%>" class="button small">삭제</a>
										<%}else if(member.getMember_rank().equals("관리자")){ %>
										<!-- 관리자는 전부 컨트롤 가능 -->
										<a href="CommentUpdate?comment_id=<%=commentList.get(i).getComment_id()%>" class="button small">관리자 권한 수정</a>
										<a href="CommentUpdate?comment_id=<%=commentList.get(i).getComment_id()%>" class="button small">관리자 권한 삭제</a>
										<%}else{ %>
										<span class="button disabled small">수정</span>
										<span class="button disabled small">삭제</span>
										<%} %>
									<% } else { %>
										<!-- 회원이 아니면 버튼 자체에 권한이 없음 -->
										<span class="button disabled small">수정</span>
										<span class="button disabled small">삭제</span>
									<% } %>
									</td>
								</tr>
								<%}%>
							</table>
						</div>
						
						<hr>
						
						<form action="CommentWrite" method="post">
						<!-- 댓글에 전달될 hidden값-->
						<input type="hidden" name="board_id" value="<%=board.getBoard_id()%>"/>
							<thead>
							<% if(member != null) {%>
								<tr>작성자 : <%=member.getMember_id() %></tr>
							<%}else{ %>
								<tr>작성자 : 비회원</tr>
							<%} %>
							</thead>
							<tbody>
								<tr>
									<td>
										<textarea placeholder="댓글 내용" name="comment_content" maxlength="2048" style="height: 100px;"></textarea>
									</td>
								</tr>
							</tbody>
							<tfoot>
								<tr>
									<td>
									<input type="submit" class="button fit small" value="댓글 남기기">
									</td>
								</tr>
							</tfoot>
						</form>
						<!-- The end of COMMENT -->
						
						<%if(member != null){ %>
						<%if(member.getMember_id().equals(board.getMember_id())){%>
							<a href="BoardUpdate?Board_id=<%=board.getBoard_id()%>" class="button primary">수정</a>
							<a href="BoardDelete?Board_id=<%=board.getBoard_id()%>" class="button primary">삭제</a>
						<%}else if(member.getMember_rank().equals("관리자")){ %>
							<a href="BoardUpdate?Board_id=<%=board.getBoard_id()%>" class="button">관리자 권한 수정</a>
							<a href="BoardDelete?Board_id=<%=board.getBoard_id()%>" class="button">관리자 권한 삭제</a>
						<%	}%>
						<%}	%>
					</div>
				</div>
				<!-- The end of Content -->
				
			</div>
		</div>
	</section>
	<!-- The end of Main -->
	
	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>
	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>



</body>
</html>