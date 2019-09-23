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
	<h1>Result</h1>
	<c:set var="infor" value="${requestScope.INFO}" />
	<c:if test="${not empty infor}">
		<c:forEach var="user" items="${infor}">
			Username: ${user.name}<br />
			Detail:<br />
			<table border="1">
				<thead>
					<tr>
						<th>No.</th>
						<th>Address</th>
						<th>Phone</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:set var="count" value="0" />
					<c:forEach var="rows" items="${user.lstAddress}">
						<form action="Lab8Controller">
							<c:set var="count" value="${count+1}" />
							<input type="hidden" value="${user.userID}" name="txtUserID" />
							<tr>
								<td>${count}<input type="hidden" name="txtID1"
									value="${rows.addrID}" />
								</td>
								<td><input type="text" name="txtAddrName1"
									value="${rows.addrName}" /></td>
								<td><input type="text" name="txtPhone1"
									value="${rows.phoneNo}" /></td>
								<td><input type="hidden" name="txtSearch"
									value="${param.txtUsername}" /> <input type="submit"
									value="Update" name="action" /></td>
								<c:url var="delete" value="Lab8Controller">
									<c:param name="action" value="Delete" />
									<c:param name="txtID1" value="${rows.addrID}" />
									<c:param name="txtSearch" value="${parram.txtUsername}" />
								</c:url>
								<td><a href="${delete}">Delete</a></td>
							</tr>
						</form>
					</c:forEach>
				</tbody>
			</table>
		</c:forEach>
	</c:if>
</body>
</html>