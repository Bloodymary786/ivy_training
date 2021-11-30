<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Date from:
	<br />
	<form action="statement.do" method="POST">
		<table>
			<tr>
				<td>From date: </td>
				<td><input name="fromDate" /></td>
			</tr>

			<tr>
					<td>To date: </td>
				<td><input name="toDate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="search records" /></td>
			</tr>
		</table>
	</form>
	<br />
	<br />
	<table border="1">
		<thead>
			<tr>
				<th>tid</th>
				<th>txdate</th>
				<th>cid</th>
				<th>amount</th>
				<th>optype</th>

			</tr>
		</thead>
		<tbody>

			<c:forEach items="${transactions}" var="transaction">
				<tr>
					<td>${transaction.tid}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy"
							value="${transaction.txdate}" /></td>
					<td><c:out value="${transaction.cid}" /></td>
					<td><c:out value="${transaction.amount}" /></td>
					<td><c:out value="${transaction.optype}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</body>
</html>