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
	<form>
		Username: <input type="text" name="txtUsername" value="" /><br />
		Password: <input type="password" name="txtPassword" value="" /><br />
		Lastname: <input type="text" name="txtLastName" value="" /><br /> <input
			type="submit" value="Insert" name="action" />
	</form>
	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test" user="root" password="123456"
		var="con" />
	<c:if test="${not empty param.txtUsername}">
		<sql:update dataSource="${con}">
		INSERT INTO REGISTRATION(username,password,lastname) VALUES(?,?,?)
		<sql:param value="${param.txtUsername}" />
			<sql:param value="${param.txtPassword}" />
			<sql:param value="${param.txtLastName}" />
		</sql:update>
	</c:if>
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