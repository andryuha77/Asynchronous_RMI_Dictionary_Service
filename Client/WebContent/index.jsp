<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.concurrent.ArrayBlockingQueue"%>
<%@page import="ie.gmit.sw.Job"%>
<%@page import="java.util.concurrent.BlockingQueue"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RMI Dictionary</title>
</head>
<body>
	<h1>RMI Dictionary</h1>
	<form action="DictionaryServlet" method="post">
		<p>Please enter word:</p>
		<input type="text" name="word" /> <br /> <br /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>