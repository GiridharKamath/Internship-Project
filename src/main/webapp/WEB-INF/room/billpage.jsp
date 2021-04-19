<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
<%response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); %>
${msg }

<form action="bill2">
<table border="4" cellspacing="4" cellpadding="4">
<tr><th>PID</th><th>Quantity</th><th>Actions</th></tr>
<tr><td><input type="number" name="pid" placeholder="Enter the product Id"required></td>
<td><input type="number" name="quantity" placeholder="Enter the quantity"required></td>


<td>
<ol type="1">
<li><input type="submit" formmethod="post" value="next"></li>
<li><input type="reset" value="Clear"></li>
</ol>
</td>
</tr>
</table>
</form>
<a href="finalbill">Check Out</a><br>
<a href="newbill">New Bill</a><br>
<a href="back">Back To Home</a><br>
<a href="logout">Logout</a>
</body>
</html>