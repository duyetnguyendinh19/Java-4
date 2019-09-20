<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Method Declartion</title>
</head>
<body>
	<%!int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}%>
	
	<%="Result is: " + sum(10, 40, 50) %>
</body>
</html>