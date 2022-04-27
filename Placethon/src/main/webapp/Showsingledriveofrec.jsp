<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drive Details</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
       <div class="card" style="width: 40rem;">
  		
  				<h4>${singledriveofrec.drivedesc}</h4>
    			<p><b>Company Name:${singledriveofrec.companyname}</b></p>
    			<p><b>Location: ${singledriveofrec.drivelocation}</b></p>
    			<p><b>CTC:${singledriveofrec.CTC}</b></p>
  			<hr>
  			<div class="card-body">
    			<div>
    				<p>Drive Start Date:${singledriveofrec.drivestartdate}</p>
    				<p>Drive End Date:${singledriveofrec.driveenddate}</p>
    				<p>Criteria:${singledriveofrec.criteria}</p>
    				<p>Experience:${singledriveofrec.experience}</p>
    				<p>Job Type:${singledriveofrec.jobtype}</p>
    				<p>Drive Process:${singledriveofrec.driveprocess}</p>
    				<p>Job Responsibilities:${singledriveofrec.jobResponsibilities}</p>	
  						<form action="Studetailspartidriveservlet" method="POST">
  		<input type="hidden" name="driveid" value="${singledriveofrec.driveid}"/>
  		<div class="mb-3 formfield">
    					<button type="submit" class="btn btn-primary">Check Candidates</button>
  						</div>
    				</form>
    			</div>
  </div>
  
</div>

        </div>
    </div>
</body>
</html>