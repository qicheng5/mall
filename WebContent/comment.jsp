<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>商品评价</title>
	<link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<style type="text/css">
			body { padding-top: 70px; }
			.container {
				display: flex;
				font-family: "微软雅黑";
				font-size: large;
				align-items: center;
			}
		
	</style>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<p class="navbar-text">后台</p>
			<a href="${pageContext.request.contextPath}/ProductAction" style="margin-left: 30px;">产品管理</a>
			<a href="${pageContext.request.contextPath}/UserAction" style="margin-left: 30px;">用户管理</a>
			<a href="${pageContext.request.contextPath }/OrderAction_list" style="margin-left: 30px;">订单管理</a>
		</div>
	</nav>

	<p class="navbar-text">用户评论</p>

	<table class="table table-bordered">
		<tr class="info">
			<td>用户ID</td>
			<td>内容</td>
			<td>时间</td>
		</tr>
		
		<c:forEach items="${comment }" var="c">
			<tr>
				<td>${c.user_id}</td> 
				<td>${c.describe }</td>
				<td>${c.date }</td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>