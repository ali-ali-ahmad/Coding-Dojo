<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Home page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/style_index.css">
	<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
    <h3 class="form-group col-3">Send an Omikuji</h3>
    <form action='/login' method='post'>
    	<div class="form-group col-3">
    		<label for="number">Pick any number from 5 to 25</label>
    		<input type="number" name='number' class="form-control">
    	</div>
    	<div class="form-group col-3">
    		<label for="city">Enter the name of any city</label>
    		<input type="text" name='city' class="form-control">
    	</div>
    	<div class="form-group col-3">
    		<label for="name">Enter the name of any real person</label>
    		<input type="text" name='name' class="form-control">
    	</div>
    	<div class="form-group col-3">
    		<label for="hobby">Enter professional endeavor or hobby</label>
    		<input type="text" name='hobby' class="form-control">
    	</div>
    	<div class="form-group col-3">
    		<label for="thing">Enter any type of living thing</label>
    		<input type="text" name='thing' class="form-control">
    	</div>
    	<div class="form-group col-3">
    		<label for="message">Say something nice to someone</label>
    		<input type="text" name='message' class="form-control">
    	</div>
    	<div class="form-group col-3">
    	<input type='submit' value='Send' class="btn btn-primary">
    	</div>
	</form>
</body>
</html>