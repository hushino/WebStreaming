<%@include file="partials/header.jsp" %>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Anime</title>
</head>
<body>

<c:forEach items="${datos}" var="dato">
		<tr>
			<td><c:out value="${dato.getTitle()}"></c:out></td>
			<td><a
				href="<%=request.getContextPath()%>/Show?id=<c:out value="${dato.getId()}" />">Ver</a>
			</td>
			<td><a
				href="<%=request.getContextPath()%>/Editar?id=<c:out value="${dato.getId()}" />">Editar</a>
			</td>
			<td><a
				href="<%=request.getContextPath()%>/Delete?id=<c:out value="${dato.getId()}" />">Eliminar</a>
			</td>
		</tr>
	</c:forEach>

</body>
</html>