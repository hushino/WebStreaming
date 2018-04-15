<%@include file="partials/header.jsp"%>
<head>
<%@ page pageEncoding="UTF-8" %>
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
				<c:forEach items="${capitulos}" var="capitulos">
				<div class="caps">
				<%-- <c:url var="url" value="Ver.jsp">
					<c:param name="id" value="${capitulos.getTitleCap()}"></c:param>
				</c:url> --%>
				<a href="${url}">link</a>
					<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${capitulos.getId()}"/>"><img class="episodeimage"
						src=<c:out value="${capitulos.getImageCap()}"></c:out>
						alt="Mountain View"></a>
						<h4><c:out value="${capitulos.getTitleCap()}"></c:out></h4>
						</div>
				</c:forEach>
		</div>
	</div>
	<%@include file="partials/footer.jsp"%>
</body>
</html>