<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file = "/WEB-INF/views/common/header.jsp"%>
	<title> ${ keyword } - Minee 검색</title>
	<link rel="stylesheet" type="text/css" href="resources/css/result/resultAll.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/result/common.css" />
</head>
<body>
	<%@ include file="/WEB-INF/views/result/resultHeader.jsp"%>
	
	<div class="resultAllContainer">
		<ul>
			<c:forEach items="${resultList }" var="result">
				<li class="resultItem"><a href="${result.url }">
						<dl class="item_title">
							<dd class="item_url">${result.url }</dd>
							<dt class="item_name">${result.title }</dt>
						</dl>
						<dl class="item_Info">
							<dd class="item_desc">${result.dsc }</dd>
							<dd class="item_date">
								<fmt:formatDate pattern="yyyy.MM.dd" value="${result.date }" />
							</dd>
						</dl>
				</a></li>
			</c:forEach>
		</ul>
	</div>
	
	<!-- 페이징 -->
	<%@ include file="/WEB-INF/views/result/common.jsp"%>
	<!-- ~페이징 -->
</body>
</html> 