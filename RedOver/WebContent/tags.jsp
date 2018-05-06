<%@include file="partials/header.jsp"%>
<head>
<title>Tags</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
			<%-- hacer un select tagName from Tags, para que funcione
			 <h4>
				<c:out value="${tag.getTagName()}"></c:out>
			</h4> --%> 
			
			<c:forEach items="${tag}" var="tags">
				<h4>
					<c:out value="${tags.getTagName()}"></c:out>
				</h4>
			</c:forEach>
			<c:forEach items="${tag.getAnimes()}" var="tags">
				<h4>
					<c:out value="${tags.getTitle()}"></c:out>
				</h4>
			</c:forEach>
			
			<%-- <c:forEach items="${tag.getAnimes()}" var="tags">
				<tr>

					<td><c:out value="${ tags.getTitle()}"></c:out></td>

				</tr>
			</c:forEach> --%>
			
			<%-- <c:forEach items="${tag}" var="tags">
				<tr>

					<td><c:out value="${tags.getId()}"></c:out></td>

				</tr>
			</c:forEach>
 --%>
			<%--  <c:forEach items="${tag.getAnimes()}" var="tags">
				<h4>
					<c:out value="${tags.getTitle()}"></c:out>
				</h4>
			</c:forEach> --%>

		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>