<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<form action="trial" method="post">
<table>
<tr><td>ID :</td><td><input type="text" name="staff_id"></td></tr>
<tr><td>Class Tutor :</td><td><input type="text" name="tutorname"></td></tr>
<tr><td>Class Section :</td><td><input type="text" name="classsection"></td></tr>
<tr><td>Year :</td><td><input type="text" name="dept_year"></td></tr>
<tr><td>Department :</td><td><input type="text" name="department"></td></tr>
<tr><td>Course :</td><td><input type="text" name = "course"></td></tr>
<tr><td>User Name :</td><td><input type="text" name="username"></td></tr>
<tr><td>Password :</td><td><input type="password" name="passwd"></td></tr>
<tr><td>Confirm Password :</td><td><input type="password"></td></tr>
<tr><td colspan="2"><input type="submit" value="SignIn"></td></tr>
</table>
</form>
</body>
</html>