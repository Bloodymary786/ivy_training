<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ivy employee app</title>
</head>
<body>
	Welcome ${user.username}!
	<br />
	<a href="logout">logout</a>

	<table border="1">
		<thead>
			<tr>
				<th>eid</th>
				<th>name</th>
				<th>salary</th>
				<c:if test="${user.profile=='admin'}">
					<th>delete</th>
					<th>update</th>
				</c:if>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.eid}</td>
					<td><c:out value="${employee.ename}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<c:if test="${user.profile=='admin'}">
						<td><a
							href="empController.do?action=delete&eid=<c:out value="${employee.eid}"/>">delete</a></td>
						<td><a
							href="empController.do?action=update&eid=<c:out value="${employee.eid}"/>">update</a></td>
					</c:if>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>



<a href="empController.do?action=addemp">add new Employee</a>
</html>













