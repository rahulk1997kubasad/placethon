<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="nav1.jsp"></jsp:include>
	<div class="main_content">
        <div class="header">Welcome!! Have a nice day.</div>  
        <div class="info">
         <form action="Drivedetailsofstudent" method="get">
         <input type="hidden" name="stuid" value="${stu.stuid}">
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
    			<c:forEach var="showdrivesStudent" items="${showdrivesStudent}"  >
        			<tr>
            		<td><c:out value="${showdrivesStudent.drivedesc}"/></td>
    				<td><c:out value="${showdrivesStudent.drivelocation}"/></td>
    				<td><c:out value="${showdrivesStudent.companyname}"/></td>
    				<td><c:out value="${showdrivesStudent.CTC}"/></td>
    				<td><a href="Showsingledriveservlet?driveid=<c:out value='${showdrivesStudent.driveid}'/>">Check</a></td>
    				</tr>
    			</c:forEach>
    			</tbody>
    		</table>
    		</form>
        </div>
    </div>
</body>
</html>