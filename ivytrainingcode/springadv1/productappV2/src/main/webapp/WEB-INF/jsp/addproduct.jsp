<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="addProduct" modelAttribute="product" method="post">
		<form:hidden path="id" />
		<table>
			<tr>
				<td>Enter product name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter product price :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Enter product quantity :</td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td>Enter product category :</td>
				<td><form:select path="category" items="${categories}" /></td>
			</tr>
			<tr>
				<td>Enter product mgt date(dd/mm/yyyy) :</td>
				<td><form:input path="mgtDate" /></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>