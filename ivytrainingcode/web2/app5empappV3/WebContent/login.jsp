<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${param.error }<br/>
	${param.message }<br/>
	
	<form action="login" method="POST">
		<table>
			<tr>
				<td>UserName</td>
				<td><input name="username" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>