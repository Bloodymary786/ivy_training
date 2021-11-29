<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
${param.error }<br/>
<form action="LoginController" method="POST">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
</tr>


		</table>
	</form>
	<a href="UserController">add new User</a>
</body>
</html>