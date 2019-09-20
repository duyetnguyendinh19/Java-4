<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="calcu" class="com.test.model.Lab4Bean"></jsp:useBean>
	<jsp:setProperty property="*" name="calcu" />
	
	<h1>Ket qua: </h1>
	Tong hai so: <jsp:getProperty property="sum" name="calcu"/>
</body>
</html>