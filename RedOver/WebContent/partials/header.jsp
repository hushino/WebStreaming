<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css"><%@include file="/public/css/style.css" %></style>

 
	<div id="app">

		<header>
			<div class="logo">
				<a href="<%=request.getContextPath()%>">Home</a>
			</div>
			<nav>
				<%-- <a href="<%=request.getContextPath()%>/Anime">Series</a> --%>
			
				<a href="<%=request.getContextPath()%>/Anime">Lista de animes</a>
			
				 <a href="Add.jsp">Crear Nuevo Anime</a>
			</nav>
		</header>

	</div>
 