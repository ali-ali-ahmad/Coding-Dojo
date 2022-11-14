<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Projects Dashboard</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/index_style.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="d-flex justify-content-around">
		<h3>Welcome, <c:out value="${user.userName}"></c:out>!</h3>
		<a href="http:/logout">
			<button type="submit" class="btn btn-warning">Logout</button>
		</a>
	</div>
	<div class="d-flex justify-content-around">
		<h2>Welcome to the Firm</h2>
		<a href="/addProject">
			<button type="submit" class="btn btn-success">Create new Project</button>
		</a>
	</div>
	<h4>All Projects</h4>
	<div class="container col-6 text-center d-flex flex-row align-items-center shadow-xl shadow-lg p-3 mb-5 bg-black rounded">
		<table class="table table-dark col-6 class shadow-lg p-3 mb-5 bg-black rounded">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Project</th>
					<th scope="col">Team Lead</th>
					<th scope="col">Due Date</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${projects}" var="project">
				<c:choose>
				<c:when test="${project.user.id!=user.id}">
				<tr class="align-items-center">
					<td scope="col"><c:out value="${project.id}"></c:out></td>
					<td scope="col"><a href="http:/show/${project.id}"><c:out value="${project.title}"></c:out></a></td>
					<td scope="col"><c:out value="${project.user.userName}"></c:out></td>
					<td scope="col"><fmt:formatDate value="${project.dueDate}" pattern = "yyyy-MM-dd"/></td>
					<td scope="col">
						<form:form action="/teamIn/${project.id}" method="post">
							<input type="submit" value="Join" class="btn btn-primary">
						</form:form>
					</td>
				</tr>
			    </c:when>
				</c:choose>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<h4>My Projects</h4>
	<div class="container col-6 text-center d-flex flex-row align-items-center shadow-xl shadow-lg p-3 mb-5 bg-black rounded">
		<table class="table table-dark col-6 class shadow-lg p-3 mb-5 bg-black rounded">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Project</th>
					<th scope="col">Lead</th>
					<th scope="col">Due Date</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${myProjects}" var="project">
				<tr class="align-items-center">
					<td scope="col"><c:out value="${project.id}"></c:out></td>
					<td scope="col"><a href="http:/show/${project.id}"><c:out value="${project.title}"></c:out></a></td>
					<td scope="col"><c:out value="${project.user.userName}"></c:out></td>
					<td scope="col"><fmt:formatDate value="${project.dueDate}" pattern = "yyyy-MM-dd"/></td>
					<td scope="col">
					<c:choose>
					    <c:when test="${project.user.id==user.id}">
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
					    <c:when test="${project.user.id!=user.id}">
							<form:form action="/teamOut/${project.id}" method="post">
								<input type="submit" value="Leave" class="btn btn-primary">
							</form:form>
					    </c:when>
					</c:choose>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>