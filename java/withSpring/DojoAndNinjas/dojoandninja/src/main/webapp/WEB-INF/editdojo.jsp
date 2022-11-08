<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit Dojo page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
    	<h3>Edit Dojo</h3>
        <form:form action="/updateDojo/${dojo.id}" method="post" modelAttribute="dojo">
            <input type="hidden" name="_method" value="put">
            <div class="form-group">
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${dojo.name}"/>
            </div>
                <input type="submit" value="Update" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>