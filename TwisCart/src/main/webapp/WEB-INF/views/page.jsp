<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- Creating 3 variables using spring url element -->
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping -${title }</title>
<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.css" rel="stylesheet">

<!-- Bootstrap Readable Theme -->
<link href="${css }/bootstrap-new-path.css" rel="stylesheet">


<!-- Add custom CSS here -->
<link href="${css }/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">

			<!-- Loading the home content -->
			<c:if test="${userClickHome==true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load only when user click about -->
			<c:if test="${userClickAbout==true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load only when user click contact -->
			<c:if test="${userClickContact==true }">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Load only when user click contact -->
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="listProduct.jsp"%>
			</c:if>

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- /.container -->

		<!-- JavaScript -->
		<script src="${js }/jquery-1.10.2.js"></script>
		<script src="${js }/bootstrap.js"></script>

		<!-- Self coded js -->
		<script src="${js }/myapp.js"></script>

	</div>

</body>

</html>
