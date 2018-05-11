<%@include file="partials/header.jsp"%>
<head>
<title>Insert title here</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
			<c:out value="${datos.getTitle()}"></c:out>
			<c:forEach items="${datos.getEpisodio()}" var="dato">
			<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${dato.getId()}"/>">
					<img class="episodeimage"
						src=<c:out value="${dato.getImageCap()}"></c:out>
						alt="Mountain View"></a>
						<h4><c:out value="${dato.getTitleCap()}"></c:out></h4>
			 
			</c:forEach>
			<c:forEach items="${datos.getTags()}" var="tag">
				<tr>
					<a href="<%=request.getContextPath()%>/Tags?id=<c:out value="${tag.getId()}"/>"><c:out value="${ tag.getTagName() }"></c:out></a>
				</tr>
			</c:forEach>
		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>

</html>