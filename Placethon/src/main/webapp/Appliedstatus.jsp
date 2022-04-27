<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
<style type="text/css">
h3 {text-align: center;}
a	{text-align: center;}	
</style>
</head>
<body>
	<jsp:include page="nav1.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
			<h3>${result1}</h3>
			<a href="showApplieddriveofstudent.jsp">Check Drive Details</a>
        </div>
    </div>
</body>
</html>