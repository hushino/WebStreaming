<%@include file="partials/header.jsp" %>
<head>
<title>Insert title here</title>
</head>
<body>
<div class="contenedor">
		<div class="elemento">
	<form name="form" action="<%=request.getContextPath()%>/Update"
		method="post">
		
		<input type="number" value="<c:out value="${id}"/>" name="id">
		 
			<label for="exampleInputEmail1">Title</label> <input type="text"
				value="<c:out value="${title}" />" class="form-control" id="title"
				placeholder="title" name="title" />

	 
			<label for="exampleInputEmail1">Sinopsis</label> <input type="text"
				value="<c:out value="${sinopsis}" />" class="form-control"
				id="sinopsis" placeholder="sinopsis" name="sinopsis" />
	 
	  
			<label for="exampleInputEmail1">state</label> <input type="text"
				value="<c:out value="${state}" />" class="form-control" id="state"
				placeholder="state" name="state" />
	 

			<label for="exampleInputEmail1">type</label> <input type="text"
				value="<c:out value="${type}" />" class="form-control" id="type"
				placeholder="type" name="type" />
	 
	 
			<label for="exampleInputEmail1">tags</label> <input type="text"
				value="<c:out value="${tags}" />" class="form-control" id="tags"
				placeholder="tags" name="tags" />
		 
	 
			<label for="exampleInputEmail1">frontimage</label> <input type="text"
				value="<c:out value="${frontimage}" />" class="form-control"
				id="frontimage" placeholder="frontimage" name="frontimage" />
		 
	 
			<label for="exampleInputEmail1">backgroundimage</label> <input
				type="text" value="<c:out value="${backgroundimage}" />"
				class="form-control" id="backgroundimage"
				placeholder="backgroundimage" name="backgroundimage" />
		 
		 <label for="exampleInputEmail1">titleCap</label> <input type="text"
				class="form-control" id="titleCap" placeholder="titleCap"
				name="titleCap" />
			<label for="exampleInputEmail1">imageCap</label> <input type="text"
				class="form-control" id="imageCap" placeholder="imageCap"
				name="imageCap" />
			<label for="exampleInputEmail1">chapter</label> <input type="text"
				class="form-control" id="chapter" placeholder="chapter"
				name="chapter" />
			<label for="exampleInputEmail1">server</label> <input type="text"
				class="form-control" id="server" placeholder="server"
				name="server" />
				
			<input type="number" value="<c:out value="${id}"/>" name="parentId">
			 

		<button type="submit" class="btn btn-default">Enviar</button>
	</form>
</div>

</div>

<%-- <form name="form" action="<%=request.getContextPath()%>/Update"
		method="post"> --%>
		
			<!-- <label for="exampleInputEmail1">title</label> <input type="text"
				class="form-control" id="title" placeholder="title"
				name="title" />
			<label for="exampleInputEmail1">imageCap</label> <input type="text"
				class="form-control" id="imageCap" placeholder="imageCap"
				name="imageCap" />
			<label for="exampleInputEmail1">chapter</label> <input type="text"
				class="form-control" id="chapter" placeholder="chapter"
				name="chapter" />
			<label for="exampleInputEmail1">server</label> <input type="text"
				class="form-control" id="server" placeholder="server"
				name="server" /> -->
		

<!-- <button type="submit" class="btn btn-default">Enviar Nuevo Capitulo</button>
	</form> -->
</body>
<%@include file="partials/footer.jsp"%>
</html>