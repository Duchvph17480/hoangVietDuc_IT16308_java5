<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<marquee>Hello Hoang Viet Duc</marquee>
	</h1>
	<h1>${ahihi}</h1>
	<p>hello ${myus.name}</p>
	<form action="${ pageContext.request.contextPath }/upload-hello" method="POST"
		enctype=multipart/form-data>
		<input type="file" name ="upload_file">
		<button> submit</button>
	</form>
</body>
</html>