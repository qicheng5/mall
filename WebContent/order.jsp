<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单管理</title>
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
   				<a href="${pageContext.request.contextPath}/ProductAction_list" style="margin-left: 30px;">产品管理</a>
   				<a href="${pageContext.request.contextPath}/UserAction" style="margin-left: 30px;">用户管理</a>
   				<a href="${pageContext.request.contextPath }/OrderAction_list" style="margin-left: 30px;">订单管理</a>
 			</div>
		</nav>

	<p class="navbar-text">订单管理</p>
		<table class="table table-bordered">
  			<tr class="info">
  				<td>商品ID</td>
  				<td>用户ID</td>
  				<td>状态</td>
  				<td>商品数量</td>
  				<td>价格</td>
  				<td>订单生成时间</td>
  				<td>订单支付时间</td>
  				<td>订单完成时间</td>
  			</tr>
  			
			<c:forEach items="${order }" var="order">
			<tr>
				<td>${order.product_id}</td> 
				<td>${order.user_id}</td> 
				<td>${order.status}</td> 
				<td>${order.number}</td> 
				<td>${order.money}</td> 
				<td>${order.creat_time}</td> 
				<td>${order.pay_time}</td> 
				<td>${order.deliver_time}</td> 
				 
			</tr>
			</c:forEach>
		</table>
</body>
</html>