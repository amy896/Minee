<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" type="text/css" href="resources/css/pager.css" />
<!DOCTYPE html>
<div class="pager">
	<ul>

		<c:if test="${ pager.currentPage > 10 }">
			<li><a href="?keyword=${ keyword }&page=${ pager.firstNumOfBlock - 1 }">◀</a></li>
		</c:if>

		<c:forEach var="i" begin="${ pager.firstNumOfBlock }"
			end="${ pager.lastNumOfBlock }">
			<c:if test="${ i <= pager.lastPageNum }">

				<c:choose>
					<c:when test="${ i == pager.currentPage }">
						<li class="selected">${ i }</li>
					</c:when>
					<c:otherwise>
						<li><a href="?keyword=${ keyword }&page=${ i }">${ i }</a></li>
					</c:otherwise>
				</c:choose>

			</c:if>
		</c:forEach>

		<c:if test="${ pager.lastPageNum > pager.lastNumOfBlock }">
			<li><a href="?keyword=${ keyword }&page=${ pager.lastNumOfBlock + 1 }">▶</a></li>
		</c:if>

	</ul>
</div>
