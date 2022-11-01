<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Dashboard</title>
</head>
<body>
    <h3>Welcome User!</h3>
    <a href="/counter">Check counter</a>
    <p>You have visited the dashboard <c:out value="${count}"></c:out> times</p>
</body>
</html>