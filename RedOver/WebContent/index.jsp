<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Hola sekai</h1>
	<a href="Add.jsp">Crear Nuevo Anime</a>

	<div class="elemento">
		<c:forEach items="${capitulos}" var="capitulos">

			<div class="caps">

				<c:out value="${capitulos.getTitle()}"></c:out>
				<img src=<c:out value="${capitulos.getImageCap()}"></c:out>
					alt="Mountain View"> 
					<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${capitulos.getId()}" />">ver</a>
			</div>
		</c:forEach>
	</div>
</body>
</html>