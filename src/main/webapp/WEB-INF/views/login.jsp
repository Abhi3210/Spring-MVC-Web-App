<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo !!! from JSP</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<style>
body {background-color: hsla(89, 43%, 51%, 0.3);}
</style>
<div class="container">
<%-- My first JSP ${name}<br>
My Password is :${password}<br> --%>
<center>
<h1><font color="blue">Welcome to Login Page</font></h1>
<form action="/first-web-application/validation" method="post">
<p><font color="red">${errormessage}</font></p>
Enter your name :<p> <input type="text" name="name"/></p>
Enter your password:<p><input type="password" name="password"/></p>
<!-- <p><input class="btn btn-success" type="submit" value="Login"/></p> -->
<input class="btn btn-success" type="submit" value="Login"/>
</form>
</center>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>