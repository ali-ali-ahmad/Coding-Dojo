<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Add Project</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="d-flex justify-content-around">
		<h1>Create project</h1>
		<a href="/projects">
			<button type="submit" class="btn btn-success">Home</button>
		</a>
	</div>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center border border-secondary">
        <form:form action="/newProject" method="post" modelAttribute="project">
		<form:input type="hidden" path="user" value="${user.id}"/>
            <div class="form-group">
                <form:label path="title">Title</form:label>
                <form:errors path="title" class="text-danger"/>
                <form:input path="title" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Annual Report"/>
            </div>
            <div class="form-group">
                <form:label path="description">Description</form:label>
                <form:errors path="description" class="text-danger"/>
                <form:input path="description" type="text" class="form-control" id="exampleFormControlInput1"/>
            </div>
            <div class="form-group">
                <form:label path="dueDate">Due Date</form:label>
                <form:errors path="dueDate" class="text-danger"/>
				<form:input path="dueDate" type="date" class="form-control" id="exampleFormControlInput1"/>
            </div>
                <input type="submit" value="Create" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>