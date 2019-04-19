<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>产品管理</title>
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
			.from{
				height: 400px;
				width: 400px;
				margin-left: 35%;
				margin-top: 6%;
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
		
		<p class="navbar-text">产品管理</p>
		<table class="table table-bordered">
  			<tr class="info">
  				<td>商品ID</td>
  				<td>图片</td>
  				<td>分类名称</td>
  				<td>价格</td>
  				<td>评论</td>
  			</tr>
  			
			<c:forEach items="${list }" var="product">
			<tr>
				<td>${product.product_id}</td> 
				<td>
					<img src="${product.product_picture }" style="width: 100px; height: 100px;">
				</td> 
				<td>${product.product_type }</td>
				<td>￥${product.product_price }</td> 
				
				<td>
					<a href="${pageContext.request.contextPath}/CommentAction?product_id=${product.product_id}">更多...</a>
				</td> 
			</tr>
			</c:forEach>
		</table>
		
		<form class="from" action="${pageContext.request.contextPath}/ProductUploadAction" method="post"
		enctype="multipart/form-data">
			<div class="form-group">
					<label for="exampleInputEmail1">商品编号</label>
					<input type="text" class="form-control" 
					name="id">
			</div>
			<div class="form-group">
					<label for="exampleInputEmail1">商品类型</label>
					<input type="text" class="form-control" 
					name="type">
			</div>
			<div class="form-group">
					<label for="exampleInputPassword1">商品价格</label>
					<input type="text" class="form-control"
					name="price">
			</div>
			<div class="form-group">
					<label for="exampleInputPassword1">图片位置</label>
					<input id='location' class="form-control" disabled>
					<input type="button" id="i-check" value="浏览" class="btn" onclick="$('#i-file').click();">
					<input type="file" id='i-file'  accept=".jpg" onchange="$('#location').val($('#i-file').val());" 
						style="display: none" name="uploadImg">
					
					<!-- <label for="file" class="btn btn-default">路径</label>
					<input type="file" style="display:none" id="file"
					name="uploadImg"> -->
			</div><br>
			<input  style="margin-left: 60px;" type="submit" class="btn btn-default" value="Submit"/>
			<input  style="margin-left: 80px;" type="reset" class="btn btn-default" value="Reset"/>
		</form>
	</form>
</html>

