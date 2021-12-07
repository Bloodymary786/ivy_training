<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update product</title>
</head>
<body>
<form:form action="addProduct" modelAttribute="product" method="post">
	<form:hidden path="id"/>
    Enter product name : <form:input path="name" disabled="true"/><br/>
    Enter product price : <form:input path="price"/><br/>
    Enter product quantity : <form:input path="quantity"/><br/>
    Enter product category : <form:select path="category" items="${categories}" disabled="true"/><br/>
    Enter product mgt date(dd/mm/yyyy) : <form:input path="mgtDate" disabled="true"/><br/>
    <input type="submit">
</form:form>
</body>
</html>