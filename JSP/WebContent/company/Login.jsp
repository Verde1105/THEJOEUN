<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<!--Made with love by Mutiullah Samim -->
<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">
<!--Custom styles-->
<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->
<style type="text/css">
/* Made with love by Mutiullah Samim*/
@import url('https://fonts.googleapis.com/css?family=Numans');

html, body {
	background-image:
		/* url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg'); 
		url('https://cdn.mkhealth.co.kr/news/photo/202009/50473_50434_3933.jpg');
		*/
	background-size: cover;
	background-repeat: no-repeat;
	height: 100%;
	font-family: 'Numans', sans-serif;
}

.container {
	height: 100%;
	align-content: center;
}

.card {
	height: 300px;
	margin-top: 100px;
	margin-bottom: auto;
	width: 400px;
	background-color: rgba(0, 0, 0, 0.5) !important;
}

.social_icon span {
	font-size: 60px;
	margin-left: 10px;
	color: #FFC312;
}

.social_icon span:hover {
	color: white;
	cursor: pointer;
}

.card-header h3 {
	color: white;
}

.social_icon {
	position: absolute;
	right: 20px;
	top: -45px;
}

.input-group-prepend span {
	width: 50px;
	background-color: #E2212f;
	color: black;
	border: 0 !important;
}

input:focus {
	outline: 0 0 0 0 !important;
	box-shadow: 0 0 0 0 !important;
}

.remember {
	color: white;
}

.remember input {
	width: 20px;
	height: 20px;
	margin-left: 15px;
	margin-right: 5px;
}

.login_btn {
	color: black;
	background-color: #CACFD2;
	width: 170px;
}

.login_btn2 {
	color: black;
	background-color: #CACFD2;
	width: 170px;
}

.login_btn:hover {
	color: black;
	background-color: white;
}

.links {
	color: white;
}

.links a {
	margin-left: 4px;
}

footer {
	display: block;
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
	text-align: center;
	margin-bottom: 4rem;
	max-width: 75%;
	margin-left: auto;
	margin-right: auto;
}

#header {
	-moz-align-items: center;
	-webkit-align-items: center;
	-ms-align-items: center;
	align-items: center;
	display: -moz-flex;
	display: -webkit-flex;
	display: -ms-flex;
	display: flex;
	-moz-justify-content: space-between;
	-webkit-justify-content: space-between;
	-ms-justify-content: space-between;
	justify-content: space-between;
	background: #111111;
	color: rgba(255, 255, 255, 0.5);
	cursor: default;
	height: 3.25rem;
	left: 0;
	line-height: 3.25rem;
	position: fixed;
	top: 0;
	width: 100%;
	z-index: 10001;
}

#header>.logo {
	color: #ffffff;
	font-size: 1rem;
	font-weight: 600;
	height: inherit;
	line-height: inherit;
	padding: 0 1.25rem;
	text-decoration: none;
}

#header>nav>a {
	color: inherit;
	display: inline-block;
	padding: 0 0.75rem;
	text-decoration: none;
}

#header>nav>a:hover {
	color: #ffffff;
}

#header>nav>a[href="#menu"] {
	text-decoration: none;
	-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}

#header>nav>a[href="#menu"]:before {
	-moz-osx-font-smoothing: grayscale;
	-webkit-font-smoothing: antialiased;
	font-family: FontAwesome;
	font-style: normal;
	font-weight: normal;
	text-transform: none !important;
}

#header>nav>a[href="#menu"]:before {
	content: '\f0c9';
	margin: 0 0.5rem 0 0;
}

#header>nav>a+a[href="#menu"]:last-child {
	border-left: solid 1px rgba(255, 255, 255, 0.25);
	margin-left: 0.5rem;
	padding-left: 1.25rem;
}

#header>nav>a:last-child {
	padding-right: 1.25rem;
}

@media screen and (max-width: 736px) {
	#header>nav>a {
		padding: 0 0.5rem;
	}
	#header>nav>a+a[href="#menu"]:last-child {
		margin-left: 0.25rem;
		padding-left: 1rem;
	}
	#header>nav>a:last-child {
		padding-right: 1rem;
	}
}

@media screen and (max-width: 980px) {
	body {
		padding-top: 44px;
	}
	#header {
		height: 44px;
		line-height: 44px;
	}
}

#menu {
	background-color: #111111;
	color: rgba(255, 255, 255, 0.5);
	-moz-transform: translateX(20rem);
	-webkit-transform: translateX(20rem);
	-ms-transform: translateX(20rem);
	transform: translateX(20rem);
	-moz-transition: -moz-transform 0.5s ease, box-shadow 0.5s ease,
		visibility 0.5s;
	-webkit-transition: -webkit-transform 0.5s ease, box-shadow 0.5s ease,
		visibility 0.5s;
	-ms-transition: -ms-transform 0.5s ease, box-shadow 0.5s ease,
		visibility 0.5s;
	transition: transform 0.5s ease, box-shadow 0.5s ease, visibility 0.5s;
	-webkit-overflow-scrolling: touch;
	box-shadow: none;
	height: 100%;
	max-width: 80%;
	overflow-y: auto;
	padding: 3rem 2rem;
	position: fixed;
	right: 0;
	top: 0;
	visibility: hidden;
	width: 20rem;
	z-index: 10002;
}

#menu input, #menu select, #menu textarea {
	color: #ffffff;
}

#menu a {
	color: #ce1b28;
}

#menu strong, #menu b {
	color: #ffffff;
}

#menu h1, #menu h2, #menu h3, #menu h4, #menu h5, #menu h6 {
	color: #ffffff;
}

#menu blockquote {
	border-left-color: rgba(255, 255, 255, 0.25);
}

#menu code {
	background: rgba(255, 255, 255, 0.075);
	border-color: rgba(255, 255, 255, 0.25);
}

#menu hr {
	border-bottom-color: rgba(255, 255, 255, 0.25);
}

#menu input[type="submit"], #menu input[type="reset"], #menu input[type="button"],
	#menu button, #menu .button {
	background-color: transparent;
	box-shadow: inset 0 0 0 1px #ffffff;
	color: #ffffff !important;
}

#menu input[type="submit"]:hover, #menu input[type="reset"]:hover, #menu input[type="button"]:hover,
	#menu button:hover, #menu .button:hover {
	box-shadow: inset 0 0 0 1px #ce1b28;
	color: #ce1b28 !important;
}

#menu input[type="submit"]:hover:active, #menu input[type="reset"]:hover:active,
	#menu input[type="button"]:hover:active, #menu button:hover:active,
	#menu .button:hover:active {
	background-color: rgba(206, 27, 40, 0.25);
}

#menu input[type="submit"].primary, #menu input[type="reset"].primary,
	#menu input[type="button"].primary, #menu button.primary, #menu .button.primary
	{
	box-shadow: none;
	background-color: #ce1b28;
	color: #ffffff !important;
}

#menu input[type="submit"].primary:hover, #menu input[type="reset"].primary:hover,
	#menu input[type="button"].primary:hover, #menu button.primary:hover,
	#menu .button.primary:hover {
	background-color: #e2212f;
	box-shadow: none;
}

#menu input[type="submit"].primary:hover:active, #menu input[type="reset"].primary:hover:active,
	#menu input[type="button"].primary:hover:active, #menu button.primary:hover:active,
	#menu .button.primary:hover:active {
	background-color: #b71824;
}

#menu>ul {
	margin: 0 0 1rem 0;
}

#menu>ul.links {
	list-style: none;
	padding: 0;
}

#menu>ul.links>li {
	padding: 0;
}

#menu>ul.links>li>a {
	border: 0;
	border-top: solid 1px rgba(255, 255, 255, 0.25);
	color: inherit;
	display: block;
	line-height: 3.5rem;
	text-decoration: none;
}

#menu>ul.links>li>a:hover {
	color: #ffffff;
}

#menu>ul.links>li:first-child>a {
	border-top: 0;
}

#menu .close {
	text-decoration: none;
	-moz-transition: color 0.2s ease-in-out;
	-webkit-transition: color 0.2s ease-in-out;
	-ms-transition: color 0.2s ease-in-out;
	transition: color 0.2s ease-in-out;
	-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
	border: 0;
	color: rgba(255, 255, 255, 0.4);
	cursor: pointer;
	display: block;
	height: 3.25rem;
	line-height: 3.25rem;
	padding-right: 1.25rem;
	position: absolute;
	right: 0;
	text-align: right;
	top: 0;
	vertical-align: middle;
	width: 7rem;
}

#menu .close:before {
	-moz-osx-font-smoothing: grayscale;
	-webkit-font-smoothing: antialiased;
	font-family: FontAwesome;
	font-style: normal;
	font-weight: normal;
	text-transform: none !important;
}

#menu .close:before {
	content: '\f00d';
	font-size: 1.25rem;
}

#menu .close:hover {
	color: #ffffff;
}

@media screen and (max-width: 736px) {
	#menu .close {
		height: 4rem;
		line-height: 4rem;
	}
}

@media screen and (max-width: 736px) {
	#menu {
		padding: 2.5rem 1.75rem;
	}
}

body.is-menu-visible #menu {
	-moz-transform: translateX(0);
	-webkit-transform: translateX(0);
	-ms-transform: translateX(0);
	transform: translateX(0);
	box-shadow: 0 0 1.5rem 0 rgba(0, 0, 0, 0.2);
	visibility: visible;
}

/* Footer */
#footer {
	background-color: #111111;
	color: rgba(255, 255, 255, 0.5);
	padding: 8rem 0 6rem 0;
}

#footer input, #footer select, #footer textarea {
	color: #ffffff;
}

#footer a {
	color: #ce1b28;
}

#footer strong, #footer b {
	color: #ffffff;
}

#footer h1, #footer h2, #footer h3, #footer h4, #footer h5, #footer h6 {
	color: #ffffff;
}

#footer blockquote {
	border-left-color: rgba(255, 255, 255, 0.25);
}

#footer code {
	background: rgba(255, 255, 255, 0.075);
	border-color: rgba(255, 255, 255, 0.25);
}

#footer hr {
	border-bottom-color: rgba(255, 255, 255, 0.25);
}

#footer input[type="submit"], #footer input[type="reset"], #footer input[type="button"],
	#footer button, #footer .button {
	background-color: transparent;
	box-shadow: inset 0 0 0 1px #ffffff;
	color: #ffffff !important;
}

#footer input[type="submit"]:hover, #footer input[type="reset"]:hover,
	#footer input[type="button"]:hover, #footer button:hover, #footer .button:hover
	{
	box-shadow: inset 0 0 0 1px #ce1b28;
	color: #ce1b28 !important;
}

#footer input[type="submit"]:hover:active, #footer input[type="reset"]:hover:active,
	#footer input[type="button"]:hover:active, #footer button:hover:active,
	#footer .button:hover:active {
	background-color: rgba(206, 27, 40, 0.25);
}

#footer input[type="submit"].primary, #footer input[type="reset"].primary,
	#footer input[type="button"].primary, #footer button.primary, #footer .button.primary
	{
	box-shadow: none;
	background-color: #ce1b28;
	color: #ffffff !important;
}

#footer input[type="submit"].primary:hover, #footer input[type="reset"].primary:hover,
	#footer input[type="button"].primary:hover, #footer button.primary:hover,
	#footer .button.primary:hover {
	background-color: #e2212f;
	box-shadow: none;
}

#footer input[type="submit"].primary:hover:active, #footer input[type="reset"].primary:hover:active,
	#footer input[type="button"].primary:hover:active, #footer button.primary:hover:active,
	#footer .button.primary:hover:active {
	background-color: #b71824;
}

#footer label {
	color: #ffffff;
}

#footer input[type="text"], #footer input[type="password"], #footer input[type="email"],
	#footer input[type="tel"], #footer input[type="search"], #footer input[type="url"],
	#footer select, #footer textarea {
	background-color: rgba(255, 255, 255, 0.075);
	border-color: rgba(255, 255, 255, 0.25);
}

#footer input[type="text"]:focus, #footer input[type="password"]:focus,
	#footer input[type="email"]:focus, #footer input[type="tel"]:focus,
	#footer input[type="search"]:focus, #footer input[type="url"]:focus,
	#footer select:focus, #footer textarea:focus {
	border-color: #ce1b28;
	box-shadow: 0 0 0 1px #ce1b28;
}

#footer select {
	background-image:
		url("data:image/svg+xml;charset=utf8,%3Csvg xmlns='http://www.w3.org/2000/svg' width='40' height='40' preserveAspectRatio='none' viewBox='0 0 40 40'%3E%3Cpath d='M9.4,12.3l10.4,10.4l10.4-10.4c0.2-0.2,0.5-0.4,0.9-0.4c0.3,0,0.6,0.1,0.9,0.4l3.3,3.3c0.2,0.2,0.4,0.5,0.4,0.9 c0,0.4-0.1,0.6-0.4,0.9L20.7,31.9c-0.2,0.2-0.5,0.4-0.9,0.4c-0.3,0-0.6-0.1-0.9-0.4L4.3,17.3c-0.2-0.2-0.4-0.5-0.4-0.9 c0-0.4,0.1-0.6,0.4-0.9l3.3-3.3c0.2-0.2,0.5-0.4,0.9-0.4S9.1,12.1,9.4,12.3z' fill='rgba(255, 255, 255, 0.25)' /%3E%3C/svg%3E");
}

#footer select option {
	color: rgba(255, 255, 255, 0.5);
	background-color: #111111;
}

#footer input[type="checkbox"]+label, #footer input[type="radio"]+label
	{
	color: rgba(255, 255, 255, 0.5);
}

#footer input[type="checkbox"]+label:before, #footer input[type="radio"]+label:before
	{
	background: rgba(255, 255, 255, 0.075);
	border-color: rgba(255, 255, 255, 0.25);
}

#footer input[type="checkbox"]:checked+label:before, #footer input[type="radio"]:checked+label:before
	{
	background-color: #ce1b28;
	border-color: #ce1b28;
	color: #ffffff;
}

#footer input[type="checkbox"]:focus+label:before, #footer input[type="radio"]:focus+label:before
	{
	border-color: #ce1b28;
	box-shadow: 0 0 0 1px #ce1b28;
}

#footer ::-webkit-input-placeholder {
	color: rgba(255, 255, 255, 0.4) !important;
}

#footer :-moz-placeholder {
	color: rgba(255, 255, 255, 0.4) !important;
}

#footer ::-moz-placeholder {
	color: rgba(255, 255, 255, 0.4) !important;
}

#footer :-ms-input-placeholder {
	color: rgba(255, 255, 255, 0.4) !important;
}

#footer ul.alt li {
	border-top-color: rgba(255, 255, 255, 0.25);
}

#footer table tbody tr {
	border-color: rgba(255, 255, 255, 0.25);
}

#footer table tbody tr:nth-child(2n + 1) {
	background-color: rgba(255, 255, 255, 0.075);
}

#footer table th {
	color: #ffffff;
}

#footer table thead {
	border-bottom-color: rgba(255, 255, 255, 0.25);
}

#footer table tfoot {
	border-top-color: rgba(255, 255, 255, 0.25);
}

#footer table.alt tbody tr td {
	border-color: rgba(255, 255, 255, 0.25);
}

#footer .highlights .content {
	background: #111111;
	box-shadow: 0px 0px 4px 1px rgba(255, 255, 255, 0.025);
}

#footer .testimonials .content {
	background: #111111;
	box-shadow: 0px 0px 4px 1px rgba(255, 255, 255, 0.025);
}

#footer .testimonials .content .credit strong {
	color: #ce1b28;
}

#footer a {
	color: rgba(255, 255, 255, 0.5);
	text-decoration: none;
}

#footer a:hover {
	color: #ce1b28;
}

#footer .content {
	display: -moz-flex;
	display: -webkit-flex;
	display: -ms-flex;
	display: flex;
}

#footer .content section {
	width: 25%;
}

#footer .content section:first-child {
	width: 50%;
	padding-right: 4rem;
}

#footer .content section:last-child {
	padding-left: 4rem;
}

#footer .copyright {
	border-top: 1px solid;
	font-size: 0.8rem;
	opacity: 0.5;
	padding: 2rem 0;
	text-align: center;
}

@media screen and (max-width: 1280px) {
	#footer {
		padding: 4rem 0 2rem 0;
	}
}

@media screen and (max-width: 980px) {
	#footer .content {
		-moz-flex-wrap: wrap;
		-webkit-flex-wrap: wrap;
		-ms-flex-wrap: wrap;
		flex-wrap: wrap;
	}
	#footer .content section {
		width: 50%;
	}
	#footer .content section:first-child {
		width: 100%;
		padding-right: 0;
	}
}

@media screen and (max-width: 736px) {
	#footer {
		padding: 3rem 0 1rem 0;
	}
	#footer .content section {
		
	}
	#footer .content section:last-child {
		padding-left: 0;
	}
}

@media screen and (max-width: 480px) {
	#footer {
		padding: 2rem 0 0.1rem 0;
	}
}

video#bgvid {
position: fixed; right: 0; bottom: 0;
min-width: 100%; min-height: 100%;
width: auto; height: auto; z-index: -100;
/* background: url(polina.jpg) no-repeat; */
background-size: cover;
}
</style>
</head>
<body>

	<!-- HEADER -->
	<%@include file="/company/include/header.jsp"%>

	<!-- Nav -->
	<%@include file="/company/include/nav.jsp"%>

	<!-- Heading -->
	<div id="heading">
		<h1>Login Page</h1>
	</div>
	
	<video autoplay loop muted playsinline src="images/corona.mp4"  id="bgvid"></video>

	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">

				<div class="card-header">
					<span class="glyphicon glyphicon-lock"> </span>
					<h3>Form Login</h3>
					<div class="d-flex justify-content-end social_icon">
						
						<!-- 류경선 링크 수정 -->
						<a href="" target="_blank">
							<span><i class="fab fa-facebook-square"></i></span>
						</a> 
						
						<!-- 김지훈 링크 수정 -->
						<a href="" target="_blank">
							<span><i class="fab fa-google-plus-square"></i></span>
						</a> 
						
						<!-- 김민서 링크 수정 -->
						<a href="https://www.youtube.com/watch?v=WVCM2o0E9ps" target="_blank">
							<span><i class="fab fa-twitter-square"></i></span>
						</a>
						
					</div>
				</div>

				<!-- The Start of card-body -->
				<div class="card-body">
					<!-- Form -->
					<form action="Login" method="post" class="form-horizontal">

						<!-- 아이디 입력  -->
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="username" class="form-control"
								placeholder="아이디">
						</div>

						<!-- 비밀번호 입력  -->
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password" class="form-control"
								placeholder="비밀번호">
						</div>

						<div class="row align-items-center remember">
							<input type="checkbox">Remember Me
						</div>

						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="로그인"
								class="btn float-left login_btn"> <a
								href="Member/MemberJoin.jsp"><input type="button"
								value="회원가입" class="btn float-right login_btn2"></a>
						</div>

					</form>
					<!-- The end of Form -->
				</div>
				<!-- The end of card-body -->

			</div>
		</div>
	</div>

	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>
	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>

</body>
</html>