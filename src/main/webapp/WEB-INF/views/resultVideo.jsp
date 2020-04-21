<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="/WEB-INF/views/header.jsp"%>
<meta charset="UTF-8">
<title>Minee</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/resultVideo.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/resultHeader.jsp"%>
	<div class="result_video_container">
		<ul>
			<li class="video_item">
				<a href="#"> <img src="http://placehold.it/116x65" /></a>
				<dl class="video_item_info">
					<dt class="video_title"><a href="#">제목영역 입니다.</a></dt>
					<dd class="video_content">
						CSS Reset은 스타일 요소에 대한 깨끗한 슬레일관성을 강화하는데..
					</dd>
					<dd class="video_date">2020.02.15</dd>
				</dl>
			</li>
		</ul>
	</div>
</body>
</html>