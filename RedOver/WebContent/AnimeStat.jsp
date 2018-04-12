<%@include file="partials/header.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${datos.getTitle()}"></c:out>

	<c:forEach items="${datos.getEpisodio()}" var="dato">
		<tr>

			<td><c:out value="${ dato.getTitle() }"></c:out></td>

		</tr>
	</c:forEach>

</body>
</html>