<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee information</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
					<th>id</th>
					<th>name</th>
					<th>salary</th>
					<th>delete</th>
					<th>update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.name }</td>
					<td>${employee.salary }</td>
					<td><a href="deleteEmp?id=<c:out value="${employee.id}"/>">delete</a></td>
					<td><a href="updateEmp?id=<c:out value="${employee.id}"/>">update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<a href="addEmployee">add employee</a>
</body>
</html>