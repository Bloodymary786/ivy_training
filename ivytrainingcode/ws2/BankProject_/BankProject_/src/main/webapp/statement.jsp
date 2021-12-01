<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>!!!!Please select Dates!!!!</h3>

<Form action="statement.do" method="POST">

<table>
            <tr>
				<td>From</td>
				<td><input name="sDate" /></td>
			</tr>
			
			<tr>
				<td>To</td>
				<td><input name="eDate" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>


</table>

</Form>

</body>
</html>