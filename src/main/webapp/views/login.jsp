<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
<body>
	<form method="POST" action="/hoangVietDuc_IT16308/login">
		<div class="col-10 offset-1 mt-5">
			<c:if test="${ not empty sessionScope.error }">
				<div class="alert alert-danger">${ sessionScope.error }</div>
				<c:remove var="error" scope="session" />
			</c:if>

			<div class="col-10 offset-1 mt-5">
				<form method="POST"action="${ pageContext.request.contextPath }/login">
					<div class="mt-3">
						<label for="email">Email</label>
						<input type="email" name="email"id="email"class="form-control" />
					</div>
					<div class="mt-3">
						<label for="password">Password</label> 
						<input type="password"name="password" id="password"class="form-control" />
					</div>
					<div class="mt-3">
						<button class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>

	</form>
</body>
</html>