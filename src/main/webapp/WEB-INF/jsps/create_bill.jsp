<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bill</title>
</head>
<body>
<h2>Create | New Bill </h2>
<hr>

<form action="generatebill" method="post">
<pre>
  
First name <input type="text" name="firstName" value="${contact.firstName}">
Last name <input type="text" name="lastName" value="${contact.lastName}">
Email    <input type="text" name="email" value="${contact.email}">
Mobile   <input type="text" name="mobile" value="${contact.mobile}">
Product <input type="text" name="product">
Amount <input type="text" name="amount">

   <input type="submit" value="generatebill">
</pre>

</form>
</body>
</html>