<%@include file="partials/header.jsp"%>
<head>
<title>Tags</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
		  <%-- 	<h4>
				<c:out value="${tages}"></c:out>
			</h4>   --%>

			  <c:forEach items="${tages}" var="tag">
				<h4>
				<a href="<%=request.getContextPath()%>/Show?id=<c:out value="${tag.getIdParent() }" />">VER</a>
					<c:out value="${tag.getTagName() }"></c:out>
				</h4>
				<br></br>
				<h4>
					<c:out value="${tag.getIdParent() }"></c:out>
				</h4>
			</c:forEach> 
			 
		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>