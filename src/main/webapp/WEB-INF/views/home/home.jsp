<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ include file = "/WEB-INF/views/common/header.jsp"%>
<title>Minee</title>
<link rel="stylesheet" type="text/css" href="resources/css/common/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/home/home.css" />
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<script type="text/javascript">

</script>

</head>
<body>

	<div class="home_container">
	
		<div class="search_container">
			<img class="home_logo" alt="Minee LOGO"
				src="../resources/img/home/mainLogo.png">

			<form class="search_form" action="search" method="get"
				id="searchForm">
				<input type="text" name="keyword" id="keyword"
					placeholder="Minee 검색">
				<button class="search_btn"></button>
			</form>
		</div>

		<img alt="Minee LOGO" src="http://placehold.it/728x90" class="ad">
		
	</div>
	
</body>
</html>
