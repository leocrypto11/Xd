<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<h1>${message}</h1>
	<table border='4'>
		<tr>
			<th>Subject id</th>
			<th>Subject Name</th>
			<th>Duration</th>
			<th>StartDate</th>

			<th>action</th>
		</tr>
		<c:forEach var="sub" items="${sublist}">
			<tr>
				<td>${sub.sid}</td>
				<td>${sub.subname}</td>
				<td>${sub.duration}</td>
				<td>${sub.startdate}</td>
				<td><a href="deletesubject/${sub.sid}">delete</a>/<a
					href="editsubject/${sub.sid}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="addsubject">Add new Subject</a>

</body>

</html>
