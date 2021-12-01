<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="account.do" method="POST">
		<table>
			<tr>
				<td>customer name</td>
				<td><input name="name" /></td>
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
				<td>Opening Balance</td>
				<td><input name="balance" /></td>
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