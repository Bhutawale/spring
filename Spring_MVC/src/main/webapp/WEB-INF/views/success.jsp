<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
<h1>User Name:- ${user.userName }</h1>
<h2>Email :- ${user.email }</h2>
<h2>Password:- ${user.password }</h2>

<%-- <h1> <% String name=(String)request.getAttribute("userName");%> --%>
<%-- 		<% String email=(String)request.getAttribute("email");%> --%>
<%-- 		<% String password=(String)request.getAttribute("password");%> --%>
	
<%-- 	Email: <%= email %> --%>
<%-- 	User Name: <%= name %> --%>
<%-- 	Password: <%=password%> --%>
<!-- </h1> -->

</body>
</html>