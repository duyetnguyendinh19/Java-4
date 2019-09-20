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
	<h1>Calculator</h1>
	<form>
		So 1: <input name="txtNum1" value="${param.txtNum1}" /><br/>
		So 2: <input name="txtNum2" value="${param.txtNum2}" /><br/>
		<input type="submit" value="Cộng" />
		<h1>Tổng 2 số: ${param.txtNum1 + param.txtNum2}</h1> 
	</form>
</body>
</html>