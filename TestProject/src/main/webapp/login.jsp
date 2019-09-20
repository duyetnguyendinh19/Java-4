<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="Controller" method="post">
		Username <input type="text" name="txtUsername" value="" /><br/>
		Password <input type="password" name="txtPass" value="" /><br/>
		<input type="submit" value="Login" name="btnAction" />
		<input type="reset" value="Reset">
	</form>
</body>
</html>