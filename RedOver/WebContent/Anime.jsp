<%@include file="partials/header.jsp" %>
<head>
<title>Anime</title>
</head>
<body>
<div class="contenedor">
<div class="elemento">

<c:forEach items="${datos}" var="dato" >
<div class="sada1">
		<a href="<%=request.getContextPath()%>/Show?id=<c:out value="${dato.getId()}" />"><img class="image" id="image-home"
						src=<c:out value="${dato.getFrontimage()}"></c:out>
						alt="Card image cap"></a>
		 
			<h4><c:out value="${dato.getTitle()}"></c:out></h4>
			<h4><a
				href="<%=request.getContextPath()%>/Editar?id=<c:out value="${dato.getId()}" />">Editar</a>
			</h4>
			<h4><a
				href="<%=request.getContextPath()%>/Delete?id=<c:out value="${dato.getId()}" />">Eliminar</a>
			</h4>
			</div>
	</c:forEach>
	
	
</div>
</div>
</body>
<%@include file="partials/footer.jsp"%>

</html>