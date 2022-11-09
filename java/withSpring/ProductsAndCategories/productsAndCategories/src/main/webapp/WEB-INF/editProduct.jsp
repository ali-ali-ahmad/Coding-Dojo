<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Edit Product page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center">
    	<h3>Edit Product</h3>
        <form:form action="/updateProduct/${product.id}" method="post" modelAttribute="product">
            <input type="hidden" name="_method" value="put">
            <div class="form-group">
                <form:errors path="name" class="text-danger"/>
                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${product.name}"/>
            </div>
            <div class="form-group">
                <form:errors path="description" class="text-danger"/>
                <form:input path="description" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${product.description}"/>
            </div>
            <div class="form-group">
                <form:errors path="price" class="text-danger"/>
                <form:input path="price" type="text" class="form-control" id="exampleFormControlInput1" placeholder="${product.price}"/>
            </div>
            <div class="border border-secondary">
  	                <form:label path="categories">Edit Categories</form:label>
				<c:forEach items="${categories}" var="category">
					<div class="form-check">
          			  <form:checkbox path="categories" value="${category.id}" class="form-check-input" id="flexCheckDefault"/>
					  <form:label path="categories" class="form-check-label" for="flexCheckDefault"><c:out value="${category.name}"></c:out></form:label>
					</div>
				</c:forEach>
            </div>
                <input type="submit" value="Update" class="btn btn-success"/>
        </form:form>
    </div>
</body>
</html>