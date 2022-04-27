<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recruiter - Home</title>
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
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        	<div>
        		<h2 style="text-align:center;"><b>Recruiter-Home</b></h2>
        		<p style="text-align:center;"><b>WELCOME ${rec.recfullname}</b></p>
			</div>
		</div>
    </div>


   
</body>
</html> 