<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sporty Shoes</title>

<style>
table,th,td {
    
    border:1pxsolidblack;
    text-align:center;
}
</style>


</head>
<body style="background-color:yellow;">

<h2>Purchase Report</h2>
<br>
<table style="width:100%">
    <tr>
        <th>Product name</th>
        <th>User Email</th>
        <th>Date</th>
        <th>Price</th>
    </tr>
    
    <c:forEach var="report" items="${report}">
    
        <tr>
            <td> ${report.purproductname} </td>
            <td> ${report.purcustomerEmail} </td>
            <td> ${report.purdate} </td>
            <td> ${report.purproductprice} </td>
        </tr>
    
    </c:forEach>
            
</table>

</body>
</html>