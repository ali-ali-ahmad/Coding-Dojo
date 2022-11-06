<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Show Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/index_style.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center mt-5">
		<h1><c:out value="${name}"></c:out></h1>
		<h5>Creator: <c:out value="${creator}"></c:out></h5>
		<h5>Version: $<c:out value="${version}"></c:out></h5>
    	<a href="http:/">
    	<button type="submit" class="btn btn-primary">Go back</button>
    	</a>
    	<div class="d-flex align-items-center justify-content-center">
			<form action="/delete/${id}" method="post">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" value="Delete" class="btn btn-danger">
			</form>
			<a href="http:/${id}">
				<button type="submit" class="btn btn-warning">Edit</button>
			</a>
		</div>
	</div>
</body>
</html>