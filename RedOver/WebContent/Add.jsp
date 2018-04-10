<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="form" action="<%=request.getContextPath()%>/Add"
		method="post">

		<div class="form-group">
			<label for="exampleInputEmail1">Nombre</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="Nombre"
				name="nom" />
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">E-Mail</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="E-Mail"
				name="correo" />
		</div>

		<button type="submit" class="btn btn-default">Enviar</button>
	</form>
</body>
</html>