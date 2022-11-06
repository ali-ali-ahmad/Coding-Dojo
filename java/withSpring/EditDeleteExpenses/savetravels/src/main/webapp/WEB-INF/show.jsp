<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Home Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/index_style.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container col-4 shadow p-3 mb-5 bg-black rounded text-center mt-5">
		<h1><c:out value="${name}"></c:out></h1>
		<h5>Vendor: <c:out value="${vendor}"></c:out></h5>
		<h5>Amount: $<c:out value="${amount}"></c:out></h5>
		<h5>Description: <c:out value="${desc}"></c:out></h5>
    	<a href="http:/">
    	<button type="submit" class="btn btn-primary">Go back</button>
    	</a>
	</div>

</body>
</html>