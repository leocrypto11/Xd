<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
