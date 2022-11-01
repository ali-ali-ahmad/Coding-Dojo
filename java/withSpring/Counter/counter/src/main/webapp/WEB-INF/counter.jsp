<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>counter page</title>
</head>
<body>
    <h3>Counter</h3>
    <p>BTW, Visiting this page will add two counters</p>
    <p>You have visited the dashboard <c:out value="${count}"></c:out> times</p>
    <a href="/">Test another visit</a>
</body>
</html>