<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

h3 {
	font-weight: bold;
	margin-bottom: 20px;
	padding: 10px;
	border-radius: 6px;
}

}
form {
	background: #fff;
	padding: 25px 35px;
	border-radius: 8px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
	width: 350px;
}

form h2 {
	text-align: center;
	margin-bottom: 20px;
	color: #333;
}

label {
	display: block;
	margin-bottom: 6px;
	font-weight: bold;
	color: #555;
}

input[type="text"], input[type="date"] {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 6px;
	font-size: 15px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

button:hover {
	background-color: #0056b3;
}
</style>

</head>
<body>
	<h3>Edit Subject</h3>

	<form action="/MySpringMVC/subject/updatesubject" method="post">
		Subject Id : <input type="text" name="sid" id="sid"
			value="${subj.sid}" readonly><br> Subject Name : <input
			type="text" name="subname" id="subname" value="${subj.subname}"><br>
		Subject Duration : <input type="text" name="duration" id="duration"
			value="${subj.duration}"><br> Subject Startdate : <input
			type="date" name="startdate" id="startdate" value="${subj.startdate}"><br>
		<button type="submit" name="btn" id="update" value="update">Update
			Subject</button>

	</form>
</body>
</html>