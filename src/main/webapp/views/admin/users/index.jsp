<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
	<div class="col-10 offset-1 mt-5 border border-primary p-2">
		<form method="GET"
			action="${ pageContext.request.contextPath }/admin/users">
			<div class="row col-12 mt-2">
				<div class="col-6">
					<label>Sắp xếp theo</label> <select name="sort_by"
						class="form-control">
						<option value="id">Mặc định</option>
						<option value="username">Họ Tên</option>
						<option value="email">Email</option>
						<option value="admin">Tài khoản</option>
						<option value="activated">Trạng thái</option>
					</select>
				</div>
				<div class="col-6">
					<label>Thứ tự</label> <select name="sort_direction"
						class="form-control">
						<option value="asc">Tăng dần</option>
						<option value="desc">Giảm dần</option>
					</select>
				</div>
			</div>

			<div>
				<button class="btn btn-primary mt-4">Lọc</button>
				<a href="${ pageContext.request.contextPath }/admin/users"
					class="btn btn-danger mt-4" type="reset"> Reset </a>
			</div>
		</form>
	</div>

	<div class="mt-5 col-10 offset-1 border border-primary p-2">
		<div class="">
			<a class="btn btn-success col-1"
				href="${ pageContext.request.contextPath }/admin/users/create">Create</a>
		</div>
		<table class="table table-strip table-hover table-bordered mt-3">
			<thead>
				<tr>
					<td>Id</td>
					<td>Username</td>
					<td>Email</td>
					<td>Tài khoản</td>
					<td>Trạng thái</td>
					<td colspan="2" class="text-center">Thao tác</td>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${ pageData.content }" var="user">
					<tr>
						<td>${user.id}</td>
						<td>${user.username}</td>
						<td>${user.email}</td>
						<td>${user.admin==1?"Admin":"User"}</td>
						<td>${user.activated==1?"Đang Hoạt Động":"Vô Hiệu Hóa"}</td>
						<td><a class="btn btn-primary"
							href="${ pageContext.request.contextPath }/admin/users/edit/${user.id}">Update</a>
						</td>
						<td>
							<form
								action="${ pageContext.request.contextPath }/admin/users/delete/${user.id}"
								method="POST">
								<button class="btn btn-danger">Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<c:if test="${not empty pageData.content }">
				<ul class="pagination">
					<c:forEach begin="0" end="${ pageData.totalPages - 1 }"
						varStatus="page">
						<li class="page-item"><a class="page-link"
							href="${ pageContext.request.contextPath }/admin/users?page=${ page.index }">${ page.index + 1 }</a>
						</li>
					</c:forEach>
				</ul>
			</c:if>
		</div>
	</div>
</body>
</html>