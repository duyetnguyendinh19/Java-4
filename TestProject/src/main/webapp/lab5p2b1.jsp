<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Load Data</h1>
	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test" user="root" password="123456"
		var="con" />
	<sql:query var="rs" dataSource="${con}">
		SELECT * FROM REGISTRATION
	</sql:query>
	<table border="1">
		<tr>
			<td>No.</td>
			<td>Username</td>
			<td>Password</td>
			<td>LastName</td>
		</tr>
		<c:set var="count" value="0" />
		<c:forEach var="dong" items="${rs.rows}">
			<tr>
				<c:set var="count" value="${count+1}" />
				<td>${count}</td>
				<td>${dong.username}</td>
				<td>${dong.password}</td>
				<td>${dong.lastname}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>