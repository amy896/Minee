<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 결과 컨테이너 시작은 resultHeader.jsp에서 -->

<!-- 페이징 -->
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
<!-- ~페이징 -->

</div>
<!-- ~결과 컨테이너 -->


<!-- 광고 -->
<div class="result_img_ad">
	<img src="${ galleryItem.imgUrl }" />
</div>
<!-- ~광고 -->
