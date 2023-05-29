<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Congratulations!!</h1>

	<h2>Details submitted by you</h2>

	<table>
		<tr>

			<td>Student Name</td>
			<td>${student1.studentName }</td>

		</tr>
		<tr>
			<td>Student Hobby</td>
			<td>${student1.studentHobby }</td>

		</tr>
	</table>

</body>
</html>