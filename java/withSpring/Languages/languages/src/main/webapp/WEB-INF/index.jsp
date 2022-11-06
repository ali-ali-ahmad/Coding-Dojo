<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container col-6 text-center d-flex flex-row align-items-center">
       	<a href="http://"><c:out value="${language.getName()}"></c:out></a>
		<table class="table table-dark col-6">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Creator</th>
					<th scope="col">Version</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages}" var="language">
				<tr class="align-items-center">
					<td scope="col"><c:out value="${language.getId()}"></c:out></td>
					<td scope="col"><a href="http:/show/${language.id}"><c:out value="${language.getName()}"></c:out></a></td>
					<td scope="col"><c:out value="${language.getCreator()}"></c:out></td>
					<td scope="col"><c:out value="${language.getVersion()}"></c:out></td>
					<td scope="col" class="d-flex justify-content-center">
						<form action="/delete/${language.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete" class="btn btn-danger">
						</form>
						<a href="http:/${language.id}">
							<button type="submit" class="btn btn-warning">Edit</button>
						</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
    	<h3>Add a new language</h3>
        <form:form action="/new" method="post" modelAttribute="language">
            <div class="form-group">
                <form:label path="name">Name</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: Ticket"/>
            </div>
            <div class="form-group">
                <form:label path="creator">Creator</form:label>
                <form:errors path="creator" class="text-danger"/>
                <form:input path="creator" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: Plane Ticket"/>
            </div>
            <div class="form-group">
                <form:label path="version">Version</form:label>
                <form:errors path="version" class="text-danger"/>
                <form:input path="version" class="form-control" id="exampleFormControlInput1" placeholder="ex: 400$"/>
            </div>
                <input type="submit" value="Submit" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>