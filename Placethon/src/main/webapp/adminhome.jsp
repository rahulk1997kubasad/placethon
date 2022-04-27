<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="adminnav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
        	<div>
        		<h2 style="text-align:center;"><b>Admin-Home</b></h2>
        		<p style="text-align:center;"><b>WELCOME ${Adminlogin.adminemail}</b></p>
			</div>
		</div>
    </div>
</body>
</html>