<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 600px;
	margin: 50px auto;
}

body {
	font-family: 굴림체;
}

table {
	width: 500px;
	border-collapse: collapse;
}

table td:nth-child(1) {
	background-color: #eee;
}

td {
	padding: 5px;
	border: 1px solid lightgray;
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

		<h1>조회</h1>
		<a href="edit?id=${ board.id }" clsss="btn">수정</a>
		<table>
			<tr>
				<td>글 번호</td>
				<td>${ board.id }</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${ board.user }</td>
			</tr>
			<tr>
				<td>최근 작성날짜</td>
				<td>${ board.modifiedTime }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${ board.title }</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>${ board.body }</td>
			</tr>
		</table>
		<a href="list" class="btn">목록으로</a> 
		<a href="delete?id=${board.id}"
			class="btn" onclick="return confirm('삭제하시겠습니까?')">삭제</a>

	</div>
</body>
</html>

