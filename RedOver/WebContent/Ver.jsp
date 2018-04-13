<%@include file="partials/header.jsp"%>
 
<html>
<head>
<title>Ver Anime</title>
</head>
<body>
	<div class="contenedor">
		<div class="show">
			<div class="elementoVideo">
				<div class="container">
					<div class="row">
						<h1><%--  <%@include file="/public/static/image1.png" %> --%>
							<a href="<%=request.getContextPath()%>/Anime">ver anime</a>
							<c:out value="${capitulos.getTitleCap()}"></c:out>
						</h1>
						<div class="media80">
							<div id="myElement"></div>
							<!-- https://www.w3schools.com/html/mov_bbb.mp4 -->
							<script
								src="https://content.jwplatform.com/libraries/bfIbW5Pe.js"></script>
							<script>
								var playerInstance = jwplayer("myElement");
								playerInstance
										.setup({
											file : "http://i.4cdn.org/gif/1523546765559.webm",
											width : "100%",
											image : "https://cdn.discordapp.com/attachments/423287746547810324/434381755458256897/Comic_2.mp4_snapshot_22.56.jpg",
											aspectratio : "16:9",
											playbackRateControls : [ 0.25, 1, 1.25, 2 ],
											preload : "metadata"
										});
							</script>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>