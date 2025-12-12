<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        text-align: center;
        padding-top: 100px;
    }
    
    form input[type="text"],
form input[type="password"] {
    
    padding: 8px;
    margin-bottom: 16px;   /* 👈 adds space between inputs */
    border: 1px solid #ccc;
    border-radius: 4px;
}
    h3{
    color: red;
    }

	#login {
        display: inline-block;
        padding: 10px 20px;
        background-color: #007bff;
        color: white;
        text-decoration: none;
        border-radius: 6px;
        font-size: 15px;
        transition: background-color 0.3s ease;
    }

    
</style>

</head>
<body>

	<h1>Login Page</h1>
	<h3>${message}</h3>

	<form action="/MySpringMVC/login/validateUser" method="post">
		Username: <input type="text" name="sname" id="un"><br />
		Password: <input type="text" name="pass" id="pass"> <br />
		<button type="submit" name="login" id="login" value="login">Login</button>

	</form>
	<a href="registerme">Register Me ?</a> /
	<a href="#">Forgot Password ?</a>
</body>
</html>