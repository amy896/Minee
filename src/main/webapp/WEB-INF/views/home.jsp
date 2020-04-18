<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String contextPath = request.getContextPath();
	request.setAttribute("contextPath", contextPath);
%>
<%@ page session="false"%>
<html>
<head>
<title>Minee</title>
<link rel="stylesheet" type="text/css" href="resources/css/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/home.css" />
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
</head>
<body>
	<div class="wrap">
	
		<div class="logo_wrap">
			<img alt="Minee LOGO" src="http://placehold.it/500x90">
		</div>

		<form class="search_wrap" action="search" method="get" id="searchForm">
			<input type="text" class="keywordStr" name="keyword" placeholder="Minee 검색"> 
			<i class="fas fa-search search_btn"></i>
		</form>

		<div class="ad_wrap">
			<img alt="Minee LOGO" src="http://placehold.it/728x90">
		</div>

	</div>
</body>
</html>
