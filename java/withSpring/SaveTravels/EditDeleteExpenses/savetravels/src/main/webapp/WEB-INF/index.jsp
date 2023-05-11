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
	<div class="container col-6 text-center">
       	<a href="http://"><c:out value="${expense.getName()}"></c:out></a>
		<table class="table table-dark col-6">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Vendor</th>
					<th scope="col">Amount</th>
					<th scope="col">Description</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${expenses}" var="expense">
				<tr>
					<td scope="col"><c:out value="${expense.getId()}"></c:out></td>
					<td scope="col"><a href="http:/show/${expense.id}"><c:out value="${expense.getName()}"></c:out></a></td>
					<td scope="col"><c:out value="${expense.getVendor()}"></c:out></td>
					<td scope="col">$<c:out value="${expense.getAmount()}"></c:out></td>
					<td scope="col"><c:out value="${expense.getDescription()}"></c:out></td>
					<td scope="col">
						<form action="/delete/${expense.id}" method="post">
							<input type="hidden" name="_method" value="delete">
							<input type="submit" value="Delete" class="btn btn-danger">
						</form>
						<a href="http:/${expense.id}">
							<button type="submit" class="btn btn-warning">Edit</button>
						</a>
					</td>

				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
    	<h3>Add a new expense</h3>
        <form:form action="/new" method="post" modelAttribute="expense">
            <div class="form-group">
                <form:label path="name">Name</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: Ticket"/>
            </div>
            <div class="form-group">
                <form:label path="vendor">Vendor</form:label>
                <form:errors path="vendor" class="text-danger"/>
                <form:input path="vendor" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: Plane Ticket"/>
            </div>
            <div class="form-group">
                <form:label path="amount">Amount</form:label>
                <form:errors path="amount" class="text-danger"/>
                <form:input path="amount" type="number" class="form-control" id="exampleFormControlInput1" placeholder="ex: 400$"/>
            </div>
            <div class="form-group">
                <form:label path="description">Description</form:label>
                <form:errors path="description" class="text-danger"/>
                <form:textarea path="description" class="form-control" id="exampleFormControlTextarea1" rows="3"></form:textarea>
            </div>
                <input type="submit" value="Submit"/>
        </form:form>
    </div>
</body>
</html>