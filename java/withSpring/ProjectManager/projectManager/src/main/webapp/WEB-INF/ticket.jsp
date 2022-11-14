<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title>New Ticket</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/index_style.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h2>
	<a href="/projects">
		<button type="submit" class="btn btn-success">Home</button>
	</a>
</h2>
<h1>Project: ${project.title}</h1>
<h5>Project Lead: ${project.user.userName}</h5>
<form:form action="/addTicket/${project.id}" method="post" modelAttribute="ticket">
	<table>
	    <thead>
	        <tr>
	            <td class="float-left">Add a task ticket for this team:</td>
	            <td class="float-left">
	            	<form:errors path="task" class="text-danger"/>
					<form:textarea rows="3" cols="50" class="input" path="task"/>
	            </td>
	        </tr>
	        <tr>
	        	<td colspan=2><input class="input" class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
<hr>
<c:forEach var="ticket" items="${tickets}">
	<h4>Added by <c:out value="${ticket.ticketMaker.userName}"></c:out> at <fmt:formatDate value="${ticket.createdAt}" pattern="h:mm a MMMM dd"/>:</h4>
	<p><c:out value="${ticket.task}"></c:out></p>
</c:forEach>
</body>
</html>