<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>

<c:out value="${heading}"/>
<p><a href="cars">Add Cars</a></p>
<p><a href="cars/all">view Cars</a></p>
<p><a href="cars/unsoldcars">view unsold Cars</a></p>
<p><a href="cars/showByBrand">view specific cars</a></p>
</body>
</html>