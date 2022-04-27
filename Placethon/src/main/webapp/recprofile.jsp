<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recruiter Profile</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
         <div class="container">
          		<form action="Updaterecprofile" method="POST">
          		<input type="hidden" name="recid" value="${rec.recid}">
          		<div class="row">
          		<div class="col-5">
    				<label for="recfullname" class="form-label">Name:</label>
    				<input type="text" name="recfullname" id="recfullname" class="form-control" value="${rec.recfullname}" >
  				</div>
  			<div class="col-3">
    			<label for="recemail" class="form-label">Email:</label>
    			<input type="text" name="recemail" id="recemail" class="form-control" value="${rec.recemail}">
  			</div>
  			</div>
  			<div class="row">
          		<div class="col-5">
    				<label for="recmobile" class="form-label">Mobile:</label>
    				<input type="text" name="recmobile" id="recmobile" class="form-control" value="${rec.recmobile}" >
  				</div>
  				<div class="col-5">
    				<label for="reccompname" class="form-label">Company Name:</label>
    				<input type="text" name="reccompname" id="reccompname" value="${rec.reccompname}" class="form-control" >
  				</div>
  			</div>
  			<div class="row">
  			<div class="mb-3 formfield">
    		<button type="submit" class="btn btn-primary">Update</button>
    		<b>${updateresultofrec}</b>
  		</div>
  			</div>
         </form>
        </div>
        </div>
    </div>
</body>
</html>