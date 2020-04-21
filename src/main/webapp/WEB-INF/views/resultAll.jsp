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
					<a href="http://www.naver.com">
						<dl class = "item_title">
							<dd class= "item_url">url영역 입니다.</dd>
							<dt class= "item_name">제목영역 입니다.</dt>
						</dl>
						<dl class = "item_Info">
							<dd class= "item_desc">네이버 메인에서 다양한 정보와 유용한 컨텐츠를 만나 보세요</dd>
							<dd class= "item_date">2020.04.21</dd>
						</dl>
					</a>
				</li>
			</ul>
		</div>
	</body>
</html> 