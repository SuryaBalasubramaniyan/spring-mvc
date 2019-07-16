<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display page</title>
</head>
<body>
<h2>Employees</h2>
<table border="1" >
<tr>
	<th>Emp Id</th>
	<th>name</th>
	
	</tr>
	<c:forEach items="${emplist}" var="employee" >
	<tr>
	<td>${employee.id }</td>
	<td>${employee.name }</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>