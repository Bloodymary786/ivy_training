<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update emp</title>
</head>
<body>
	<form action="empController" method="POST">
	<input type="hidden" name="eid" value="${emp.eid}">
		<table>
			<tr>
				<td>Name</td>
				<td><input name="ename" value="${emp.ename}"  readonly/></td>
			</tr>

			<tr>
				<td>Salary</td>
				<td><input name="salary" value="${emp.salary}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
</body>
</html>