<%@page import="com.test.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.test.model.Products"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shop</title>
</head>
<body>
	<h1>Products</h1>
	<table border="1">
		<tr>
			<td>Ma SP</td>
			<td>Ten SP</td>
			<td>Gia</td>
		</tr>

		<%
			Products listSP = new Products();
			List<Product> list = listSP.showProduct("");
			for (Product pr : list) {
				out.print("<form action=\"ControllerCartBean\">");
				out.print("<tr><td>" + pr.getCode() + "</td><td>" + pr.getName() + "</td>" + "<td>" + pr.getPrice()
						+ "</td><td><input type=\"submit\" " + "value=\"Add to cart\" name=\"action\" /></td>"
						+ "<input type=\"hidden\" name=\"txtCode\" value='" + pr.getCode() + "'>"
						+ "<input type=\"hidden\" name=\"txtName\" value='" + pr.getName() + "'>"
						+ "<input type=\"hidden\" name=\"txtPrice\" value='" + pr.getPrice() + "'></tr>");
				out.print("</form>");
			}
		%>

	</table>

	<form action="ControllerCartBean">
		<input type="submit" value="View Cart" name="action" />
	</form>
</body>
</html>