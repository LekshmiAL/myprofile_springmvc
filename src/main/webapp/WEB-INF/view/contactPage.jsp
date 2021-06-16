<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Contact details</title>
</head>
<body>
	<h2>Mobile number : ${profile.mobNum}</h2>
	<h2>Mail id : ${profile.email}</h2>
	<br>
	<a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>