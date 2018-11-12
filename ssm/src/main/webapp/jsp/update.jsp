<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <jsp:useBean id="command" class="com.gan.model.Student" scope="request" /> --%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <%@ include file="main.jsp" %>
    <title>修改</title>
  </head>
<!--   <script src="/ssm-crud/js/jquery-3.0.0.min.js"></script>
  <script src="/ssm-crud/js/bootstrap.min.js"></script> -->
  <script>
  	$(function(){
  	var value=$("#studentSelect").val()
  	getValue(value)
  		$("#studentSelect").change(function(){
  			var v_id=$(this).val()
  			getValue(v_id)
  		})
  	})
  	
  	function getValue(stuNo){
  		$.post("studentSelect",
  			 {
  			 	id:stuNo
  			 },
  			 function(data){
  			 	$("#name").val(data.sname)
  			 	$("#marks").val(data.sage)  			 	
  			 })
  	}
  	
  </script>
  <body>
  <div class="container">
	    <form:form action="/ssm-crud/updateDeal" modelAttribute="stu" method="post">
	    	<br>
	    	<h4>信息修改</h4>
	    	<table class="table table-striped" border="1">
	    		<tr>
	    			<td><form:label path="id">ID</form:label></td>
	    			<td>
						<form:select path="id" id="studentSelect">
							<form:options path="id" items="${idList}"/>
						</form:select>
					</td>
	    		</tr>
	    		<tr>
	    			<td><form:label path="sname">姓名</form:label></td>
	    			<td><form:input path="sname" id="name"/></td>
	    		</tr>
	    		<tr>
	    			<td><form:label path="sage">年龄</form:label></td>
	    			<td><form:input path="sage" id="marks"/></td>
	    		</tr>
	    	</table>
	    	<input type="reset" class="btn btn-primary" value="重 置"/>
	    	<input type="submit" class="btn btn-primary" value="确 定"/>
	    	<a href="javascript:history.back()" class="btn btn-primary"> 返回 </a>
	    </form:form>
  	</div>
  </body>
</html>
