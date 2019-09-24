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
	<h1>Tìm kiếm sách</h1>
	<form action="Lab8Controller1">
		<input type="text" name="txtSearch" value="" /> <input type="submit"
			name="action" value="Search" />
		<c:if test="${not empty lst}">
			<table border="1">
				<tr>
					<td>Mã sách</td>
					<td>Tên sách</td>
					<td>Giá</td>
					<td>Số lượng</td>
					<td>Tác giả</td>
				</tr>


				<c:forEach var="lst" items="${lst}">
					<tr>
						<td>${lst.maSach}</td>
						<td>${lst.tenSach}</td>
						<td>${lst.gia}</td>
						<td>${lst.soLuong}</td>
						<td>${lst.tacGia.tenTG}</td>
					</tr>
				</c:forEach>

			</table>
		</c:if>
	</form>
</body>
</html>