<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("user")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h3>Admin Page</h3>

<a href="UserDetails">records</a>

<ul>
    <c:forEach items="${userlist}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>