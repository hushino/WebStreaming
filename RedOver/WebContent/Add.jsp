<%@include file="partials/header.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="lel" id="lel" name="form" action="<%=request.getContextPath()%>/Add"
		method="post">
		 
			<label for="exampleInputEmail1">Nombre</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="Nombre"
				name="title" />
		 
			<label for="exampleInputEmail1">sinopsis</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="sinopsis"
				name="sinopsis" />
				
			 
				
			<label for="exampleInputEmail1">frontimage</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="frontimage"
				name="frontimage" />
				
			<label for="exampleInputEmail1">backgroundimage</label> <input type="text"
				class="form-control" id="exampleInputEmail1" placeholder="backgroundimage"
				name="backgroundimage" />
		 
			<select multiple="multiple" name="tags"  size="4" tabindex="1" id="tags">
				<option value="Accion">Accion</option>
				<option value="Aventura">Aventura</option>
				<option value="Seinen">Seinen</option>
				<option value="Yuri">Yuri</option>
			</select>
		 
		 	<select name="type" id="type">
          		<option value="Anime">Anime</option>
          		<option value="OVA">OVA</option>
          		<option value="Pelicula">Pelicula</option>
          		<option value="Corto">Corto</option>
       		 </select>
		
			<select name="state" id="state">
          		<option value="Emision">Emision</option>
          		<option value="Finalizado">Finalizado</option>
       		 </select>
		
		<button type="submit" id="btn" class="btn btn-default">Enviar</button>
	</form>
<!-- 
	<script>
		$('#lel').on('btn', function(e) {
			e.preventDefault();
			var cuisines = $('tags').val().join(',');
		});
	</script>  -->
</body>
</html>