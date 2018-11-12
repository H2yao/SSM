<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:useBean id="command" class="com.example.model.Student" scope="request" />
<!DOCTYPE HTML>
<html>
	<head>    
		<title>新增</title>
		<%@ include file="main.jsp" %>
	</head>
  <body>
  <div class="container">
    <form:form action="/ssm-crud/add" method="post">
    	<br>
    	<h4>信息新增</h4>
    	<table class="table table-striped" border="1">
    		<tr>
    			<td><form:label path="id">ID</form:label></td>
    			<td><form:input path="id"/></td>
    		</tr>
    		<tr>
    			<td><form:label path="sname">姓名</form:label></td>
    			<td><form:input path="sname"/></td>
    		</tr>
    		<tr>
    			<td><form:label path="sage">年龄</form:label></td>
    			<td><form:input path="sage"/></td>
    		</tr>
    	</table>
    	<input type="reset" class="btn btn-primary" value="重 置"/>
    	<input type="submit" class="btn btn-primary" value="确 定"/>
    	<a href="javascript:history.back()" class="btn btn-primary"> 返回 </a>
    </form:form>
    
    </div>
  </body>
</html>
