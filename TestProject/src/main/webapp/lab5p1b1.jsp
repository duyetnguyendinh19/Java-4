<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL Expression</h1>
	<table border="1">
		<tr>
			<td>Concept</td>
			<td>Expression</td>
			<td>Result</td>
		</tr>
		<tr>
			<td>Cộng</td>
			<td>${"${"}5+5}</td>
			<td>${5+5}</td>
		</tr>
		<tr>
			<td>Trừ</td>
			<td>${"${"}5-5}</td>
			<td>${5-5}</td>
		</tr>
		<tr>
			<td>Nhân</td>
			<td>${"${"}5*5}</td>
			<td>${5*5}</td>
		</tr>
		<tr>
			<td>Chia</td>
			<td>${"${"}5/5}</td>
			<td>${5/5}</td>
		</tr>
	</table>
</body>
</html>