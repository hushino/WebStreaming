<%@include file="partials/header.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
			
				<c:forEach items="${capitulos}" var="capitulos">
				<div class="caps">
					<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${capitulos.getId()}"/>"><img class="episodeimage"
						src=<c:out value="${capitulos.getImageCap()}"></c:out>
						alt="Mountain View"></a>
						<h4><c:out value="${capitulos.getTitleCap()}"></c:out></h4>
						</div>
				</c:forEach>
		</div>
		<%@include file="partials/footer.jsp"%>
	</div>
</body>

</html>