<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Show Dojo</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<a href="http:/">
		<button type="submit" class="btn btn-warning">Home Page</button>
	</a>
	<h3>Dojo: <c:out value="${dojos.name}"></c:out> Ninja's</h3>
	<div class="container col-6 text-center d-flex flex-row align-items-center">
		<table class="table table-dark col-6">
			<thead>
				<tr>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Age</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojos.ninjas}" var="ninja">
				<tr class="align-items-center">
					<td scope="col"><c:out value="${ninja.firstName}"></c:out></td>
					<td scope="col"><c:out value="${ninja.lastName}"></c:out></td>
					<td scope="col"><c:out value="${ninja.age}"></c:out></td>
					<td scope="col" class="d-flex justify-content-center">
						<form action="/deleteNinja/${ninja.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete" class="btn btn-danger">
						</form>
						<a href="http:/editNinja/${ninja.id}">
							<button type="submit" class="btn btn-warning">Edit</button>
						</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>