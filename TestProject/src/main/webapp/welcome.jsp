<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<font color="red">Welcome, ${sessionScope.USER}</font>
	<h1>Welcome to MVC</h1>
	<form action="Controller">
		Name <input type="text" name="txtSearch" value="" /><br /> <input
			type="submit" value="Search" name="btnAction" />
	</form>
</body>
</html>