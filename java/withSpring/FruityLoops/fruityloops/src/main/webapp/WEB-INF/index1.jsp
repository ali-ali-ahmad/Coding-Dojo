<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Fruits page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app1.js"></script>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>Fruits Names and Prices</h1>
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Name</th>
	      <th scope="col">Price</th>
	    </tr>
	  </thead>
	  <tbody>
        <c:forEach var="oneDojo" items="${fruitsFromMyController}">
	    <tr>
	      <th scope="row"><c:out value="${oneDojo.name}"></c:out></th>
	      <td scope="row"><c:out value="${oneDojo.price}"></c:out></td>
	    </tr>
        </c:forEach>
	  </tbody>
	</table>

</body>
</html>