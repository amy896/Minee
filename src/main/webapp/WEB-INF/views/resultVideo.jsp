<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<title><%=request.getParameter("keyword")%></title>
<link rel="stylesheet" type="text/css"
	href="resources/css/resultVideo.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/resultHeader.jsp"%>
	<div class="result_video_container">
		<ul>
			<c:forEach items="${videoItemList }" var="videoItem">
				<li class="video_item">
					<a href='${videoItem.url }'> 
					<img src="${videoItem.imgUrl }" /></a>
					<dl class="video_item_info">
						<dd class="video_url">
							<a href="${videoItem.url }">${videoItem.url }</a>
						</dd>
						<dt class="video_title">
							<a href="${videoItem.url }">${videoItem.title }</a>
						</dt>
						<dd class="video_content">${videoItem.dsc }</dd>
						<dd class="video_date">${videoItem.date }</dd>
					</dl>
					</li>

			</c:forEach>
		</ul>
</body>
</html>