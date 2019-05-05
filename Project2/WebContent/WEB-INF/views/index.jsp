<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="hello" method="post">
<table><tr><td>ID :</td><td><input type="text" name="staff_id"></td></tr>
<tr><td>Password :</td><td><input type="password" name="passwd"></td></tr>
<tr><td colspan="2"><input type="submit" value="login"></td></tr></table></form>
<h1><a href="newuser">New User?</a></h1>
<h1 color="red">${msg}</h1>
</body>
</html>