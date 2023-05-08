<%@page import="com.company.board.DTO.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% Board board = (Board)request.getAttribute("board"); %>
<!DOCTYPE html>
<html>
<head>
<title>Main</title>
<meta name=viewport
	content="width=device-width, initial-scale=1, user-scalable=0">
<meta http-equiv="Content-Type" content="text/html; utf-8">
<meta charset="utf-8">
<link rel="stylesheet" href="/CSS/Board.css">
</head>
<body>
	<!-- HEADER -->
	<%@include file="/corona/include/header.jsp"%>
	
	<!-- CONTENT -->
	<div class="container">
		<div class="">
			<form action="BoardUpdate" method="post">
				<table class="" style="text-align:center; border:1px solid #dddddd">
					<thead>
						<tr>
							<th colspan="2" style="background-color: #eeeeee; text-align: center;">게시글 양식</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="hidden" name="Board_id" value="<%=board.getBoard_id()%>"><%=board.getBoard_id()%></td>
						</tr>
						<tr>
							<td><input type="text" value="<%=board.getBoard_title()%>" name="Board_title"></td>
						</tr>
						<tr>
							<td><input type="text" value="<%=board.getBoard_content()%>" name="Board_content"></td>
						</tr>
					</tbody>
				</table>
				<input type="submit">
			</form>
		</div>
	</div>

	<!-- FOOTER -->
	<%@include file="/corona/include/footer.jsp"%>
</body>
</html>