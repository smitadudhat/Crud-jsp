<%@page import="com.cjc.crudmvc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="crt"  %> --%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href=”bootstrap/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”>
</script>
<script type="text/javascript">
function del() {
	alert("dele");
	document.myform.action="delete";
	document.myform.submit();
}
function edit() {
	alert("edit");
	document.myform.action="edit";
	document.myform.submit();
}

</script>

</head>
<body>
<div class="container">
<form name="myform">
	<h1>Welcome</h1>
<table class="table table-hover" border="2">
<tr>
<th>select</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
</tr>
<%-- <crt:forEach items="${data}" var="stu">
<tr>
<td><input type="radio" name="rollno" value="${stu.rollno}"></td>
<td>${stu.name}</td>
<td>${stu.username}</td>
<td>${stu.password}</td>
</tr>
</crt:forEach> --%>
 
 
  <%List<Student> l=(List<Student>)request.getAttribute("data");
 for(Student s:l)
 {%>
 <tr>
 <td><input type="radio" name="rollno" value="<%=s.getRollno() %>"></td>
 <td><%=s.getName() %></td>
 <td><%=s.getUsername() %></td>
 <td><%=s.getPassword()%></td>
 <%}%> 
 </tr>
</table>
	<div class="form-group">
		<div class="col-sm-3">
		<input type="button" class="btn btn-default" value="EDIT" onclick="edit()">	
		<input type="button" class="btn btn-default"  value="DELETE" onclick="del()">	
<!-- 		<input type="button" class="btn btn-default" value="ADD"   onclick="location.href='register.jsp'">  -->
		</div>
	</div>
</form>
</div>	
</body>
</html>