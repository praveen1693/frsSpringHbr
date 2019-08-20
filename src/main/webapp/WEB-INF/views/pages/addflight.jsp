<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Flight</title>
</head>
<body>
	<h2>Add Flight Details</h2>
	<form:form modelAttribute="flight" method="post" align="center">
		<label>Flight ID</label>
		<form:input path="flightId"/><br/>
		<label>Flight Name</label>
		<form:input path="flightName"/><br/>
		<label>Seating Capacity</label>
		<form:input path="seatingCap"/><br/>
		<label>Reservation Capacity</label>
		<form:input path="reserveCap"/><br/>
		<input type="submit" value="Add Flight"/>
	</form:form>
</body>
</html>