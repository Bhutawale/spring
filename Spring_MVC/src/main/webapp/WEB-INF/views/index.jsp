<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Home Page</h1>
<h2>Called by Home Controller</h2>
<h3>url /home</h3>
<%
String name=(String)request.getAttribute("name");
%>
<h1>Name is: <%=name%></h1>

<%
List<String> l1=(List<String>) request.getAttribute("f");
%>

<h1> Friends List is: 
	<% for(String s:l1)
		{
		out.println(s);	
	
		}
	%>
</h1>

</body>
</html>