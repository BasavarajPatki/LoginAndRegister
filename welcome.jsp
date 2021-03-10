<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

if(session.getAttribute("user")==null)
{
	response.sendRedirect("login.jsp");
}
%>

<h2>Welcome to ${ user }</h2>

<br>
<hr>
<div class="container">
<a href="welcome.jsp">Home</a>
<a href="about.jsp">About us</a>
<a href="admin.jsp">Admin</a>

<form action="logout">
<br>
<input type="submit" value="Logout">
</form>


</div>

</body>
</html>