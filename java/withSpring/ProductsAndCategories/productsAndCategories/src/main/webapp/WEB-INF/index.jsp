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
	<div class="d-flex">
	    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center border border-secondary">
	    	<h3>Add a new Product</h3>
	        <form:form action="/newProduct" method="post" modelAttribute="product">
	            <div class="form-group">
	                <form:label path="name">Name</form:label>
	                <form:errors path="name" class="text-danger"/>
	                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="example: Phone"/>
	            </div>
	            <div class="form-group">
	                <form:label path="description">Description</form:label>
	                <form:errors path="description" class="text-danger"/>
	                <form:input path="description" type="text" class="form-control" id="exampleFormControlInput1" placeholder="example: what does it do"/>
	            </div>
	            <div class="form-group">
	                <form:label path="price">Price</form:label>
	                <form:errors path="price" class="text-danger"/>
	                <form:input path="price" type="text" class="form-control" id="exampleFormControlInput1" placeholder="example: in $$"/>
	            </div>
	            <div class="border border-secondary">
   	                <form:label path="categories">Add Categories</form:label>
					<c:forEach items="${categories}" var="category">
						<div class="form-check">
	          			  <form:checkbox path="categories" value="${category.id}" class="form-check-input" id="flexCheckDefault"/>
						  <form:label path="categories" class="form-check-label" for="flexCheckDefault"><c:out value="${category.name}"></c:out></form:label>
						</div>
					</c:forEach>
	            </div>
	                <input type="submit" value="Add" class="btn btn-success"/>
	        </form:form>
	    </div>
	    <div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center border border-secondary">
	    	<h3>Add a new Category</h3>
	        <form:form action="/newCategory" method="post" modelAttribute="category">
	            <div class="form-group">
	                <form:label path="name">Name</form:label>
	                <form:errors path="name" class="text-danger"/>
	                <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="example: Home made"/>
	            </div>
	            <div class="border border-secondary">
   	                <form:label path="products">Add Products</form:label>
					<c:forEach items="${products}" var="product">
						<div class="form-check">
	          			  <form:checkbox path="products" value="${product.id}" class="form-check-input" id="flexCheckDefault"/>
						  <form:label path="products" class="form-check-label" for="flexCheckDefault"><c:out value="${product.name}"></c:out></form:label>
						</div>
					</c:forEach>
	            </div>
	                <input type="submit" value="Add" class="btn btn-success"/>
	        </form:form>
	    </div>
	</div>
	<div class="d-flex">
		<div class="container col-6 text-center d-flex flex-row align-items-center shadow-xl shadow-lg p-3 mb-5 bg-black rounded">
			<table class="table table-dark col-6 class shadow-lg p-3 mb-5 bg-black rounded">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Description</th>
						<th scope="col">Price</th>
						<th scope="col">Categories</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products}" var="product">
					<tr class="align-items-center">
						<td scope="col"><c:out value="${product.id}"></c:out></td>
						<td scope="col"><a href="http:/"><c:out value="${product.name}"></c:out></a></td>
						<td scope="col"><c:out value="${product.description}"></c:out></td>
						<td scope="col"><c:out value="${product.price}"></c:out>$</td>
						<td scope="col">
						<c:forEach items="${product.categories}" var="category">
						<p><c:out value="${category.name}"></c:out></p>
						</c:forEach>
						</td>
						<td scope="col" class="d-flex justify-content-center">
							<form action="/deleteProduct/${product.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<input type="submit" value="Delete" class="btn btn-danger">
							</form>
							<a href="http:/editProduct/${product.id}">
								<button type="submit" class="btn btn-warning">Edit</button>
							</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="container col-6 text-center d-flex flex-row align-items-center shadow-lg p-3 mb-5 bg-black rounded">
			<table class="table table-dark col-6 shadow-lg p-3 mb-5 bg-black rounded rounded">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Products</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${categories}" var="category">
					<tr class="align-items-center">
						<td scope="col"><c:out value="${category.id}"></c:out></td>
						<td scope="col"><a href="http:/"><c:out value="${category.name}"></c:out></a></td>
						<td scope="col">
						<c:forEach items="${category.products}" var="product">
						<p><c:out value="${product.name}"></c:out></p>
						</c:forEach>
						</td>
						<td scope="col" class="d-flex justify-content-center">
							<form action="/deleteCategory/${category.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<input type="submit" value="Delete" class="btn btn-danger">
							</form>
							<a href="http:/editCategory/${category.id}">
								<button type="submit" class="btn btn-warning">Edit</button>
							</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>