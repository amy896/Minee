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
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>

<script type="text/javascript">

function keywordSearch() {
	var keyword = $(".keywordStr").val();
	if(keyword == ""){
		confirm("검색어를 입력해주세요!");
	}else{
		confirm(keyword);

		$.ajax({
			url : "/search",
			data : {"keyword":keyword},
			type : "get",
			dataType : "json"
		});
		return false;
	}
}




</script>

</head>
<body>
	<div class="wrap">
	
		<div class="logo_wrap">
			<img alt="Minee LOGO" src="http://placehold.it/500x90">
		</div>

		<div class="search_wrap">
			<input type="text" class="keywordStr"> 
			 <a href="" onclick="keywordSearch();"><i class="fas fa-search search_btn"></i></a>
		</div>
		
		<div class="ad_wrap">
			<img alt="Minee LOGO" src="http://placehold.it/728x90">
		</div>

	</div>
</body>
</html>
