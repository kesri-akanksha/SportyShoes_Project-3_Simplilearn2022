<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sport Shoes</title>

<style>
table,th,td {
    
    border:1pxsolidblack;
    text-align:center;
}
</style>

</head>
<body style="background-color:yellow;">

<h2>All Available Products</h2>
<br>
<table style="width:100%">
<tr>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Product Category</th>
    </tr>
    
    <c:forEach var="product" items="${productList}">
    
        <tr>
            <td> ${product.productname} </td>
             <td> ${product.productprice} </td>
            <td> ${product.productcategory} </td>
        
            <td><a href="deleteProduct?id=${product.productid}">Delete</a></td>
        </tr>
    
    </c:forEach>
            
</table>
<br><br>
<p style="color:green;">${message}</p>

</body>
</html>