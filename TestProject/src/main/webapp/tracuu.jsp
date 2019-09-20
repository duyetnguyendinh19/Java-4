<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tra cuu</title>
</head>
<body>
	<h1>Danh bạ điện thoại</h1>
	<form action="SearchAccountController">
		Nhập tên thuê bao: <input type="text" name="txtThueBao" value="" /><br/>
		Nhập số điện thoại: <input type="text" name="txtSoDT" value="" /><br/>
		Địa chỉ: <input type="text" name="txtDiaChi" value="" /><br/>
		<input type="submit" name="Submit" value="Tra cứu" />
	</form>
</body>
</html>