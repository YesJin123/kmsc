<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<jsp:include page="/WEB-INF/views/common/header.jsp"/>
<section id="board-container">
	<table class="table ">
	<h1>게시글 작성내용</h1>
		<tr>
			<th>번호</th>
			<td><input class = "form-control" 
			type="text" name="boardNo"
			value="${board.boardNo }" readonly></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input class = "form-control" 
			type="text" name="boardTitle"
			value="${board.boardTitle }"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input class = "form-control" 
			type="text" name="boardWriter"
			value="${board.boardWriter }" readonly></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea class="form-control">
			${board.boardContent }</textarea></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.boardDate }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.boardReadCount }</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align:center;">
				<button class="btn btn-outline-primary">수정하기</button>
				<button class="btn btn-outline-danger">삭제하기</button>
			</td>
		</tr>
	</table>
</section>
<jsp:include page="/WEB-INF/views/common/footer.jsp"/>