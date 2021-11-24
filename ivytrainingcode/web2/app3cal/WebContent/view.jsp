<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>the result of calculation</title>
</head>
<body>

<%
		Integer val=(Integer)request.getAttribute("sum");
		out.print("result of calculation is :"+val +"<br/>");
%>
<a href="cal.jsp">want more calculation ?</a>


</body>
</html>