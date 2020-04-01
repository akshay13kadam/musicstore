<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="2" cellspacing="2">
<tr>
<th>Serial No</th>
<th>ProductName</th>
<th>productCategory</th>
<th>productDescription</th>
<th>produtPrice</th>
<th>productCandition</th>
<th>productStatus</th>
<th>unitInStock</th>
<th>productManufacturer</th>
</tr>
<tr>
<td></td>
<td>${product.productName}</td>
<td>${product.productCategory}</td>
<td>${product.productDescription}</td>
<td>${product.produtPrice}</td>
<td>${product.productCandition}</td>
<td>${product.productStatus}</td>
<td>${product.unitInStock}</td>
<td>${product.productManufacturer}</td>

</tr>

</table>
${p.productName}
<a href="<c:url value="/productList1" />">Products</a>
</body>
</html>