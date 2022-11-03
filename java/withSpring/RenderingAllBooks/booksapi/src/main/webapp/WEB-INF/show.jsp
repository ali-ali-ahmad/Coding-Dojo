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
	<a href="/books/">Go back</a>
	<h1><c:out value="${title}"></c:out></h1>
	<h5>Description: <c:out value="${desc}"></c:out></h5>
	<h5>Language: <c:out value="${lang}"></c:out></h5>
	<h5>Number of pages: <c:out value="${pages}"></c:out></h5>
</body>
</html>