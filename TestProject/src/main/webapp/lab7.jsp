<%@page import="com.test.Dao.KhachHangDao"%>
<%@page import="com.test.entity.KhachHang"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Khách Hàng</h1>
	<table border="1">
		<tr>
			<td>MaKH</td>
			<td>HoTen</td>
			<td>MatKhau</td>
			<td>Email</td>
			<td>SoDT</td>
		</tr>

		<%
			List<KhachHang> lst = KhachHangDao.layDanhSachKH("");
			for (KhachHang kh : lst) {
				out.print(
						"<tr><td>" + kh.getMaKhachHang() + "</td><td>" + kh.getHoVaTen() + "</td><td>" + kh.getMatKhau()
								+ "</td><td>" + kh.getEmail() + "</td><td>" + kh.getSoDienThoai() + "</td></tr>");
			}
		%>
	</table>
</body>
</html>