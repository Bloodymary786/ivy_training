<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>account creation page</title>
</head>
<body>
	<form action="account.do" method="POST">
		<table>
			<tr>
				<td>customer name</td>
				<td><input name="name" /></td>
			</tr>
			<tr>
				<td>customer initial opening balance</td>
				<td><input name="balance" /></td>
			</tr>
			<tr>
				<td>customer dob</td>
				<td><input name="dob" /></td>
			</tr>
			<tr>
				<td>address</td>
				<td><textarea name="address" rows="4" cols="50"></textarea></td>
			</tr>
			<tr>
				<td>customer EmailId</td>
				<td><input name="email" /></td>
			</tr>
			<tr>
				<td>select account type</td>
				<th><select name="accountType">
				<option value="saving">saving</option>
				<option value="current">current</option>
			</select></th>
			</tr>
			<tr>
				<td><input type="submit" value="create customer" /></td>
			</tr>
		</table>
	</form>
</body>
</html>