<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add cars</title>
</head>
<body>

	<p>RowAdded</p><c:out value="${rowAdded}"/>
	<form:form method="post" action="cars">
	
	<form:label path="id">Car id</form:label>
	<form:input path="id"/>
	
	<form:label path="model">Model</form:label>
	<form:input path="model"/>
	
	<form:label path="yearOfManufacture">Year of Manufacture</form:label>
	<form:input path="yearOfManufacture"/>
	
	<form:label path="kilometer">Kilometer</form:label>
	<form:input path="kilometer"/>
	
	<form:label path="status">Status</form:label>
	<form:select path="status" items="${groups}"/>
	
	<input type="submit" value="Add">
	</form:form>
</body>
</html>