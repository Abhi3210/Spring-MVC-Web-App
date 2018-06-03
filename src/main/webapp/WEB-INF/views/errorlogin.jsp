<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo !!! from JSP</title>
</head>
<style>
body {background-color: hsla(89, 43%, 51%, 0.3);}
</style>
<%-- My first JSP ${name}<br>
My Password is :${password}<br> --%>
<center>
<h1><font color="red">Please Enter Valid Username and Password !!!</font></h1>
</center>
<center>
<form action="/first-web-application/validation" method="post">
Enter your name :<p> <input type="text" name="name"/></p>
Enter your password:<p><input type="password" name="password"/></p>
<p><input type="submit" value="Login"></p>
</form>
</center>
</body>
</html>