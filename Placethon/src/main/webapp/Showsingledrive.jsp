<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Single Drive</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="nav1.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
       <div class="card" style="width: 40rem;">
  		
  				<h4>${singledrive.drivedesc}</h4>
    			<p><b>Company Name:${singledrive.companyname}</b></p>
    			<p><b>Location: ${singledrive.drivelocation}</b></p>
    			<p><b>CTC:${singledrive.CTC}</b></p>
  			<hr>
  			<div class="card-body">
    			<div>
    				<p>Drive Start Date:${singledrive.drivestartdate}</p>
    				<p>Drive End Date:${singledrive.driveenddate}</p>
    				<p>Criteria:${singledrive.criteria}</p>
    				<p>Experience:${singledrive.experience}</p>
    				<p>Job Type:${singledrive.jobtype}</p>
    				<p>Drive Process:${singledrive.driveprocess}</p>
    				<p>Job Responsibilities:${singledrive.jobResponsibilities}</p>
    				<p style="color:red;"><b>Note:Apply only if you are eligible</b></p>
    				
    					
  						<form action="AddapplieddriveServlet" method="POST">
  		<input type="hidden" name="driveid" value="${singledrive.driveid}"/>
  		<input type="hidden" name="recid" value="${singledrive.recid}"/>
  		<input type="hidden" name="stuid" value="${stu.stuid}"/>
  		<div class="mb-3 formfield">
    					<button type="submit" class="btn btn-primary">Apply</button>
  						</div>
    				<div><b>${result1}</b></div>
    				</form>
    			</div>
  </div>
  
</div>

        </div>
    </div>
</body>
</html>