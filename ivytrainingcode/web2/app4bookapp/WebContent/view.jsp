<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book choice for you!</title>
</head>
<body>
<%
	List<String>list=(List<String>)request.getAttribute("booklist");
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		out.print(it.next()+"</br>");
	}

	%>

</body>
</html>