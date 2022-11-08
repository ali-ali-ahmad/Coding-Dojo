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
       	<a href="http://"><c:out value="${dojo.name}"></c:out></a>
		<table class="table table-dark col-6">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Location</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojos}" var="dojo">
				<tr class="align-items-center">
					<td scope="col"><c:out value="${dojo.id}"></c:out></td>
					<td scope="col"><a href="http:/show/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>
					<td scope="col" class="d-flex justify-content-center">
						<form action="/deleteDojo/${dojo.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete" class="btn btn-danger">
						</form>
						<a href="http:/editDojo/${dojo.id}">
							<button type="submit" class="btn btn-warning">Edit</button>
						</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="d-flex">
	    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
	    	<h3>Add a new Dojo</h3>
	        <form:form action="/newDojo" method="post" modelAttribute="dojo">
	            <div class="form-group">
	                <form:label path="name">Name</form:label>
	                <form:errors path="name" class="text-danger"/>
	                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="example: Ramallah"/>
	            </div>
	                <input type="submit" value="Add" class="btn btn-success"/>
	        </form:form>
	    </div>
	    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
	    	<h3>Add a new Ninja</h3>
	        <form:form action="/newNinja" method="post" modelAttribute="ninja">
	            <div class="form-group">
	                <form:label path="firstName">First Name</form:label>
	                <form:errors path="firstName" class="text-danger"/>
	                <form:input path="firstName" type="text" class="form-control" id="exampleFormControlInput1"/>
	            </div>
	            <div class="form-group">
	                <form:label path="lastName">Last Name</form:label>
	                <form:errors path="lastName" class="text-danger"/>
	                <form:input path="lastName" type="text" class="form-control" id="exampleFormControlInput1"/>
	            </div>
	            <div class="form-group">
	                <form:label path="age">Age</form:label>
	                <form:errors path="age" class="text-danger"/>
	                <form:input path="age" type="text" class="form-control" id="exampleFormControlInput1"/>
	            </div>
	            <div>
   	                <form:label path="age">Dojo</form:label>
					<form:select path="dojo" class="form-select" aria-label="Default select example">
						<c:forEach items="${dojos}" var="dojo">
					  	<option selected value="${dojo.id}"><c:out value="${dojo.getName()}"></c:out></option>
						</c:forEach>
					</form:select>
	            </div>
	                <input type="submit" value="Add" class="btn btn-success"/>
	        </form:form>
	    </div>
	</div>
</body>
</html>