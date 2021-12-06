<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add emp</title>
</head>
<body>
<form:form action="addEmployee" modelAttribute="employee" method="post">
	<form:hidden path="id"/>
    Enter name : <form:input path="name"/><br/>
    Enter salary : <form:input path="salary"/><br/>
    <input type="submit">
</form:form>
</body>
</html>
