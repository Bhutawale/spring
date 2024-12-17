<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is Help Page</h1>
<h1>
	<%
		String name=(String)request.getAttribute("name");
	
		String city=(String)request.getAttribute("city");
		
		LocalDateTime lt=(LocalDateTime)request.getAttribute("time");
	%>
</h1>
	<h2>
		Name is 
		<%=name %>
 	
		<br>
		City is <%=city %>
	</h2>


	<h1>
		Time is <%=lt  %>
	</h1>

</body>
</html>