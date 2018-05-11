<%@include file="partials/header.jsp"%>
<head>
<title>Tags</title>
</head>
<body>
	<!-- mostrar los animes que pertenecen al tag id -->
	<div class="contenedor">
		<div class="elemento">

		
				<c:forEach items="${tags.getAnimes()}" var="tag">
					<div class="sada1">
					<a
						href="<%=request.getContextPath()%>/Show?id=<c:out value="${tag.getId()}" />"><img
						class="image" id="image-home"
						src=<c:out value="${tag.getFrontimage()}"></c:out>
						alt="Card image cap"></a>
					<h4>
						<c:out value="${tag.getTitle() }"></c:out>
					</h4>
					<h4>
						<c:out value="${tags.getTagName()}"></c:out>
					</h4>
			</div>
			</c:forEach>

		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>