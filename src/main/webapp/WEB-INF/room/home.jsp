<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
<div style="marginleft:20"><h1>Welcome To Mall</h1><br>
<a href="list" style="text-decoration:none;border-style:solid;padding:5px">Check Stock</a><br><br>
<a href="add"style="text-decoration:none;border-style:solid;padding:5px">Add New Product</a><br><br>
<a href="bill1"style="text-decoration:none;border-style:solid;padding:5px">Bill</a><br><br><br>
<a href="logout"style="text-decoration:none;border-style:solid;padding:5px">Logout</a></div>
</body>
</html>