<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 900px;
	margin: 50px auto;
}

thead th {
	background-color: #eee;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	padding: 4px;
	border: 1px solid lightgray;
}

td:nth-child(4) {
	text-align: center;
}

.btn {
	padding: 0.4em 1em;
	border: 1px solid gray;
	border-radius: 0.5em;
	background: linear-gradient(#fff, #ddd);
	text-decoration: none;
	color: black;
	display: inline-block;
}


</style>
</head>
<body>
	<div class="container">
		<h1>글 목록</h1>
		<a href="create" class="btn">글 작성</a>
		
		
		
		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>no</th>
					<th>닉네임</th>
					<th>제목</th>
					<th>최종 수정일시</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${ boards }">
					<tr>
						<td>${ board.id }</td>
						<td>${ board.user }</td>
						<td><a href='/board/detail?id=${board.id}'>${ board.title }</a></td>
						<td>${ board.modifiedTime }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>

