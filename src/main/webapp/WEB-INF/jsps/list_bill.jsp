<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Bills</title>
</head>
<body>
<table border=2>
  <thead>
   <tr>
     <th>First Name</th>
     <th>Last Name</th>
     <th>Email</th>
     <th>Mobile</th>
     <th>Product</th>
     <th>Amount</th>
   </tr>
  </thead>

 <c:forEach var="bill" items="${bill}" >
     <tr>
     <td>${bill.firstName}</td>
     <td>${bill.lastName}</td>
     <td>${bill.email}</td>
     <td>${bill.mobile}</td>
     <td>${bill.product}</td>
      <td>${bill.amount}</td>
     </tr>
 </c:forEach>

</table>
</body>
</html>