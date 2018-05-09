<%@include file="partials/header.jsp"%>
<head>
<title>Index</title>
</head>
<body>
	<div class="contenedor">
		<div class="elemento">
		<form action="<%=request.getContextPath()%>/Login" method="post">
		Enter username : <input type="text" name="username"><br>
		Enter password : <input type="password" name="pass"><br>
		<input type="submit" value="login" > 
		</form>
		</div>
	</div>
</body>
<%@include file="partials/footer.jsp"%>
</html>