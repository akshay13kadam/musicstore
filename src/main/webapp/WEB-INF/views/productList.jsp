<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>



	<!-- Marketing messaging and featurettes
================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->

	<div class="container-wrapper">
		<div class="container">

		<div class="page-header">
		<h2><b>All Products </b></h2>
		<p class="lead">Checkout our awesome products:</p>
<table class="table table-hover">
<tr>
<th>Photo</th>
<th>productName</th>
<th>productCategory</th>
<th>produtPrice(Rs)</th>
<th>productCandition</th>
<th></th>


</tr>
<c:forEach var="products" items="${products}">
<tr>
<td><img src="#" alt="thumb"/></td>

<td>${products.productName}</td>
<td>${products.productCategory}</td>
<td>${products.produtPrice}</td>
<td>${products.productCandition}</td>
<td><a href = "<c:url value = "/productList/viewProduct/${products.productId}"/>"><span class="glyphicon glyphicon-info-sign"></span></a></td>


</tr>
</c:forEach>
</table>
		
		
<%@include file="/WEB-INF/views/template/footer.jsp" %>


