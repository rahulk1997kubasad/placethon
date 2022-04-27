<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<style>
.main_content{
  width: 85%;
  margin-left: 200px;
}
.main_content .header{
  padding: 20px;
  background: #fff;
  color: #717171;
  border-bottom: 1px solid #e0e4e8;
}

.main_content .info{
  margin: 20px;
  color: #717171;
  line-height: 25px;
}

.main_content .info div{
  margin-bottom: 20px;
}
</style>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
	<div class="main_content"> 
        <div class="info">
        	<div>
        		<h1>Add drive details</h1>
			</div>
          <div class="container">
          		<form action="AddDriveServlet" method="POST">
          		<div class="row">
          		<div class="col-5">
    				<label for="drivedesc" class="form-label">Job Description</label>
    				<input type="text" name="drivedesc" class="form-control" id="drivedesc" >
  				</div>
  			<div class="col-3">
    			<label for="drivelocation" class="form-label">Drive Location</label>
    			<input type="text" name="drivelocation" class="form-control" id="drivelocation">
  			</div>
  			</div>
  			<div class="row">
  				<div class="col-5">
    				<label for="drivestartdate" class="form-label">Drive Start Date</label>
    				<input type="date" name="drivestartdate" class="form-control" id="drivestartdate" >
  				</div>
  				<div class="col-5">
    				<label for="driveenddate" class="form-label">Drive End Date</label>
    				<input type="date" name="driveenddate" class="form-control" id="driveenddate" >
  				</div>
  			</div>
  			<div class="row">
  				<div class="col-5">
    				<label for="criteria" class="form-label">Criteria</label>
    				<input type="text" name="criteria" class="form-control" id="criteria" >
  				</div>
  				<div class="col-5">
    				<label for="CTC" class="form-label">CTC</label>
    				<input type="text" name="CTC" class="form-control" id="CTC" >
  				</div>
  			</div>
 		<div class="row">
  				<div class="col-5">
    				<label for="experience" class="form-label">Experience</label>
    				<input type="text" name="experience" class="form-control" id="experience" >
  				</div>
  				<div class="col-5">
    				<label for="jobtype" class="form-label">Job Type</label>
    				<input type="text" name="jobtype" class="form-control" id="jobtype" >
  				</div>
  			</div>
  			<div class="row">
  				<div class="col-5">
    				<label for="driveprocess" class="form-label">Drive Process</label>
    				<input type="text" name="driveprocess" class="form-control" id="driveprocess" >
  				</div>
  				<div class="col-5">
    				<label for="companyname" class="form-label">Company Name</label>
    				<input type="text" name="companyname" value="${rec.reccompname}" class="form-control" id="companyname" >
  				</div>
  			</div>
  			<div class="row">
  			<label for="jobResponsibilities">Job Responsibilities</label>
  				<textarea class="form-control" name="jobResponsibilities" placeholder="Responsibilities" id="jobResponsibilities"></textarea>
  			</div>
  			
    				<input type="hidden" type="text" name="recid" value="${rec.recid}" class="form-control">
  			<button type="submit" class="btn btn-primary">Add Drive</button>
  			<div>
  			<b>${result}</b>
  			</div>
  			
        </form>
          </div>
      </div>
    </div>
</body>
</html>