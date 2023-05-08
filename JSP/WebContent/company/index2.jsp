<%@page import="DataBaseConnection.DTO.DataBaseConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Industrious by TEMPLATED</title>
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


	<!-- Banner -->
	<section id="banner">
		<div class="inner">
			<h1>코로나바이러스감염증-19(COVID-19)</h1>
			<p>
				대한민국 정부는 후베이성에서 입국한 외국인의 입국을 금지하고, 중국 및 일본발 입국자 사증심사를 강화하였으며, 중국(홍콩,
				마카오 포함), 이탈리아, 이란을 검역관리지역으로 지정하여 입국자 검역을 강화하고 있습니다. 특히, 대한민국 정부는
				2020년 2월 4일부터 중국으로부터 한국으로 입국하는 모든 승객에 대해 ‘특별입국절차’를 시행하고 있으며,
				홍콩‧마카오(2월12일), 일본(3월9일), 이탈리아‧이란(3월12일), 유럽 주요 5개국(프랑스 · 독일 · 스페인 ·
				영국 · 네덜란드, 3월 15일), 유럽 전역(3월 16일), 전세계 모든 입국자(3월 19일)로 적용지역을
				확대하였습니다.<br />
			</p>
		</div>
		<video autoplay loop muted playsinline src="images/banner.mp4"></video>
	</section>

	<!-- CHATTING -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">
				<header>
					<h2>CHATTING</h2>
				</header>
				<!-- 로그인한 상태일 경우와 비로그인 상태일 경우의 chat_id설정 -->
				<%
					if (member == null) {
				%>
				<input type="hidden" value=<%=request.getRemoteAddr()%>	id='chat_id_index' />
				<%
					} else {
				%>
				<input type="hidden" value=<%=member.getMember_id()%> id='chat_id_index' />
				<%
					}
				%>
				
				<!--     채팅창 -->
				<div id="_chatbox_index" style="display: none">
					<fieldset>
						<div id="messageWindow" style="overflow: auto; height:250px;"></div>
						<br /> <input id="inputMessage" type="text" onkeyup="enterkey()" />
						<input type="submit" value="send" onclick="send()" />
					</fieldset>
				</div>
				<img class="chat_index" src="<%=request.getContextPath()%>/company/images/chat.png" />
			
			</div>
		</div>
	</section>

	<!-- CTA -->
	<section id="cta" class="wrapper">
		<div class="inner">
			<h2>프로젝트 설명</h2>
			<p>1주일만에 자바와 HTML 및 JSP를 마스터하고 실전 투입되어 코로나관련 웹을 제작하여 국가에 크게 기여하고
				있습니다</p>
		</div>
	</section>

	<!-- Testimonials -->
	<section class="wrapper" style="text-align: center;">
		<div class="inner">
			<header class="special">
				<h2>조원 소개</h2>
				<p>코로나 전염병 확산으로 긴급 투입된 정예 요원들입니다.</p>
			</header>
			<div class="testimonials">
				<section>
					<div class="content">
						<blockquote>
							<p>빅데이터반 반장입니다.빅데이터반이 웹제작을 마스터 할수 있도록 멱살잡고 끌고 가겠습니다</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/KimMinSeo.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>김민서</strong> <span>팀장 - <br>자바기반 빅데이더플렛폼
									전문가 및 카리스마를 담당하고 있습니다
								</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>팀원들 3대 500 만들어 조지겠습니다.체력과 웹제작은 국력입니다</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/jihoonkim.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>김지훈</strong> <span>팀원 -<br> 자바기반 빅데이더플렛폼
									전문가 및 팀원 체력 향상을 책임지고 있습니다
								</span>
							</p>
						</div>
					</div>
				</section>
				<section>
					<div class="content">
						<blockquote>
							<p>안녕하세요 팀원 류경선 입니다. 대선에 출마할 예정입니다.</p>
						</blockquote>
						<div class="author">
							<div class="image">
								<img src="images/RyuKyungSeon.jpg" alt="" />
							</div>
							<p class="credit">
								- <strong>류경선</strong> <span>팀원 -<br> 자바기반 빅데이더플렛폼
									전문가 및 막내 귀여움을 독차지하고 있습니다.
								</span>
							</p>
						</div>
					</div>
				</section>
			</div>
		</div>
	</section>

	<!-- FOOTER -->
	<%@include file="/company/include/footer.jsp"%>

	<!-- SCRIPT -->
	<%@include file="/company/include/script.jsp"%>
</body>
</html>
<!-- CHATTING -->
<%@include file="/company/include/Chatting.jsp"%>
</script>