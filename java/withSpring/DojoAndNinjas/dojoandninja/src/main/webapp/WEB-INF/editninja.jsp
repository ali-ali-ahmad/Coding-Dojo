<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit Ninja page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
    	<h3>Edit Ninja</h3>
        <form:form action="/updateNinja/${ninja.id}" method="post" modelAttribute="ninja">
            <input type="hidden" name="_method" value="put">
            <div class="form-group">
                <form:errors path="firstName" class="text-danger"/>
                <form:input path="firstName" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${ninja.firstName}"/>
            </div>
            <div class="form-group">
                <form:errors path="lastName" class="text-danger"/>
                <form:input path="lastName" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${ninja.lastName}"/>
            </div>
            <div class="form-group">
                <form:errors path="age" class="text-danger"/>
                <form:input path="age" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${ninja.age}"/>
            </div>
	            <div>
   	                <form:label path="dojo">Dojo</form:label>
					<form:select path="dojo" class="form-select" aria-label="Default select example">
						<c:forEach items="${dojos}" var="dojo">
					  	<option selected value="${dojo.id}"><c:out value="${dojo.getName()}"></c:out></option>
						</c:forEach>
					</form:select>
	            </div>
                <input type="submit" value="Update" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>