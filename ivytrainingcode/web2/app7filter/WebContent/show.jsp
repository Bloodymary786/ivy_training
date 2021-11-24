<%@page import="com.demo.Dog"%>
<%@page import="com.demo.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.demo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
</head>
<body>
	${person.dog.dogName}
	<table border="1">
		<thead>
			<tr>
				<th>eid</th>
				<th>name</th>
				<th>salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.eid}</td>
					<td><c:out value="${employee.ename}"/></td>
					<td><c:out value="${employee.salary}"/></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>




















