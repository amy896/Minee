<%@page import="java.util.ArrayList"%>
<%@page import="com.ceres.minee.vo.ResultItem"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file = "/WEB-INF/views/header.jsp"%>
<% String keyword =request.getParameter("keyword");
	if(keyword != null){
	session.setAttribute("keyword",keyword);}
	else{
		keyword = (String) session.getAttribute("keyword");}%>
		
		<title>
			<%=keyword%> - Minee 검색 
		</title>
		<link rel="stylesheet" type="text/css" href="resources/css/resultAll.css" />
	</head>
	<body>
		<%@ include file="/WEB-INF/views/resultHeader.jsp" %>
		<div calss="resultAllContainer">
			<ul>
				<c:forEach items="${results }" var="result">
					<li class ="resultItem">
						<a href="${result.url}">
							<dl class = "item_title">
								<dd class= "item_url">
									${result.url }
									</dd>
								<dt class= "item_name">${result.title }</dt>
							</dl>
							<dl class = "item_Info">
								<dd class= "item_desc">${result.dsc }</dd>
								<dd class= "item_date">${result.date }</dd>
							</dl>
						</a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<!-- 페이징 -->
		<%@ include file="/WEB-INF/views/pager.jsp" %>
		<!-- ~페이징 -->
		
	</body>
</html> 