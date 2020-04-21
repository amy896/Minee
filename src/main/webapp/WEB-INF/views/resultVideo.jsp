<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ include file = "/WEB-INF/views/header.jsp"%>
<% String keyword = (String) session.getAttribute("keyword");%> 
		<title>
			<%=keyword%> - Minee 검색 </title>
	<link rel="stylesheet" type="text/css" href="resources/css/resultImage.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/resultVideo.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/resultHeader.jsp"%>
	<div class="result_video_container">
		<ul>
			<li class="video_item">
				<a href="#"> <img src="http://placehold.it/116x70" /></a>
				<dl class="video_item_info">
					<dd class="video_url"><a href="#"> url 영역입니다.</a></dd>
					<dt class="video_title"><a href="#">제목영역 입니다.</a></dt>
					<dd class="video_content">
						컨텐츠 영역입니다.
					</dd>
					<dd class="video_date">2020.02.15</dd>
				</dl>
			</li>
		</ul>
	</div>
</body>
</html>