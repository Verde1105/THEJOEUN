<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>
		
<div class="container">
		<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="Username">Username</label> 
			<input type="text" name="username" class="form-control" placeholder="Enter Username" id="Username">
		</div>
		<div class="form-group">
			<label for="password">Password:</label> 
			<input type="password" name = "password" class="form-control" placeholder="Enter password" id="Password">
		</div>
		
		<button id ="btn-login" class="btn btn-primary">로그인</button>
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=e629bfd8e3ae75a62fdc225cda9c4a9c&redirect_uri=http://localhost:8080/auth/kakao/calback&response_type=code">
			<img height="38px" src ="/image/kakao_login_button"/>
		</a>
	</form>
</div>
		<script src="/js/user.js"></script>
		<%@ include file="../layout/footer.jsp" %>
	</body>
</html>