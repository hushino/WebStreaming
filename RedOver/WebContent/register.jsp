<%@include file="partials/header.jsp"%>
<head>
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
		<form class="register" id="register" name="form" action="<%=request.getContextPath()%>/register"
		method="post">
		 
			<label for="nombre">Nombre</label> <input type="text"
				class="form-control" id="nombre" placeholder="Nombre"
				name="nombre" />
		 
			<label for="password">Contraseņa</label> <input type="text"
				class="form-control" id="password" placeholder="password"
				name="password" />
				
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
		
		<button type="submit" id="btn" class="btn btn-default">Enviar</button>
	</form>
		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>