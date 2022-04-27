<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="adminnav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        	<div class="card" style="width: 60srem;">
       		<h3 style="text-align:center;">Candidate Details</h3>
  			<div class="card-body">
  				<div class="container">
          		<form action="Showstudprofileservlet" method="POST">
          		<input type="hidden" name="stuid" value="${showsinglestutoadmin.stuid}">
          		<div class="row">
          		<div class="col-5">
    				<label for="stufullname" class="form-label">Name:</label>
    				<input type="text" name="stufullname" id="stufullname" class="form-control" value="${showsinglestutoadmin.stufullname}" >
  				</div>
  			<div class="col-3">
    			<label for="stuemail" class="form-label">Email:</label>
    			<input type="text" name="stuemail" class="form-control" value="${showsinglestutoadmin.stuemail}">
  			</div>
  			</div>
  			<div class="row">
          		<div class="col-5">
    				<label for="stumobile" class="form-label">Mobile:</label>
    				<input type="text" name="stumobile" class="form-control" value="${showsinglestutoadmin.stumobile}" >
  				</div>
  				<div class="col-5">
    				<label for="stulinktodrive" class="form-label">Link To Drive:</label>
    				<input type="text" name="stulinktodrive" value="${showsinglestutoadmin.linkforresume}" class="form-control"
    				placeholder="Drive link of Resume" >
  				</div>
  			</div>
  			<div class="row">
  			<div class="mb-3 formfield">
    		<button type="submit" class="btn btn-primary">Update</button>
    		<b>${resultofstutoadmin}</b>
  		</div>
  			</div>
         </form>
        </div>
  			</div>
		</div>
		</div>
    </div>
</body>
</html>