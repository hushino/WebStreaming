<%@include file="partials/header.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
			<div class="caps">
				<c:forEach items="${capitulos}" var="capitulos">
					<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${capitulos.getId()}"/>"><img class="episodeimage"
						src=<c:out value="${capitulos.getImageCap()}"></c:out>
						alt="Mountain View"></a>
						<h4><c:out value="${capitulos.getTitleCap()}"></c:out></h4>
				</c:forEach>
			</div>
		</div>
		<%@include file="partials/footer.jsp"%>
	</div>
</body>

</html>