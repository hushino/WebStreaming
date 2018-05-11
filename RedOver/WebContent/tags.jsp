<%@include file="partials/header.jsp"%>
<head>
<title>Tags</title>
</head>
<body>
	<!-- mostrar los animes que pertenecen al tag id -->
	<div class="contenedor">
		<div class="elemento">
			<h4>
				<c:out value="${tags.getTagName()}"></c:out>
			</h4>
			<%-- <c:out value="${tags.getAnimes() }"></c:out> --%>
			
			  <c:forEach items="${tags.getAnimes()}" var="tag">
			
				<h4>
					<c:out value="${tag.getTitle() }"></c:out>
				</h4>
			</c:forEach>   

		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>