<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div class="top_area">

	<div class="logo_wrap">
		<img alt="Minee LOGO" src="../resources/img/resultLogo.png">
	</div>

	<form class="search_wrap" action="search" method="get" id="searchForm">
		<input type="text" class="keywordStr" name="keyword"placeholder="Minee 검색"> 
		<i class="fas fa-search search_btn"></i>
	</form>
	
</div>
	
<div class="tab_container">
	<button calss="tab_btn" onclick="location.href='/resultAll'">통합</button>
	<button calss="tab_btn" onclick="location.href='/resultImage'">이미지</button>
	<button calss="tab_btn" onclick="location.href='/resultVideo'">비디오</button>
	<form class="selectPeroid" action="#">
		<select name="period">
			<option value="allTime">모든시간</option>
			<option value="aDayAgo">지난 1일</option>
			<option value="aWeekAgo">지난 1주</option>
			<option value="aMonthAgo">지난 1달</option>
			<option value="aYearAgo">지난 1년</option>
		</select>	
	</form>
</div>