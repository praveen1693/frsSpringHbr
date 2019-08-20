<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Flights</title>
<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
		td{
			padding:5px;
		}
	</style>
	
</head>
<body>

	<h2>List of Flights</h2>	
	<form:form>
	<table>
		<tr>
			<td>FLIGHT ID</td><td>NAME</td><td>SEATING CAP</td><td>RESERVE CAP</td><td></td>
		</tr>
		<c:forEach items="${flights}" var="flight">
			<tr>
			<td>${flight.flightId}</td>
			<td>${flight.flightName}</td>
			<td>${flight.seatingCap}</td>
			<td>${flight.reserveCap}</td>
							
			<td><a href="<c:url value='/edit-${flight.flightId}-flight' />">${flight.flightId}</a></td>
			<td><a href="<c:url value='/delete-${flight.flightId}-flight' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	</form:form>
</body>
</html>