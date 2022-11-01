<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Test 2</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
  <div class="overlay" id="overlay" hidden>
    <div class="confirm-box">
      <div onclick="closeConfirmBox()" class="close">&#10006;</div>
      <h2>Confirmation</h2>
      <p>Are you sure to execute this action?</p>
      <button onclick="isConfirm(true)">Date</button>
      <button onclick="isConfirm(false)">Time</button>
    </div>
  </div>
      <h1>Call the box</h1>
  <button class="button" onclick="showConfirmBox()">Show</button>
</body>
</html>