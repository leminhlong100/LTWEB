<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="${sessionScope.LANG}" />
<fmt:setBundle basename="web.lang.resource.app" var="lang" />
<c:url value="/client/assets" var="url"></c:url>
<!-- CSS -->
<link rel="stylesheet" href="${url}/css/checkout.css">
<link rel="stylesheet" href="${url}/css/bootstrap.min.css">
<link rel="stylesheet" href="${url}/css/style.css">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="${url}/css/product.css" rel="stylesheet" type="text/css" />
<link href="${url}/css/front-page.css" rel="stylesheet" type="text/css" />
<link href="${url}/css/owl.carousel.css" rel="stylesheet" type="text/css" />
<link href="${url}/css/jquery.fancybox.css" rel="stylesheet"
	type="text/css" />
<link href="${url}/css/responsive.css" rel="stylesheet" type="text/css" />


<!-- Script -->
<script src="${url}/js/jquery.js" type="text/javascript"></script>
<script src="${url}/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${url}/js/owl.carousel.js" type="text/javascript"></script>
<script src="${url}/js/api.jquery.js" type="text/javascript"></script>
<script src="${url}/js/jquery.fancybox.pack.js" type="text/javascript"></script>
<script src="${url}/js/jgrowl.js" type="text/javascript"></script>
<script src="${url}/js/cs.script.js" type="text/javascript"></script>
<script src="${url}/js/home.js" type="text/javascript"></script>
