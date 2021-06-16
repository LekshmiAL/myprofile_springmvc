<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body>
	<h2>DOB : ${profile.dob}</h2>
	<h2>Age : ${profile.age}</h2>
	<br>
	<a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>