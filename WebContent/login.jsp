<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商城后台管理</title>
		<link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style type="text/css">
			body{
				background-image: url(img/login.jpg);
				background-repeat: no-repeat;
				background-position: center;
				background-attachment:fixed;
				weith:100%;
			}
			.from{
				height: 400px;
				width: 400px;
				margin-left: 35%;
				margin-top: 15%;
			}
		</style>
</head>
<body>
	<form class="from" action="${pageContext.request.contextPath}/LoginAction" method="post">
		<div class="form-group">
				<label for="exampleInputEmail1">User name</label>
				<input type="text" class="form-control" id="user" placeholder="User name" required="required"
				name="name">
		</div>
		<div class="form-group">
				<label for="exampleInputPassword1">Password</label>
				<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"
				name="passwd">
		</div><br>
		<input  style="margin-left: 60px;" type="submit" class="btn btn-default" value="Submit"/>
		<input  style="margin-left: 80px;" type="reset" class="btn btn-default" value="Reset"/>
	</form>
</body>
</html>