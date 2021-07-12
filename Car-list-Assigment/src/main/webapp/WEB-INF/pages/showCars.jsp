<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show cars</title>
<style type="text/css">

table{
border:2px solid blue;
order-collapse:collapse;
margin-left:auto;
margin-right:auto;
}

tr,th,td{
border:2px solid blue;
}
</style>

</head>
<body>

<!--<c:out value="${list}"/>-->
<table>
<tr>
<th>Id</th>
<th>Model</th>
<th>Year of Manufacture</th>
<th>Kilometer</th>
<th>Status</th>
</tr>

<c:forEach items="${list}" var="eachItem">
<tr>
<td><c:out value="${eachItem.id}"/></td>
<td><c:out value="${eachItem.model}"/></td>
<td><c:out value="${eachItem.yearOfManufacture}"/></td>
<td><c:out value="${eachItem.kilometer}"/></td>
<td><c:out value="${eachItem.status}"/></td>
</tr>
</c:forEach>


</table>
</body>
</html>