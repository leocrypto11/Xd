<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 20px;
        text-align: center;
    }

    h1 {
        color: #333;
        margin-bottom: 20px;
    }

    table {
        margin: 0 auto;
        border-collapse: collapse;
        width: 80%;
        background-color: #fff;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    }

    th, td {
        padding: 12px 15px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #007bff;
        color: white;
        text-transform: uppercase;
        letter-spacing: 0.05em;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    a {
        color: #007bff;
        text-decoration: none;
        margin: 0 5px;
    }

    a:hover {
        text-decoration: underline;
    }

    .add-btn {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #28a745;
        color: white;
        border-radius: 6px;
        text-decoration: none;
        transition: background-color 0.3s ease;
    }

    .add-btn:hover {
        background-color: #218838;
    }
</style>

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