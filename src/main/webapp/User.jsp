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

<h2>Users Details</h2>
<br>

<form action="searchUser">
    <label for="search">Search User By Email :-</label>  <input type="email"name="email"id="search"/>
    <input type="submit" value="search"/>
</form><br><br>
<table style="width:100%">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Address</th>
    </tr>
   <c:forEach var="user"items="${userList}">
    
        <tr>
            <td> ${user.username} </td>
            <td> ${user.useremail} </td>
            <td> ${user.userage} </td>
            <td> ${user.usergender} </td>
            <td> ${user.useraddress} </td>
        </tr>
    
    </c:forEach>
            
</table>

</body>
</html>