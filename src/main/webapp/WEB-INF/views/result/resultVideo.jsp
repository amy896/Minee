<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
	<title>${ keyword } - Minee 검색 </title>
	<link rel="stylesheet" type="text/css" href="resources/css/result/resultVideo.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/result/common.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/result/resultHeader.jsp"%>
	
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
						<dd class="video_date"><fmt:formatDate pattern="yyyy.MM.dd" value="${videoItem.date}"/></dd>
					</dl>
					</li>

			</c:forEach>
		</ul>
	</div>
	
	<%@ include file="/WEB-INF/views/result/common.jsp" %>
</body>
</html>