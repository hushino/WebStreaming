<%@include file="partials/header.jsp" %>
<html>
<head>

<title>Ver Anime</title>
</head>
<body>
 


<div class="contenedor">
 
 <div class="show">
  <div class="elementoVideo">
	<div class="container" >
		<div class="row">
			<h1>
			<a href="<%=request.getContextPath()%>/Anime">ver anime</a>
				 <c:out value="${capitulos.getTitleCap()}"></c:out>
			</h1>
    <div class="media80">
    <div id="myElement"></div>
  <!-- https://www.w3schools.com/html/mov_bbb.mp4 -->
  <script src="https://content.jwplatform.com/libraries/bfIbW5Pe.js"></script>
  <script>
    var playerInstance = jwplayer("myElement");
    playerInstance.setup({
      file:"../../static/citrus5.mp4",
      width: "100%",
      image: "../../static/image.jpg",
      aspectratio: "16:9",
      playbackRateControls: [0.25, 1, 1.25, 2],
      preload: "metadata"
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