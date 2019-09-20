<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (3 > 5) {
	%>
	<h3>Hi</h3>
	<%
		} else{
	%>
	<h3>number value should not be less than 6</h3>
	<%
		}
	%>
</body>
</html>