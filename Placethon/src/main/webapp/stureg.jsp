<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
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
	<h1>Candidate Registration</h1><br>
	<form action="Addstuservlet" method="POST">
	<div class="card center" style="width: 26rem;"><br>
		<div class="mb-3 formfield">
    		<label for="sturegemail" style="float: left;" class="form-label">Email address</label><br>
    		<input type="email" class="form-control" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" name="sturegemail" id="sturegemail" placeholder="Email Address" required>
  		</div>
  		<div class="mb-3 formfield">
    		<label for="sturegfullname" class="form-label" style="float: left;">Full Name</label><br>
    		<input type="text" class="form-control" name="sturegfullname" id="sturegfullname" placeholder="User Name" required>
  		</div>
  		<div class="mb-3 formfield">
  			<label for="sturegmobile" class="form-label" style="float: left;">Mobile No</label><br>
    		<input type="text" class="form-control" name="sturegmobile" id="sturegmobile" placeholder="Mobile No" required>
  		</div>
  		<div class="mb-3 ">
  			<label class="form-label" >Gender :</label>	
  			<input type="radio" name="gender" value="m" required> Male
			<input type="radio" name="gender" value="f" required> Female
  		</div>
  		<div class="mb-3 formfield">
    		<label for="sturegpassword" class="form-label" style="float: left;">Password</label>
   			<input type="password" name="sturegpassword" class="form-control" id="sturegpassword" required>
  		</div>
  		<div class="mb-3 formfield">
    		<button type="submit" class="btn btn-primary">Register</button>
  		</div>
  		<div><b>${result}</b></div>
  		<div class="mb-3 formfield">
    		<p>Already a User: <a href="stulog.jsp"><b>Login</b></a></p>
  		</div>
  	</div>
	</form>
</body>
</html>