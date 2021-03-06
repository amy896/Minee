<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file = "/WEB-INF/views/common/header.jsp"%>
	<title>${ keyword } - Minee 검색 </title>
	<link rel="stylesheet" type="text/css" href="resources/css/result/resultImage.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/result/common.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/result/resultHeader.jsp" %>


	<div class="result_img_container">
		<c:forEach items="${ galleryItemList }" var="galleryItem">
			<div class="image_item">
				<a href="#"> <img src="${ galleryItem.imgUrl }" />
					<p class="image_title item_info">${ galleryItem.title }</p>
					<p class="image_url info">${ galleryItem.url }</p>
				</a>
			</div>
		</c:forEach>
	</div>
	
	<%@ include file="/WEB-INF/views/result/common.jsp" %>
</body>
</html>