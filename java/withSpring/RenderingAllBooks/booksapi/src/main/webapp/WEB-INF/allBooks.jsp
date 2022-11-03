<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>All books</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<table class="table table-dark col-6">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Title</th>
      <th scope="col">Language</th>
      <th scope="col">Pages</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${books}" var="book">
    <tr>
      <th scope="col"><c:out value="${book.getId()}"></c:out></th>
      <td scope="col"><a href="/books/${book.getId()}"><c:out value="${book.getTitle()}"></c:out></a></td>
      <td scope="col"><c:out value="${book.getLanguage()}"></c:out></td>
      <td scope="col"><c:out value="${book.getNumberOfPages()}"></c:out></td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>