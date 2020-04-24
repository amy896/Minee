<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="resources/css/common/reset.css" />
<link rel="stylesheet" type="text/css" href="resources/css/result/resultHeader.css" />

<div class="container">
	<div class="search_container">

		<a href= "/">
			<img alt="Minee LOGO" src="../resources/img/result/resultLogo.png">
		</a>
		<form class="search_form" action="search" method="get">
			<input type="text" name="keyword" placeholder="Minee 검색" value="${ keyword }">
			<button class="search_btn"></button>
		</form>
	</div>
	
	<div class="tab_container">
		<button class="tab_btn" onclick="location.href='/resultAll?keyword=${ keyword }&page=1'">통합</button>
		<button class="tab_btn" onclick="location.href='/resultImage?keyword=${ keyword }&page=1'">이미지</button>
		<button class="tab_btn" onclick="location.href='/resultVideo?keyword=${ keyword }&page=1'">비디오</button>
		<select name="period" class="select_period">
			<option selected="selected" value="allTime">모든시간</option>
			<option value="aDayAgo">지난 1일</option>
			<option value="aWeekAgo">지난 1주</option>
			<option value="aMonthAgo">지난 1달</option>
			<option value="aYearAgo">지난 1년</option>
		</select>
	</div>
</div>
<div class="line"></div>


<!-- 결과 컨테이너 -->
<div class="result_container">
<!-- 결과 컨테이너 끝은 common.jsp에서 -->
