<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Professional Details</title>
</head>
<body>
	<h1>PROFESSIONAL DETAILS</h1>
	<br>
	<h2>Current Company : ${profile.currentCompanyName}</h2>
	<h2>ex-Company Name : ${profile.exCompanyNames}</h2>
	<br>
	<a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>