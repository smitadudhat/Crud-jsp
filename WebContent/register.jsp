<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<form action="reg" class="form-horizontal">
	<div class="form-group">
		<div class="col-sm-3">
			  <label class="control-label col-sm-2" for="name">Name:-</label>
			  <input type="text" class="form-control" name="name">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-3">
			  <label class="control-label col-sm-2" for="username">Username:-</label>
			  <input type="text" class="form-control" name="username">
		</div>
	</div>
<div class="form-group">
		<div class="col-sm-3">
			  <label class="control-label col-sm-2" for="password">Password:-</label>
			  <input type="text" class="form-control" name="password">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-3">
			<input type="submit" class="btn btn-default" value="register">
		</div>
		</div>	
	</form>
</body>
</html>