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
			<h3 class="col-7">Edit Expense</h3>
			<a href="http:/" class="col">
				<button type="submit" class="btn btn-primary">Go back</button>
			</a>
	    </div>
        <form:form action="/${expense.id}/edit" method="post" modelAttribute="expense">
            <input type="hidden" name="_method" value="put">
            <input type="hidden" name="expense_id" value="${expense.getId()}">
            <div class="form-group">
                <form:label path="name">Name</form:label>
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
            <div class="form-group">
                <form:label path="vendor">Vendor</form:label>
                <form:errors path="vendor" class="text-danger"/>
                <form:input path="vendor" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
            <div class="form-group">
                <form:label path="amount">Amount</form:label>
                <form:errors path="amount" class="text-danger"/>
                <form:input path="amount" type="number" class="form-control" id="exampleFormControlInput1" placeholder="${expense.getName()}"/>
            </div>
            <div class="form-group">
                <form:label path="description">Description</form:label>
                <form:errors path="description" class="text-danger"/>
                <form:textarea path="description" class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder="${expense.getDescription()}"></form:textarea>
            </div>
                <input type="submit" value="Submit" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>