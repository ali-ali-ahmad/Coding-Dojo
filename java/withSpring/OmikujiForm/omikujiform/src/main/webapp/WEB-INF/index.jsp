<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
    <h3>Login</h3>
    <form action='/login' method='POST'>
		<label>Email:</label>
    	<input type="text" name='email'>
		<label>Password:</label>
    	<input type='password' name='password'>
    	<input type='submit' value='login'>
    </form>
</body>
</html>