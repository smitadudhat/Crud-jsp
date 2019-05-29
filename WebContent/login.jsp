<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<form action="login" class="form-horizontal">
	
	<div class="form-group">
		<div class="col-sm-3">
			  <label class="control-label col-sm-2" for="username">Username:-</label>
			  <input type="text" class="form-control" name="username">
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-3">
		  <label class="control-label col-sm-2" for="password">Password:-</label>
			<input type="password" class="form-control" name="password">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-3">
			<input type="submit" class="btn btn-default" value="login">
			<a href="register.jsp">Register here</a>
		</div>
	</div>
	</form>
</div>
	
</body>
</html>