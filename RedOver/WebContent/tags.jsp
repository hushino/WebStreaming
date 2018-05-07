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
			<h4>
				<c:out value="${tags.getTagName()}"></c:out>
			</h4>
			 <%--  <h4>
				<c:out value="${tags.getAnime()}"></c:out>
			</h4>  --%> 
		<%-- 	<c:forEach var="row" items="${tags.getAnime()}">
				<tr>
					<c:forEach var="i" items="${row}">
						<td>${i}</td>
					</c:forEach>
				</tr>
			</c:forEach> --%>
		    <c:forEach items="${tags.getAnimes()}" var="tag">
				<h4>
					<c:out value="${tag.getTitle() }"></c:out>
				</h4>
			</c:forEach> 

			<%-- <c:forEach items="${tag}" var="tags">
				<h4>
					<c:out value="${tags.getTagName()}"></c:out>
				</h4>
			</c:forEach>
			<c:forEach items="${tag}" var="tags" >
				<h4>
				${tags.getAnimes() }
				 
					<c:out value="${tags.getTitle()}"></c:out>
				</h4>
			</c:forEach> --%>

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