<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Cart</title>
</head>
<body>

	<h1>Your Shopping Cart</h1>
	<c:set var="shop" value="${sessionScope.SHOP}" />
	<c:if test="${not empty shop}">
		<table border="1">
			<thead>
				<tr>
					<td>No.</td>
					<td>Code</td>
					<td>Name</td>
					<td>Price</td>
					<td>Quantity</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>
				<form action="ControllerCartBean">
					<c:set var="count" value="0"></c:set>
					<c:forEach var="rows" items="${shop}">
						<c:set var="count" value="${count+1}"></c:set>
						<tr>
							<td>${count}</td>
							<td>${rows.value.product.code}</td>
							<td>${rows.value.product.name}</td>
							<td>${rows.value.product.price}</td>
							<td>${rows.value.quantity}</td>
							<td><input type="checkbox" name="rmv"
								value="${rows.value.product.code}" /></td>
						</tr>
					</c:forEach>
					<tr>
						<c:url var="add" value="ControllerCartBean">
							<c:param name="action" value="Add More"></c:param>
						</c:url>
						<td colspan="2"><a href="${add}">AddMore</a></td>
						<td><input type="submit" value="Remove" name="action"></td>
					</tr>
				</form>
			</tbody>
		</table>
	</c:if>
</body>
</html>