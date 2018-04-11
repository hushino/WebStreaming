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
	<form name="form" action="<%=request.getContextPath()%>/Update"
		method="post">
		<input type="number" value="<c:out value="${id}"/>" name="id">
		<div class="form-group">
			<label for="exampleInputEmail1">Nombre</label> <input type="text"
				value="<c:out value="${correo}" />" class="form-control"
				id="nombre" placeholder="Nombre" name="correo" />

		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">E-Mail</label> <input type="text"
				value="<c:out value="${nombre}" />" class="form-control"
				id="correo" placeholder="E-Mail" name="nombre" />
		</div>

		<button type="submit" class="btn btn-default">Enviar</button>
	</form>
	
</body>
</html>