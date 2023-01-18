<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<table border=2>
  <thead>
   <tr>
     <th>First Name</th>
     <th>Last Name</th>
     <th>Email</th>
     <th>Mobile</th>
     <th>Source</th>
   </tr>
  </thead>

 <c:forEach var="leads" items="${leads}" >
     <tr>
     <td><a href="leadinfo?id=${leads.id}">${leads.firstName}</a></td>
     <td>${leads.lastName}</td>
     <td>${leads.email}</td>
     <td>${leads.mobile}</td>
     <td>${leads.source}</td>
     </tr>
 </c:forEach>

</table>
</body>
</html>