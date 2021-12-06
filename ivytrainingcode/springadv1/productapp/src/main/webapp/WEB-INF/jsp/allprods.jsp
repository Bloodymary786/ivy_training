<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Store application</title>
</head>
<body>

<table border="1">
		<thead>
			<tr>
					<th>Product Id</th>
					<th>Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category</th>
					<th>mgt Date</th>
					<th>delete</th>
					<th>update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.price }</td>
					<td>${product.quantity }</td>
					<td>${product.category }</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${product.mgtDate}" /></td>
					<td><a href="deleteProduct?id=<c:out value="${product.id}"/>">delete</a></td>
					<td><a href="updateProduct?id=<c:out value="${product.id}"/>">update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<a href="addProduct">add Product</a>
</body>
</html>