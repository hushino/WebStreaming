<%@include file="partials/header.jsp"%>
<head>
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
				<c:forEach items="${capitulos}" var="capitulos">
				<div class="caps">
				
				<%-- http://localhost:8080/RedOver/Tags?id=1
				
		        <c:url var="titleCap" value="Ver.jsp">
					<c:param name="titleCap" value="${capitulos.getTitleCap()}"></c:param>
				</c:url>  
				<a href="<%=request.getContextPath()%>/${titleCap}">link</a> --%>
				<%
				response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
				response.setHeader("Pragma", "no-cache"); // HTTP 1.0
				response.setHeader("Expires", "0"); // Proxies
				if(session.getAttribute("username")==null){
					response.sendRedirect("Login.jsp");
				}
				%>
				<form action="<%=request.getContextPath()%>/Logout"> <input type="submit" value="Logout"></form>
				Welcome <c:out value="${username }"></c:out>
					<a href="<%=request.getContextPath()%>/Ver?id=<c:out value="${capitulos.getId()}"/>">
					<img class="episodeimage"
						src=<c:out value="${capitulos.getImageCap()}"></c:out>
						alt="Mountain View"></a>
						<h4><c:out value="${capitulos.getTitleCap()}"></c:out></h4>
						</div>
				</c:forEach>
		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>