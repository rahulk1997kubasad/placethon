<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drive Details of Recruiter</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
         <form action="Drivedetailsofrecruiter" method="get">
         <input type="hidden" name="recid" value="${rec.recid}">
        <button type="submit" class="btn btn-primary">Show Drives</button>
			<table>
    			<tr>
    			<th>Drive Description</th>
    			<th>Drive Location</th>
    			<th>Company Name</th>
    			<th>CTC</th>
    			<th>Action</th>
    			</tr>
    			<tbody>
    			<c:forEach var="singledriveofrecruiter" items="${singledriveofrecruiter}" >
        			<tr>
            		<td><c:out value="${singledriveofrecruiter.drivedesc}"/></td>
    				<td><c:out value="${singledriveofrecruiter.drivelocation}"/></td>
    				<td><c:out value="${singledriveofrecruiter.companyname}"/></td>
    				<td><c:out value="${singledriveofrecruiter.CTC}"/></td>
    				<td><a href="Showsingledriveofrecservlet?driveid=<c:out value='${singledriveofrecruiter.driveid}'/>">Check</a></td>
    				</tr>
    			</c:forEach>
    			</tbody>
    		</table>
    		</form>
        </div>
    </div>
</body>
</html>