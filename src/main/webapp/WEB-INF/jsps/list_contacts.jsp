<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
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
     <th>Billing</th>
   </tr>
  </thead>

 <c:forEach var="contacts" items="${contacts}" >
     <tr>
     <td>${contacts.firstName}</td>
     <td>${contacts.lastName}</td>
     <td>${contacts.email}</td>
     <td>${contacts.mobile}</td>
     <td>${contacts.source}</td>
      <td><a href="billingForm?contactId=${contacts.id}">Generate Bill</a></td>
     </tr>
 </c:forEach>

</table>
</body>
</html>