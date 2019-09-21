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
	<form action="ControllerKhachHang" method="post">
		Mã Khách Hàng: <input type="text" name="txtMaKH"
			value="${kh.maKhachHang}" /><br /> Họ Và Tên: <input type="text"
			name="txtHoTen" value="${kh.hoVaTen}" /><br /> Email: <input
			type="text" name="txtEmail" value="${kh.email}" /><br /> Mật Khẩu: <input
			type="password" name="txtPass" value="${kh.matKhau }" /><br /> Số
		Điện Thoại: <input type="text" name="txtSDT" value="${kh.soDienThoai}" /><br />
		<input type="submit" name="action" value="Save" />
		<input type="reset" value="Reset" />
	</form>
</body>
</html>