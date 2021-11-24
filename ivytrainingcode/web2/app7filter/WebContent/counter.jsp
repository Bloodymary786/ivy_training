<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page import="java.util.*, java.sql.*" language="java"  %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int counter=0; %>	<!--  decleration tag -->

<!--  expression tag -->
<%=counter++ %>

<!--  scriptet tag -->
<%
	counter++;
	out.print(counter);
%>
</body>
</html>