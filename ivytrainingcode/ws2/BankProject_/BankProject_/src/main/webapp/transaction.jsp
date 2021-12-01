<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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