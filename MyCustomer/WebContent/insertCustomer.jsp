<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Customer</title>
		 <meta charset="utf-8">
		 <meta name="viewport" content="width=device-width, initial-scale=1">
		 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<h1>New Customer</h1>
			<hr>
			<form action="/MyCustomer/insertCustomerServlet" method="post">
				
				Name:<input type="text" class="form-control" id="name" name="name" value="">
				<br>
				Email:<input type="text" class="form-control"  id="email" name="email" value="">
				<br>
				Phone:<input type="text" class="form-control"  id="phone" name="phone" value="">
				<br>
				<button type="submit" value="save" class="btn btn-success">Success</button>
			</form>
		</div>	
	</body>
</html>


