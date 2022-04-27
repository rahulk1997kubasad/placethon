<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recruiter Login</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<style type="text/css">
h1 {text-align: center;}
form {text-align : center;}
.center {
  margin: auto;
  width: 50%;
  border: 2px solid green;
  padding: 10px;
   border: 1px solid;
  box-shadow: 5px 5px 8px #C0C0C0;
}
.formfield{
	padding-left:15px;
	padding-right:15px;
}
</style>
</head>
<body>
	<h1>Recruiter Login</h1>
	<form action="LogrecServlet" method="POST">
	<div class="card center" style="width: 26rem;"><br>
		<div class="mb-3 formfield">
    		<label for="reclogemail" class="form-label" style="float: left;" >Email address</label><br>
    		<input type="email" class="form-control" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" name="reclogemail" id="reclogemail" placeholder="Email Address" required>
  		</div>
  		<div class="mb-3 formfield">
    		<label for="reclogpassword" class="form-label" style="float: left;">Password</label><br>
    		<input type="password" class="form-control" name="reclogpassword" id="reclogpassword" placeholder="Password" required>
  		</div>
  		<div class="mb-3 formfield">
    		<button type="submit" class="btn btn-primary">Login</button>
  		</div>
  		<div class="mb-3 formfield">
    		<p>Not a User: <a href="recreg.jsp"><b>Register</b></a></p>
  		</div>
  		<div>
  			<b>${result}</b>
  		</div>
  	</div>
  	</form>
</body>
</html>