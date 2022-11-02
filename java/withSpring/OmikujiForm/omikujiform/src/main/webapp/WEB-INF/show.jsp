<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Show page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style_show.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class="container">
	    <h1 class="form-group col-6">Here is your Omikuji</h1>
	    <p class="form-group col-6">
	    	In <c:out value="${number}"></c:out> you will live in
	    	 <c:out value="${city}"></c:out> with
	    	 <c:out value="${name}"></c:out> as your roommate, selling 
	    	 <c:out value="${hobby}"></c:out> for a living.
	    	 The next time you see a <c:out value="${thing}"></c:out>, you 
	    	 will have a good luck.
	    	 Also, <c:out value="${message}"></c:out>.
	    </p>
	    <a href="/">Try again?</a>
	</div>

</body>
</html>