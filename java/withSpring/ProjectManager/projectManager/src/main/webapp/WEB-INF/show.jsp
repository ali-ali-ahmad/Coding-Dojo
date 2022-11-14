<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<div class="d-flex justify-content-around">
		<h1>Project Details</h1>
		<a href="/projects">
			<button type="submit" class="btn btn-success">Home</button>
		</a>
	</div>
	<h4>Project: <span class="text-success"><c:out value="${project.title}"></c:out></span></h4>
	<h4>Description: <span class="text-success"><c:out value="${project.description}"></c:out></span></h4>
	<h4><span class="text-success"><fmt:formatDate value="${project.dueDate}" pattern = "yyyy-MM-dd"/></span></h4>
	<a href="http:/viewTickets/${project.id}">
		<button type="submit" class="btn btn-warning">See Tickets</button>
	</a>
	<c:choose>
    <c:when test="${user.id == project.user.id}">
		<div class="d-flex">
			<form action="/deleteProject/${project.id}" method="post">
				<input type="hidden" name="_method" value="delete">
				<input type="submit" value="Delete" class="btn btn-danger">
			</form>
			<a href="http:/editProject/${project.id}">
				<button type="submit" class="btn btn-warning">Edit</button>
			</a>
		</div>
    </c:when>    
	</c:choose>
	<c:forEach var="ticket" items="${tickets}">
		<h4>Added by <c:out value="${ticket.ticketMaker.userName}"></c:out> at <fmt:formatDate value="${ticket.createdAt}" pattern="h:mm a MMMM dd"/>:</h4>
		<p><c:out value="${ticket.task}"></c:out></p>
	</c:forEach>
</body>
</html>