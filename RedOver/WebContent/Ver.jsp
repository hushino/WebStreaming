<%@include file="partials/header.jsp" %>ml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${capitulos.getTitle()}"></c:out>
<a href="<%=request.getContextPath()%>/Anime">ver anime</a>
</body>
</html>