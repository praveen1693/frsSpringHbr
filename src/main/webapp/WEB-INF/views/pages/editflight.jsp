<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Flight Details</title>
</head>
<body>

	<h2>Update Flight Details</h2>
	<form:form modelAttribute="flight" method="post" align="center">
		<c:forEach items="${flight}" var="ft">
		<label>Flight ID</label>
		<form:input path="flightId" value="${ft.flightId}"/><br/>
		<label>Flight Name</label>
		<form:input path="flightName" value="${ft.flightName}"/><br/>
		<label>Seating Capacity</label>
		<form:input path="seatingCap" value="${ft.seatingCap}"/><br/>
		<label>Reservation Capacity</label>
		<form:input path="reserveCap" value="${ft.reserveCap}"/><br/>
		<input type="submit" value="Update"/>
		</c:forEach>
	</form:form>

</body>
</html>