<%@include file="partials/header.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
	<c:out value="${datos.getTitle()}"></c:out>

 
	<c:forEach items="${datos.getEpisodio()}" var="dato">
		<tr>

			<td><c:out value="${ dato.getTitleCap() }"></c:out></td>

		</tr>
	</c:forEach>
</div>
</div>
</body>
</html>