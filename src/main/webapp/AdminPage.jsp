<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sporty Shoes</title>

<style>
div {
    border:10pxsolidblack;
    color:blue;
    font-size:20px;
    height:100px;
    width:450px;
}
a{
    padding-left:50px;
}
</style>

</head>
<body style="background-color:rgb(255,252,211)">

<a href="home.jsp" style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">Sporty Shoes</a>
<br><br>

<div>
<br><br>
<a href="Product.jsp" target="iframe">Products</a>
<a href="User.jsp" target="iframe">Users</a>
<a href="PurchaseReport.jsp" target="iframe">Purchase Report</a>
</div><br><br>
<iframe src="Product.jsp" name="iframe" style="height:400px;width:900px;" title="Sporty Shoes"></iframe>

</body>
</html>