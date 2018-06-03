<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<style>
body {background-color: hsla(89, 43%, 51%, 0.3);}
</style>
<center>
<h1>Welcome ${name}</h1>
<h3>
<a href="list-todos">Todo List</a>
</h3>
</center>
<%@ include file="common/footer.jspf"%>