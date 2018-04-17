<%@include file="partials/header.jsp" %>
<head>
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
<%@include file="partials/footer.jsp"%>

</html>