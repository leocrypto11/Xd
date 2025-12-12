<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Page</h1>
	<h3>${message}</h3>

	<form action="/MySpringMVC/login/validate" method="post">
		Username: <input type="text" name="uname" id="un"><br />
		Password: <input type="text" name="pass" id="pass"> <br />
		<button type="submit" name="login" id="login" value="login">Login</button>

	</form>
	<a href="registerme">Register Me ?</a> /
	<a href="#">Forgot Password ?</a>
</body>
</html>