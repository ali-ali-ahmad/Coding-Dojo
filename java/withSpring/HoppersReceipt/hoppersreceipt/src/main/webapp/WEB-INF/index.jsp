<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Testing</title>
</head>
<body>
	<h1>Customer name: <c:out value="${name}"/></h1>
	<h4>Item name: <c:out value="${item_name}"/></h4>
	<h4>Price: <c:out value="${price}"/>$</h4>
	<h4>Description: <c:out value="${description}"/></h4>
	<h4>Vendor: <c:out value="${vendor}"/></h4>
</body>
</html>