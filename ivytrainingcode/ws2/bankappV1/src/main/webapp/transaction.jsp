<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>transaction</title>
</head>
<body>
<form action="transaction.do" method="POST">
		<table>
			<tr>
				<td>Account Number</td>
				<td><input name="aid" /></td>
			</tr>

			<tr>
				<td>Amount</td>
				<td><input name="amount"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="deposit" name="action"/></td>
				<td><input type="submit" value="withdraw" name="action"/></td>
			</tr>
		</table>
	</form>
</body>
</html>