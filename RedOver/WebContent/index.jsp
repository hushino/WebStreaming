<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola sekai</h1>
	<a href="Add.jsp">link text</a>
	<c:forEach items="${datos}" var="dato">
		<tr>
			<td><c:out value="${dato.getNombre()}"></c:out></td>
		</tr>
	</c:forEach>
</body>
</html>