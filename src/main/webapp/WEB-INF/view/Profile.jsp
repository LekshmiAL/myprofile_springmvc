<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>MyProfile</title>
</head>
<body>
	<h1>Hello ${profile.name}!</h1>
	<br>
	<a href="personal_details">Personal Details</a>
	<br>
  	<a href="contact_details">Contact Details</a>
  	<br>
  	<a href="educational_details">Educational Details</a>
  	<br>
  	<a href="professional_details">Professional Details</a>
</body>
</html>