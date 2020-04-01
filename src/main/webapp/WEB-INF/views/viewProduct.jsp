<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>



<div class="container-wrapper">

<div class="container">
	<div class="page-header">

	<h2>Product Details</h2>
	<p class="led">Here is details information of product</p>
	</div>

<div class="container">

<div class="row">
<div class="col-md-5">
<img alt="thumb" src="#" style="width: 100%;height: 300px;">

</div>

<div class="col-md-5">
<h3>Product Name:${product.productName}</h3>
<p>Description:${product.productDescription}</p>
<p>Category:${product.productCategory}</p>
<p>Manufacturer:${product.productManufacturer}</p>
<p>Condition:${product.productCandition}</p>
<p>Price(Rs):${product.produtPrice}</p>
<p></p>
</div>
</div>
</div>





<%@include file="/WEB-INF/views/template/footer.jsp" %>