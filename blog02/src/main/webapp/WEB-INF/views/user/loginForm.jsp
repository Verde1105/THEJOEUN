<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="layout/header.jsp" %>
		
<div class="container">
	<form action="/action_page.php">
		<div class="form-group">
			<label for="Username">Username</label> <input type="text"
				class="form-control" placeholder="Enter Username" id="Username">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" placeholder="Enter password" id="Password">
		</div>
		<div class="form-group form-check">
			<label class="form-check-label"> <input
				class="form-check-input" type="checkbox"> Remember me
			</label>
		</div>
		<button type="submit" class="btn btn-primary">로그인 완료</button>
	</form>
</div>
		
		<%@ include file="layout/footer.jsp" %>
	</body>
</html>