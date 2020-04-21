<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file = "/WEB-INF/views/header.jsp"%>

		<title>
			<%=request.getParameter("keyword")%> - Minee 검색 
		</title>
		<link rel="stylesheet" type="text/css" href="resources/css/resultAll.css" />
	</head>
	<body>
		<%@ include file="/WEB-INF/views/resultHeader.jsp" %>
		<% 
		String keyword = request.getParameter("keyword");
		request.setAttribute("keyword", keyword);
		%>
		
		<div calss="resultAllContainer">
			<ul>
				<li class ="resultItem">
					<dl class = "item_title">
						<a href="http://www.naver.com">
							<dd class= "item_url">url영역 하이퍼링크와 관계없이 검은색으로 처리하고 폰트크기 작게 부탁드립니당^~^</dd>
							<dt class= "item_name">제목</dt>
						</a>
					</dl>
					<dl class = "item_Info">
						<dd class= "item_date">2020.04.21 item_info 회색으로 S2</dd>
						<dd class= "item_desc">네이버 메인에서 다양한 정보와 유용한 컨텐츠를 만나 보세요</dd>
					</dl>
				</li>
			</ul>
		</div>
	</body>
</html> 