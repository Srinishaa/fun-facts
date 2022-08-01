<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fun Facts</title>
</head>
<style><%@include file="/WEB-INF/css/styles.css"%></style>
<body>
	
	<div class="card">
	<p><%= (new java.util.Date()).toLocaleString()%></p>
	<h2>Hi here are some facts about me!</h2>
	    <div class="card__content">
	    	<span class="card__title">#${id}<span><br>
	        <span class="card__title">${fact}<span>
	    </div>
	    <br>
	    <input class="card-button" type="button" value="Next fact" onClick="window.location.reload(true)">
	</div>
</body>
</html>