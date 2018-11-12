<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<%@ include file="main.jsp" %>
		<title>查询</title>
	</head>
	<body>
		<div class="container">
			<br>
			<h4>信息查询</h4>
			<table border="1" class="table table-striped">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>年龄</th>
				</tr>
			    <c:forEach items="${user}" var="us">
			    	<tr>
			    		<td>${us.id}</td>
			    		<td>${us.sname}</td>
			    		<td>${us.sage}</td>
			    	</tr>
			    </c:forEach>
			</table>
			<a href="javascript:history.back()" class="btn btn-primary"> 返 回 </a>
		</div>
	</body>
</html>
