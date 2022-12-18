<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
	span {
		display: inline-block;
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	<div align="center">
		<h2>Registration Succeeded!</h2>
		<span>Full name:</span><span>${user1000.name}</span><br/>
		<span>E-mail:</span><span>${user1000.email}</span><br/>
		<span>SSN:</span><span>${user1000.ssn}</span><br/>
	</div>
</body>
</html>