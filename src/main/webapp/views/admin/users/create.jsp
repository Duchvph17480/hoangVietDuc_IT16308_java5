<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light px-5">
		<a class="navbar-brand" href="#">Navbar</a>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Users</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Categories</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Products</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="mt-5 col-10 offset-1 border border-primary p-2">
		<form:form method="POST"
			action="/hoangVietDuc_IT16308/admin/users/store"
			modelAttribute="user">
			<div class="form-group mt-3">
				<label>Email</label>
				<form:input path="email" type="email" class="form-control"/>
				<form:errors path="email" element="span" cssClass="text-danger" />
			</div>
			<div class="form-group mt-3">
				<label>Username</label>
				<form:input path="username" class="form-control"/>
				<form:errors path="username" element="span" cssClass="text-danger" />
			</div>
			<div class="form-group mt-3">
				<label>Password</label>
				<form:password path="password" class="form-control" />
				<form:errors path="password" element="span" cssClass="text-danger" />
			</div>
			<div class="form-group mt-3">
				<label for="photo">Image</label>
				<form:input path="photo" name="photo" id="photo" type="file" class="form-control"/>
			    <form:errors path="photo" element="span" cssClass="text-danger" />
			</div>
			<div class="form-group mt-3">
				<label>Activated</label>
				<form:select path="activated" class="form-control">
					<form:option value="0">Hoạt Động</form:option>
					<form:option value="1">K HD</form:option>
					<form:errors path="activated" element="span" cssClass="text-danger" />
				</form:select>
			</div>
			<div class="form-group mt-3">
				<label>Admin</label>
				<form:select path="admin" class="form-control">
					<form:option value="0">Member</form:option>
					<form:option value="1">Admin</form:option>
					<form:errors path="admin" element="span" cssClass="text-danger" />
				</form:select>
			</div>
			<button class="btn btn-primary">Save</button>
		</form:form>
	</div>
</body>
</html>