<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<link rel="shortcut icon" href="4.png">
</head>
<body >
<div class="container">
<form action="Register" method="post">

<table>
<h1>Sign In</h1>
<tr><td>UserName:</td><td><input type="text" name="uname"></td></tr>
<tr><td>Password:</td><td><input type="password" name="password" required ></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
<tr><td>Contact:</td><td><input type="text" name="contact"></td></tr>
<tr><td></td><td><input type="submit" value="Register"></td></tr>
</table>
</form>
</div>
</body>
</html>