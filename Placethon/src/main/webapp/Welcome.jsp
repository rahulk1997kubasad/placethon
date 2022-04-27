<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><meta charset="ISO-8859-1">
<title>Placethon</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<style type="text/css">
h1 {text-align: center;}
div {text-align:center;}
.center {
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;
}
body
{	
}
</style>
</head>
<body>
<h1>Welcome to Placethon</h1>
<div class="card center" style="width: 26rem;">
  <img src="images/placethon.png" style="margin:auto; width:170px;" >
  <h2><b>Candidate</b><h2>
  <a href="stureg.jsp"><h4>Register</h4></a>
  <a href="stulog.jsp"><h4>Login</h4></a>
  <br>
  <h2><b>Recruiter</b></h2>
  <a href="recreg.jsp"><h4>Register</h4></a>
   <a href="reclog.jsp"><h4>Login</h4></a>
   <br>
   <h2><b>Admin</b></h2>
  <a href="AdminLogin.jsp"><h4>Login</h4></a>
  </div>
</div>
</body>
</html>