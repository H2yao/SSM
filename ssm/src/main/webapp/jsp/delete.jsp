<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML>
<html>
	<head>    
		<title>删除</title>
		<%@ include file="main.jsp" %>
	</head>
	<body>
	<div class="container">
		<br>
		<h4>信息删除</h4>
	    <form:form action="/ssm-crud/delete" method="post">
	    	<div class="input-group">
	            <span class="input-group-addon">请输入ID:</span>
	            <input type="text" name="id" class="form-control" >
	        </div>
	        <br>
	    	<input type="submit" class="btn btn-primary" value="确 定"/>
	    	<a href="javascript:history.back()" class="btn btn-primary"> 返 回 </a>
	    </form:form>
	    <br>
	    
    </div>
  </body>
</html>
