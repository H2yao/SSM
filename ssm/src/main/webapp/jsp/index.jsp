<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="main.jsp" %>
		<meta http-equiv="Content-Type" content="text/html">
		<title>SSM-CRUD</title>
	</head>
	<body>
		<div class="container">
			<br>
			<h3>Spring+SpringMVC+Mybatis —— CRUD</h3>
			<br>
				<a href="/ssm-crud/jsp/add.jsp" class="btn btn-primary">新 增</a>
				<a href="/ssm-crud/jsp/delete.jsp" class="btn btn-primary">删 除</a>
				<a href="/ssm-crud/update" class="btn btn-primary">修 改</a>
				<a href="/ssm-crud/show" class="btn btn-primary">查 询</a>
		</div>
	</body>
</html>