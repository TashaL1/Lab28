<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous">
</head>
<body>
<h1>Weather</h1>
	<table>
		<tr>
			<th>Location</th>
			<th>Time</th>
			<th>Data</th>
			<th></th>

		</tr>
		<c:forEach var="w" items="${weather}">
			<tr>
				<td>${w.operationalMode}</td>
				<td>${w.time }</td>
				<td>${w.data }</td>
				<td>${w.currentobservation }</td> 

			</tr>
		</c:forEach>
	</table>

</body>
</html>