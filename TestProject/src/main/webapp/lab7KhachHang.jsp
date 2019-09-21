<%@page import="com.test.Dao.KhachHangDao"%>
<%@page import="com.test.entity.KhachHang"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello World!</h1>

	<form action="ControllerKhachHang">
		Tên KH: <input type="text" name="txtTenKH" value="" /> <input
			type="submit" name="action" value="Search"> <input
			type="submit" name="action" value="Insert" />
	</form>

	<table border="1">
		<tr>
			<td>MaKH</td>
			<td>HoTen</td>
			<td>MatKhau</td>
			<td>Email</td>
			<td>SoDT</td>
			<td>Action</td>
		</tr>
		<c:forEach var="rows" items="${listKH}">
			<form action="ControllerKhachHang">
				<tr>
					<td>${rows.maKhachHang}</td>
					<td>${rows.hoVaTen}</td>
					<td>${rows.matKhau}</td>
					<td>${rows.email}</td>
					<td>${rows.soDienThoai}</td>
					<td><input type="hidden" name="txtMaKH"
						value="${rows.maKhachHang}" /> <input type="submit" name="action"
						value="Update" /> <input type="submit" name="action"
						value="Delete" /></td>
				</tr>
			</form>
		</c:forEach>
	</table>
</body>
</html>