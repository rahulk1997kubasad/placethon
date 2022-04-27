<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">

</head>
<body>
	<jsp:include page="adminnav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        <h3>Add Candidate</h3>
        		 <div class="container">
          		<form action="Addstufromadminservlet" method="POST">
          		<div class="row">
          		<div class="col-5">
    				<label for="sturegemail" style="float: left;" class="form-label">Email address</label><br>
    				<input type="email" class="form-control" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" name="sturegemail" id="sturegemail" placeholder="Email Address" required>
  				</div>
  			<div class="col-5">
    			<label for="sturegfullname" class="form-label" style="float: left;">Full Name</label><br>
    		<input type="text" class="form-control" name="sturegfullname" id="sturegfullname" placeholder="User Name" required>
  			</div>
			</div>
			<div class="row">
          		<div class="col-5">
    				<label for="sturegmobile" class="form-label" style="float: left;">Mobile No</label><br>
    				<input type="text" class="form-control" name="sturegmobile" id="sturegmobile" placeholder="Mobile No" required>
  				</div>
  			<div class="col-5">
    			<label class="form-label" style="margin-top:40px">Gender :</label>	
  			<input type="radio" name="gender" value="m" required> Male
			<input type="radio" name="gender" value="f" required> Female
  			</div>
			</div>
			<div class="row">
			<div class="col-5">
				<div class="mb-3 formfield">
    				<label for="sturegpassword" class="form-label" style="float: left;">Password</label>
   					<input type="password" name="sturegpassword" class="form-control" id="sturegpassword" required>
  				</div>
  				</div>
			</div>
			<div class="row">
			<div class="col-5">
				<button type="submit" class="btn btn-primary">Register</button>
				</div>
			</div>
			</form>
			</div>
		</div>
    </div>
</body>
</html>