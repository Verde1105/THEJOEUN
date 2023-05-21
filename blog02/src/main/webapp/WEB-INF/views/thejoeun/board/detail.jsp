<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML>
<!--
	Editorial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<%@ include file="../layout/header.jsp" %>
	</head>
	<body class="is-preload">

		<!-- Wrapper -->
		<div id="wrapper">

			<!-- Main -->
			<div id="main">
				<div class="inner">

					<!-- Header -->
					<header id="header">
						<a href="index.jsp" class="logo"><strong>Editorial</strong> by HTML5 UP</a>
						<ul class="icons">
							<li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon brands fa-snapchat-ghost"><span class="label">Snapchat</span></a></li>
							<li><a href="#" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
							<li><a href="#" class="icon brands fa-medium-m"><span class="label">Medium</span></a></li>
						</ul>
					</header>

					<!-- Content -->
					<section>
						<header class="main">
							<h1>${board.title}</h1>
							<div>
								글 번호 : <span id="id">
											<i>${board.id}</i>
										</span>
						
								작성자 : <span>
											<i>${board.user.username}</i>
										</span>
							</div>
						</header>
						<div class="container">
						<div>
							<div>${board.content}</div>
						</div>
						<hr/>
						
	<button class = "button primary btn btn-secondary" onclick="history.back()">돌아가기</button>
	<c:if test="${board.user.id == principal.user.id}">
		<a href = "/thejoeun/board/${board.id}/updateForm" class = "button primary btn btn-warning">수정</a>
		<button id="btn-delete" class = "button primary btn btn-danger">삭제</button>
	</c:if>
	
	<br>
	<br>



	<hr/>
	<!-- 댓글 -->
	<div class="card">
		<div class="card-body">
			<textarea class="form-control" rows="1"></textarea>
		</div>
		<div class="card-footer">
			<button class="btn btn-primary">등록</button>
		</div>
		<br/>
		<div class="card">
			<div class="card-header">댓글리스트</div>
			<ul id="comment-box" class="list-group">
				<li id="comment--1" class = "list-group-item d-flex justify-content-between">
					<div>댓글내용입니다</div>
					<div class = "d-flex">
						<div class = "font-italic">작성자 : ㄴㅁㄹㅇㄶㅇㄹ놓 &nbsp;</div>
						<button class = "badge">삭제</button>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>
<script>
	$('.summernote').summernote({
		tabsize: 2,
		height: 300
	});
</script>
<script src="/js/ThejoeunBoard.js"></script>

					</section>

				</div>
			</div>

			<!-- Sidebar -->
			<%@ include file="../layout/Sidebar.jsp" %>
		</div>

		<!-- Scripts -->
		<script src="/assets/js/jquery.min.js"></script>
		<script src="/assets/js/browser.min.js"></script>
		<script src="/assets/js/breakpoints.min.js"></script>
		<script src="/assets/js/util.js"></script>
		<script src="/assets/js/main.js"></script>

	</body>
</html>

		


