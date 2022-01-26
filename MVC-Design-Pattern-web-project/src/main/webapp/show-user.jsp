<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
<h1 align="center">User List</h1>
<table border="1" cellpadding="30%" align="center" bordercolor="red">
	<tr>
		<th>ID</th>
		<th>User name</th>
		<th>Email</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Phone number</th>
	</tr>
 <c:forEach var="user" items="${userItems}">
	 <tr> 
		 <td>${user.id}</td>
		 <td>${user.username}</td>
		 <td>${user.email}</td>
		 <td>${user.first_name}</td>
		 <td>${user.last_name}</td>
		 <td>${user.phone_number}</td>
	 </tr>
 
 </c:forEach>
 
 </table>
</body>
</html>