<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit Page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center mt-5">
	    <div class="row">
			<h3 class="col-7">Edit Language</h3>
			<a href="http:/" class="col">
				<button type="submit" class="btn btn-primary">Go back</button>
			</a>
	    </div>
        <form:form action="/${language.id}/edit" method="post" modelAttribute="language">
            <input type="hidden" name="_method" value="put">
            <input type="hidden" name="language_id" value="${language.getId()}">
            <div class="form-group">
                <form:label path="name">Name</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
            <div class="form-group">
                <form:label path="creator">Creator</form:label>
                <form:errors path="creator" class="text-danger"/>
                <form:input path="creator" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
            <div class="form-group">
                <form:label path="version">Version</form:label>
                <form:errors path="version" class="text-danger"/>
                <form:input path="version" type="number" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
                <input type="submit" value="Submit" class="btn btn-success"/>
       			<form action="/delete/${language.id}" method="post">
					<input type="hidden" name="_method" value="delete">
					<input type="submit" value="Delete" class="btn btn-danger">
				</form>
        </form:form>
    </div>
</body>
</html>