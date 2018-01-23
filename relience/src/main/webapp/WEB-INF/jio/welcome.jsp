<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Users Details</h3>
	<table border="1">
		<tr>
			<th>Number</th>
			<th>Area</th>
			<th>JioUser</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${users_data}" var="jioUser">
			<tr>
				<td><a href="updateLoc?locId=<c:out value='${jioUser.jioId}'/>">
			    <c:out value="${jioUser.jioNumber}" />
				</a></td>
				<td><c:out value="${jioUser.jioArea}" /></td>
				<td><c:out value="${jioUser.jioUser}" /></td>
				<td><a href="deleteLoc?locId=<c:out value='${JioUser.jioId}'/>">Delete</a></td>

			</tr>
		</c:forEach>
	</table>

	</pre>
	
	<img src="../jioReport.jpeg"/>
</body>
</html>


